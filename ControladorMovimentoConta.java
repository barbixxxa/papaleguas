package com.acme.rn.conta;

import com.acme.ado.conta.RepositorioMovimentoConta;

public class ControladorMovimentoConta {
	private static RepositorioMovimentoConta rmc = new RepositorioMovimentoConta();// Declaracao
																					// e
																					// inicializacao
																					// do
																					// atributo

	public static void inserir(MovimentoConta mc) {// Metodo para inserir um
													// novo movimento conta
		if (mc == null) {// Verifica se o movimento recebido e nulo
			System.out.println("Movimento de Conta Nulo.");// Caso seja imprimi
															// mensagem de erro
		} else {
			rmc.incluir(mc);// Caso contrario atribui o movimento ao repositorio
		}
	}
}
