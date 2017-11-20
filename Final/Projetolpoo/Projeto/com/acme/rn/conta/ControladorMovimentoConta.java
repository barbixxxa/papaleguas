package com.acme.rn.conta;

import java.io.IOException;

import com.acme.ado.conta.RepositorioMovimentoConta;
import com.acme.excecoes.ExcecaoObjetoExistente;
import com.acme.excecoes.ExcecaoObjetoInexistente;
import com.acme.excecoes.ExcecaoValorInvalido;

public class ControladorMovimentoConta {
	/**
	 * Declaracao e inicializacao dos atributos
	 */
	private static RepositorioMovimentoConta rmc = new RepositorioMovimentoConta();

	/**
	 * Metodo para inseir MovimentoConta, validando o MovimentoConta e invocando
	 * o metodo inserir do repositorio.
	 * 
	 * @param mc
	 * @throws ExcecaoValorInvalido
	 * @throws ExcecaoObjetoExistente
	 * @throws ExcecaoObjetoInexistente
	 * @throws IOException
	 */
	public static void inserir(MovimentoConta mc)
			throws ExcecaoValorInvalido, ExcecaoObjetoExistente, ExcecaoObjetoInexistente, IOException {

		mc.validar();
		rmc.incluir(mc);
	}
	
	public static MovimentoConta BuscarTodos() throws IOException, ClassNotFoundException {
		return rmc.buscarTodos();
	}
}
