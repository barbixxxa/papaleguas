package com.acme.rn.conta;

import java.io.IOException;
import java.util.Date;

import com.acme.ado.conta.RepositorioContaMilhagem;
import com.acme.excecoes.ExcecaoObjetoExistente;
import com.acme.excecoes.ExcecaoObjetoInexistente;
import com.acme.excecoes.ExcecaoRegraInvalida;
import com.acme.excecoes.ExcecaoValorInvalido;
import com.acme.rn.cliente.ControladorCliente;
import com.acme.rn.cliente.Cpf;

public class ControladorContaMilhagem {
	/**
	 * Declaracao e inicializacao dos atributos
	 */
	private static RepositorioContaMilhagem rcm = new RepositorioContaMilhagem();
	private static ContaMilhagem cm = null;
	private static ContaMilhagem cmDois = null;

	/**
	 * Metodo para inserir ContaMilhagem pelo Cpf do Cliente, validando a
	 * ContaMilhagem e invocando o metodo incluir do repositorio
	 * 
	 * @param cpf
	 * @throws ExcecaoValorInvalido
	 * @throws ExcecaoObjetoExistente
	 * @throws ExcecaoObjetoInexistente
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static void inserir(Cpf cpf) throws ExcecaoValorInvalido, ExcecaoObjetoExistente, ExcecaoObjetoInexistente,
			IOException, ClassNotFoundException {
		ControladorCliente.buscar(cpf).validar();
		IdentificadorConta id = new IdentificadorConta(
				Long.parseLong(ControladorCliente.buscar(cpf).getCpf().getCpf()));
		ContaMilhagem cm = new ContaMilhagem(id, ControladorCliente.buscar(cpf));
		cm.validar();
		rcm.incluir(cm);
	}

	/**
	 * Metodo para creditar na ContaMilhagem pelo IdentificadorConta, inserindo
	 * um MovimentoConta
	 * 
	 * @param id
	 * @param valor
	 * @throws ClassNotFoundException
	 * @throws ExcecaoValorInvalido
	 * @throws ExcecaoObjetoInexistente
	 * @throws IOException
	 * @throws ExcecaoRegraInvalida
	 * @throws ExcecaoObjetoExistente
	 */
	public static void creditar(IdentificadorConta id, double valor) throws ClassNotFoundException,
			ExcecaoValorInvalido, ExcecaoObjetoInexistente, IOException, ExcecaoRegraInvalida, ExcecaoObjetoExistente {
		if (id == null) {
			throw new ExcecaoValorInvalido("erro.ControladorContaMilhagem.creditar.valorInvalido");
		}

		else {
			
			cm = rcm.buscar(id);
			cm.creditar(valor);
			rcm.alterar(id, cm);
			Date data = new Date();
			MovimentoContaCredito mcc = new MovimentoContaCredito(rcm.buscar(id), rcm.buscar(id), valor, "Oi", data);
			ControladorMovimentoConta.inserir(mcc);
		}
	}

	/**
	 * Metodo para debitar na ContaMilhagem pelo IdentificadorConta, inserindo
	 * um MovimentoConta
	 * 
	 * @param id
	 * @param valor
	 * @throws ExcecaoValorInvalido
	 * @throws ExcecaoObjetoExistente
	 * @throws ExcecaoObjetoInexistente
	 * @throws IOException
	 * @throws ClassNotFoundException
	 * @throws ExcecaoRegraInvalida
	 */
	public static void debitar(IdentificadorConta id, double valor) throws ExcecaoValorInvalido, ExcecaoObjetoExistente,
			ExcecaoObjetoInexistente, IOException, ClassNotFoundException, ExcecaoRegraInvalida {
		if (id == null) {
			throw new ExcecaoValorInvalido("erro.ControladorContaMilhagem.debitar.valorInvalido");
		}

		else {
			cm = rcm.buscar(id);
			cm.debitar(valor);
			rcm.alterar(id, cm);
			

			Date data = new Date();
			MovimentoContaDebito mcd = new MovimentoContaDebito(rcm.buscar(id), rcm.buscar(id), valor, "Oi", data);
			ControladorMovimentoConta.inserir(mcd);
		}
	}

	/**
	 * Metodo para transferir nas ContasMilhagens pelos IdentificadoresConta,
	 * inserindo um MovimentoConta
	 * 
	 * @param idDebito
	 * @param idCredito
	 * @param valor
	 * @throws ClassNotFoundException
	 * @throws ExcecaoRegraInvalida
	 * @throws ExcecaoObjetoInexistente
	 * @throws IOException
	 * @throws ExcecaoValorInvalido
	 * @throws ExcecaoObjetoExistente
	 */
	public static void transferir(IdentificadorConta idDebito, IdentificadorConta idCredito, double valor)
			throws ClassNotFoundException, ExcecaoRegraInvalida, ExcecaoObjetoInexistente, IOException,
			ExcecaoValorInvalido, ExcecaoObjetoExistente {
		if (idDebito == null || idCredito == null) {
			throw new ExcecaoValorInvalido("erro.ControladorContaMilhagem.transferir.valorInvalido");
		}

		cm = rcm.buscar(idDebito);
		cmDois = rcm.buscar(idCredito);
		cm.transferir(valor, cmDois);
		rcm.alterar(idDebito, cm);
		rcm.alterar(idCredito, cmDois);
		
		rcm.buscar(idDebito).transferir(valor, rcm.buscar(idCredito));
		Date data = new Date();
		MovimentoContaTransferencia mct = new MovimentoContaTransferencia(rcm.buscar(idDebito), rcm.buscar(idCredito),
				valor, "Oi", data);
		ControladorMovimentoConta.inserir(mct);
	}

	/**
	 * Metodo para buscar ContaMilhagem pelo IdentificadorConta, invocando o
	 * metodo buscar do repositorio
	 * 
	 * @param id
	 * @return
	 * @throws ExcecaoObjetoInexistente
	 * @throws ClassNotFoundException
	 * @throws IOException
	 * @throws ExcecaoValorInvalido
	 */
	public static ContaMilhagem buscar(IdentificadorConta id)
			throws ExcecaoObjetoInexistente, ClassNotFoundException, IOException, ExcecaoValorInvalido {
		ContaMilhagem cm = null;
		if (id == null) {
			throw new ExcecaoValorInvalido("erro.ControladorContaMilhagem.buscar.valorInvalido");

		} else {

			cm = rcm.buscar(id);

		}
		return cm;
	}

	/**
	 * Metodo para buscar todas as ContasMilhagens, invocando o metodo
	 * buscarTodos do repositorio
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static ContaMilhagem BuscarTodos() throws IOException, ClassNotFoundException {
		return rcm.buscarTodos();
	}

}