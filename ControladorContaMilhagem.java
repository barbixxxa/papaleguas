package com.acme.rn.conta;

import java.io.IOException;
import java.util.Date;

import com.acme.ado.classesGerais.IRepositorioRegistro;
import com.acme.ado.classesGerais.RepositorioRegistro;
import com.acme.excecoes.ExcecaoObjetoExistente;
import com.acme.excecoes.ExcecaoObjetoInexistente;
import com.acme.excecoes.ExcecaoRegraInvalida;
import com.acme.excecoes.ExcecaoValorInvalido;
import com.acme.rn.cliente.ControladorCliente;
import com.acme.rn.cliente.Cpf;

public class ControladorContaMilhagem {
	private static IRepositorioRegistro<ContaMilhagem> rcm = new RepositorioRegistro<ContaMilhagem>();// Declaracao
	// e
	// inicializacao
	// dos
	// atributos

	public static void inserir(Cpf cpf) throws ExcecaoValorInvalido, ExcecaoObjetoExistente, ExcecaoObjetoInexistente,
			IOException, ClassNotFoundException {// Metodo para inserir
		// Conta pelo cpf
		ControladorCliente.buscar(cpf).validar();
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
		cm.validar();
		rcm.incluir(cm);// Atribui ao repositorio de contas a conta
						// criada
	}
	// }
	// }

	public static void creditar(IdentificadorConta id, double valor) throws ClassNotFoundException,
			ExcecaoValorInvalido, ExcecaoObjetoInexistente, IOException, ExcecaoRegraInvalida, ExcecaoObjetoExistente {// Metodo
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

			rcm.buscar(Long.toString(id.getIdentificadorConta())).creditar(valor);// Procura
																					// no
																					// repositorio
																					// pela
			// conta com esse cpf e
			// identificador e entao credita
			// o valor recebido
			Date data = new Date();// Inicializa uma nova data
			MovimentoContaCredito mcc = new MovimentoContaCredito(
					rcm.buscar((Long.toString(id.getIdentificadorConta()))),
					rcm.buscar((Long.toString(id.getIdentificadorConta()))), valor, "Oi", data);// Inicializa
			// um
			// novo
			// movimento
			// conta
			ControladorMovimentoConta.inserir(mcc);// Inseri o movimento ao
													// repositorio pelo
													// controlador conta
		}
	}

	public static void debitar(IdentificadorConta id, double valor) throws ExcecaoValorInvalido, ExcecaoObjetoExistente,
			ExcecaoObjetoInexistente, IOException, ClassNotFoundException, ExcecaoRegraInvalida {// Metodo
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

			rcm.buscar(Long.toString(id.getIdentificadorConta())).debitar(valor);// Procura
																					// no
																					// repositorio
																					// pela
			// conta com esse cpf e
			// identificador e entao debita
			// o valor recebido
			Date data = new Date();// Inicializa uma nova data
			MovimentoContaDebito mcd = new MovimentoContaDebito(rcm.buscar((Long.toString(id.getIdentificadorConta()))),
					rcm.buscar((Long.toString(id.getIdentificadorConta()))), valor, "Oi", data);// Inicializa
			// um
			// novo
			// movimento
			// conta
			ControladorMovimentoConta.inserir(mcd);// Inseri o movimento ao
													// repositorio pelo
													// controlador conta
		}
	}

	public static void transferir(IdentificadorConta idDebito, IdentificadorConta idCredito, double valor)
			throws ClassNotFoundException, ExcecaoRegraInvalida, ExcecaoObjetoInexistente, IOException,
			ExcecaoValorInvalido, ExcecaoObjetoExistente {// Metodo
															// para
															// transferir
		if (idDebito == null || idCredito == null) { // Verifica se o
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

			rcm.buscar(Long.toString(idDebito.getIdentificadorConta())).transferir(valor,
					rcm.buscar(Long.toString(idCredito.getIdentificadorConta())));// Procura
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
			MovimentoContaTransferencia mct = new MovimentoContaTransferencia(
					rcm.buscar((Long.toString(idDebito.getIdentificadorConta()))),
					rcm.buscar((Long.toString(idCredito.getIdentificadorConta()))), valor, "Oi", data);// Inicializa
			// o
			// atributo
			// do
			// tipo
			// movimento
			// conta
			ControladorMovimentoConta.inserir(mct);// Inseri o movimento conta
													// ao
													// repositorio pelo
													// controlador conta
		}
	}

	public static ContaMilhagem buscar(IdentificadorConta id)
			throws ExcecaoObjetoInexistente, ClassNotFoundException, IOException {// Metodo
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

			cm = rcm.buscar(Long.toString(id.getIdentificadorConta()));// Atribui
																		// a
																		// conta
																		// nula
																		// a
																		// conta
																		// encontrada
			// pelo buscar do repositorio
		}
		return cm;// Retorna a conta
	}

	public static void BuscarTodos() {// Metodo para buscar todos
		rcm.buscarTodos();// Invoca o metodo buscar todos do repositorio
	}

}
