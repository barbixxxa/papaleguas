package com.acme.rn.conta;

import java.util.Date;

import com.acme.ado.conta.RepositorioContaMilhagem;
import com.acme.rn.cliente.ControladorCliente;
import com.acme.rn.cliente.Cpf;

public class ControladorContaMilhagem {
	private static RepositorioContaMilhagem rcm = new RepositorioContaMilhagem();// Declaracao
																					// e
																					// inicializacao
																					// dos
																					// atributos

	public static void inserir(Cpf cpf) {// Metodo para inserir Conta pelo cpf
											// do cliente
		if (cpf == null) {// Verifica se o cpf recebido e nulo
			System.out.println("Cpf Nulo. Impossivel Inserir");// Caso seja
																// entao imprimi
																// mensagem de
																// erro
		} else {// Caso contrario
			if ((ControladorCliente.buscar(cpf)) == null) {// Se o metodo buscar
															// do controlador
															// cliente nao
															// encontrar nada
				System.out.println("Cliente nao cadastrado.");// Imprimi
																// mensagem
			} else {// Caso contrario
				IdentificadorConta id = new IdentificadorConta(
						Long.parseLong(ControladorCliente.buscar(cpf).getCpf().getCpf()));// Atribui
																							// o
																							// cpf
																							// do
																							// cliente
																							// como
																							// identificador
																							// conta
				ContaMilhagem cm = new ContaMilhagem(id, ControladorCliente.buscar(cpf));// Cria
																							// uma
																							// conta
																							// com
																							// o
																							// identificador
																							// conta
																							// e
																							// o
																							// cliente
				rcm.incluir(cm);// Atribui ao repositorio de contas a conta
								// criada
			}
		}
	}

	public static void creditar(IdentificadorConta id, double valor) {// Metodo
																		// para
																		// creditar
		if (id == null) { // Verifica se o identificador conta e nulo
			System.out.println("Identificador Conta Nulo. Impossivel Creditar");// Caso
																				// seja
																				// entao
																				// imprimi
																				// mensagem
																				// de
																				// erro
		}

		else {// Caso contrario

			rcm.buscar(id).creditar(valor);// Procura no repositorio pela
											// conta com esse cpf e
											// identificador e entao credita
											// o valor recebido
			Date data = new Date();// Inicializa uma nova data
			MovimentoConta mc = new MovimentoConta(rcm.buscar(id), valor, "Oi", data);// Inicializa
																						// um
																						// novo
																						// movimento
																						// conta
			ControladorMovimentoConta.inserir(mc);// Inseri o movimento ao
													// repositorio pelo
													// controlador conta
		}
	}

	public static void debitar(IdentificadorConta id, double valor) {// Metodo
																		// para
																		// debitar
		if (id == null) { // Verifica se o identificador conta e nulo
			System.out.println("Identificador Conta Nulo. Impossivel Debitar");// Caso
																				// seja
																				// entao
																				// imprimi
																				// mensagem
																				// de
																				// erro
		}

		else {// Caso contrario

			rcm.buscar(id).debitar(valor);// Procura no repositorio pela
											// conta com esse cpf e
											// identificador e entao debita
											// o valor recebido
			Date data = new Date();// Inicializa uma nova data
			MovimentoConta mc = new MovimentoConta(rcm.buscar(id), valor, "Oi", data);// Inicializa
																						// um
																						// novo
																						// movimento
																						// conta
			ControladorMovimentoConta.inserir(mc);// Inseri o movimento ao
													// repositorio pelo
													// controlador conta
		}
	}

	public static void transferir(IdentificadorConta idDebito, IdentificadorConta idCredito, double valor) {// Metodo
																											// para
																											// transferir
		if (idDebito == null  || idCredito == null) { // Verifica se o
																// identificador
																// conta e nulo
			System.out.println("Identificador Conta Nulo. Impossivel Transferir");// Caso
																					// seja
																					// entao
																					// imprimi
																					// mensagem
																					// de
																					// erro
		}

		else {// Caso contrario

			rcm.buscar(idDebito).transferir(valor, rcm.buscar(idCredito));// Procura
																			// no
																			// repositorio
																			// pela
																			// conta
																			// com
																			// esse
																			// cpf
																			// e
																			// identificador
																			// e
																			// entao
																			// transfere
																			// o
																			// valor
																			// recebido
			Date data = new Date();// Inicializa o atributo do tipo data
			MovimentoConta mc = new MovimentoConta(rcm.buscar(idDebito), valor, // Inicializa
																				// o
																				// atributo
																				// do
																				// tipo
																				// movimento
																				// conta
					"Oi", data);
			ControladorMovimentoConta.inserir(mc);// Inseri o movimento conta ao
													// repositorio pelo
													// controlador conta
		}
	}

	public static ContaMilhagem buscar(IdentificadorConta id) {// Metodo
																				// para
																				// buscar
		ContaMilhagem cm = null;// Inicializa um atributo nulo do tipo conta
		if (id == null) {// Verifica se o identificador e nulo
			System.out.println("Identificador Conta Nulo. Impossivel Buscar");// Caso
																				// seja
																				// entao
																				// imprimi
																				// mensagem
																				// de
																				// erro

		} else {// Caso contrario

			cm = rcm.buscar(id);// Atribui a conta nula a conta encontrada
								// pelo buscar do repositorio
		}
		return cm;// Retorna a conta
	}

	public static void BuscarTodos() {// Metodo para buscar todos
		rcm.buscarTodos();// Invoca o metodo buscar todos do repositorio
	}

}
