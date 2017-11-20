package com.acme.rn.cliente;
//OK

import com.acme.ado.cliente.RepositorioCliente;
import com.acme.ado.conta.RepositorioContaMilhagem;

import com.acme.rn.conta.ControladorContaMilhagem;
import com.acme.rn.conta.IdentificadorConta;

public class ControladorCliente {
	private static RepositorioCliente rc = new RepositorioCliente();// Declaracao
																	// e
																	// inicializacao
																	// dos
																	// atributos
	private static RepositorioContaMilhagem rcm = new RepositorioContaMilhagem();

	public static void incluir(Cliente cliente) {// Metodo para incluir cliente
		if (cliente == null) {// Verifica se o cliente recebido e nulo
			System.out.println("Cliente Nulo. Impossivel incluir");// Caso seja
																	// entao
																	// imprimi
																	// mensagem
																	// de erro
		} else {// Caso contrario
			rc.incluir(cliente);// Invoca o metodo incluir do repositorio e
								// inclui o cliente ao repositorio
			ControladorContaMilhagem.inserir(cliente.getCpf());// Inseri o
																// cliente a
																// conta
																// mediante o
																// controlador
																// conta
																// milhagem
		}
	}

	public static void alterar(Cliente cliente) {// Metodo para alterar cliente
		if (cliente == null) {// Verifica se o cliente recebido e nulo
			System.out.println("Cliente Nulo. Impossivel alterar");// Caso seja
																	// entao
																	// imprimir
																	// mensagem
																	// de erro
		} else {// Caso contrario
			rc.alterar(cliente.getCpf(), cliente);// Invoca o metodo alterar do
													// repositorio para alterar
													// o cliente
			IdentificadorConta id = new IdentificadorConta(
					Long.parseLong(ControladorCliente.buscar(cliente.getCpf()).getCpf().getCpf()));// Atribui
																									// o
																									// cpf
																									// do
																									// cliente
																									// como
																									// identificador
																									// conta
			rcm.alterar(id, ControladorContaMilhagem.buscar(id)); // Invoca o
																	// metodo
																	// alterar
																	// do
																	// repositorio
																	// para
																	// alterar a
																	// conta do
																	// cliente

		}
	}

	public static void excluir(Cpf cpf) {// Metodo para excluir cliente
		if (cpf == null) {// Verifica se o cpf recebido e nulo
			System.out.println("Cpf Nulo. Impossivel excluir");// Caso seja
																// entao imprimi
																// mensagem de
																// erro
		} else {// Caso contrario
			rc.excluir(cpf);// Invoca o metodo excluir do repositorio e exclui o
							// cliente
			IdentificadorConta id = new IdentificadorConta(Long.parseLong(cpf.getCpf()));// Atribui
																							// o
																							// cpf
																							// do
																							// cliente
																							// como
																							// identificador
																							// conta

			rcm.excluir(id); // Invoca o metdo excluir do repositorio para
								// excluir a conta do cliente
		}
	}

	public static Cliente buscar(Cpf cpf) {// Metodo para buscar cliente por cpf
		Cliente c = null;// Inicializa com um cliente nulo
		if (cpf == null) {// Verifica se o cpf recebido e nulo
			System.out.println("Cpf Nulo. Impossivel buscar");// Caso seja entao
																// imprimi
																// mensagem de
																// erro
		} else {// caso contrario
			c = rc.buscar(cpf);// Atribui ao cliente o cliente encontrado pelo
								// metodo buscar do repositorio com o cpf dado
		}
		return c;// Retorna o cliente
	}

	public static void buscarTodos() {// Metodo para buscas todos os clientes
		rc.buscarTodos();// Invoca o metodo buscar todos do repositorio
	}
}
