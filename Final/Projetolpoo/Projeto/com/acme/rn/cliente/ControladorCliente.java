package com.acme.rn.cliente;

import java.io.IOException;

import com.acme.ado.cliente.RepositorioCliente;
import com.acme.ado.conta.RepositorioContaMilhagem;
import com.acme.excecoes.ExcecaoObjetoExistente;
import com.acme.excecoes.ExcecaoObjetoInexistente;
import com.acme.excecoes.ExcecaoValorInvalido;
import com.acme.rn.conta.ControladorContaMilhagem;
import com.acme.rn.conta.IdentificadorConta;

public class ControladorCliente {
	/**
	 * Declaracao e inicializacao dos atributos
	 */
	private static RepositorioContaMilhagem rcm = new RepositorioContaMilhagem();
	private static RepositorioCliente rc = new RepositorioCliente();

	/**
	 * Metodo para incluir Cliente, validando o cliente e invocando o metodo
	 * incluir do repositorio. Inseri a conta associada ao cliente invocando o
	 * ControladorContaMilhagem
	 * 
	 * @param cliente
	 * @throws ExcecaoValorInvalido
	 * @throws ExcecaoObjetoExistente
	 * @throws ExcecaoObjetoInexistente
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */

	public static void incluir(Cliente cliente) throws ExcecaoValorInvalido, ExcecaoObjetoExistente,
			ExcecaoObjetoInexistente, IOException, ClassNotFoundException {

		cliente.validar();
		rc.incluir(cliente);

		ControladorContaMilhagem.inserir(cliente.getCpf());

	}

	/**
	 * Metodo para alterar Cliente, validando o Cliente e invocando o metodo
	 * alterar do repositorio. Altera os dados da ContaMilhagem associada a esse
	 * Cliente
	 * 
	 * @param cliente
	 * @throws ExcecaoValorInvalido
	 * @throws ExcecaoObjetoExistente
	 * @throws ExcecaoObjetoInexistente
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */

	public static void alterar(Cpf cpf, Cliente clienteNovo) throws ExcecaoValorInvalido, ExcecaoObjetoExistente,
			ExcecaoObjetoInexistente, IOException, ClassNotFoundException {

		clienteNovo.validar();
		//ControladorCliente.excluir(cpf);
		//ControladorCliente.incluir(clienteNovo);
		rc.alterar(cpf, clienteNovo);
		IdentificadorConta id = new IdentificadorConta(Long.parseLong(cpf.getCpf()));
		rcm.excluir(id);
		ControladorContaMilhagem.inserir(cpf);

		rcm.alterar(id, ControladorContaMilhagem.buscar(id));

	}

	/**
	 * Metodo para excluir Cliente e a sua conta, validando o cpf recebido e
	 * invocando o metodo excluir do repositorio. Inseri a conta associada ao
	 * cliente invocando o ControladorContaMilhagem
	 * 
	 * @param cpf
	 * @throws ExcecaoObjetoInexistente
	 * @throws NumberFormatException
	 * @throws ExcecaoValorInvalido
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */

	public static void excluir(Cpf cpf) throws ExcecaoObjetoInexistente, NumberFormatException, ExcecaoValorInvalido, ClassNotFoundException, IOException {
		if (cpf == null) {
			throw new ExcecaoValorInvalido("erro.ControladorCliente.excluir.valorInvalido");

		} else {
			rc.excluir(cpf);
			IdentificadorConta id = new IdentificadorConta(Long.parseLong(cpf.getCpf()));

			rcm.excluir(id);
		}
	}

	/**
	 * Metodo para buscar Cliente pelo cpf, validando o cpf recebido e invocando
	 * o metodo buscar do repositorio. Retornando o cliente se for encontrado
	 * 
	 * @param cpf
	 * @return
	 * @throws ExcecaoObjetoInexistente
	 * @throws ClassNotFoundException
	 * @throws IOException
	 * @throws ExcecaoValorInvalido
	 */
	public static Cliente buscar(Cpf cpf)
			throws ExcecaoObjetoInexistente, ClassNotFoundException, IOException, ExcecaoValorInvalido {
		Cliente c = null;
		if (cpf == null) {
			throw new ExcecaoValorInvalido("erro.ControladorCliente.buscar.valorInvalido");
		} else {
			c = rc.buscar(cpf);
		}
		return c;
	}

	/**
	 * Metodo para buscar todos os Clientes existentes, invocando o metodo
	 * buscarTodos do repositorio
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static Cliente buscarTodos() throws ClassNotFoundException, IOException {
		return rc.buscarTodos();
	}
}
