package com.acme.rn.cliente;

import java.io.IOException;

import com.acme.ado.classesGerais.IRepositorioRegistro;
import com.acme.ado.classesGerais.RepositorioRegistro;
import com.acme.ado.conta.RepositorioContaMilhagem;
import com.acme.excecoes.ExcecaoObjetoExistente;
import com.acme.excecoes.ExcecaoObjetoInexistente;
import com.acme.excecoes.ExcecaoValorInvalido;
import com.acme.rn.conta.ControladorContaMilhagem;
import com.acme.rn.conta.IdentificadorConta;

public class ControladorCliente {
	private static IRepositorioRegistro<Cliente> rc = new RepositorioRegistro<Cliente>();// Declaracao
	// e
	// inicializacao
	// dos
	// atributos
	private static RepositorioContaMilhagem rcm = new RepositorioContaMilhagem();

	public static void incluir(Cliente cliente)
			throws ExcecaoValorInvalido, ExcecaoObjetoExistente, ExcecaoObjetoInexistente, IOException, ClassNotFoundException {// Metodo
		// para
		// incluir
		// cliente
		
		cliente.validar();
		rc.incluir(cliente);// Invoca o metodo incluir do repositorio e
							// inclui o cliente ao repositorio
		
			ControladorContaMilhagem.inserir(cliente.getCpf());
		
			
		 // Inseri o
			// cliente a
			// conta
			// mediante o
			// controlador
			// conta
			// milhagem
	}
	// }

	public static void alterar(Cliente cliente) throws ExcecaoValorInvalido, ExcecaoObjetoExistente,
			ExcecaoObjetoInexistente, IOException, ClassNotFoundException {// Metodo
		// para
		// alterar
		// cliente
		cliente.validar();
		rc.alterar(cliente.getCpf().getCpf(), cliente);// Invoca o metodo
														// alterar do
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
		rcm.alterar(id, ControladorContaMilhagem.buscar(id)); // Invoca
																// o
		// metodo
		// alterar
		// do
		// repositorio
		// para
		// alterar a
		// conta do
		// cliente

	}
	// }

	public static void excluir(Cpf cpf) throws ExcecaoObjetoInexistente, NumberFormatException, ExcecaoValorInvalido {// Metodo
																														// para
																														// excluir
		// cliente
		if (cpf == null) {// Verifica se o cpf recebido e nulo
			System.out.println("Cpf Nulo. Impossivel excluir o cliente");// Caso
																			// seja
			// entao imprimi
			// mensagem de
			// erro
		} else {// Caso contrario
			rc.excluir(cpf.getCpf());// Invoca o metodo excluir do repositorio e
										// exclui o
			// cliente
			IdentificadorConta id = new IdentificadorConta(Long.parseLong(cpf.getCpf()));// Atribui
																							// o
																							// cpf
																							// do
																							// cliente
																							// como
																							// identificador
																							// conta

			rcm.excluir(id); // Invoca o
								// metdo
								// excluir
								// do
								// repositorio
								// para
			// excluir a conta do cliente
		}
	}

	public static Cliente buscar(Cpf cpf) throws ExcecaoObjetoInexistente, ClassNotFoundException, IOException {// Metodo
		// para
		// buscar
		// cliente
		// por
		// cpf
		Cliente c = null;// Inicializa com um cliente nulo
		if (cpf == null) {// Verifica se o cpf recebido e nulo
			System.out.println("Cpf Nulo. Impossivel buscar");// Caso seja entao
																// imprimi
																// mensagem de
																// erro
		} else {// caso contrario
			c = rc.buscar(cpf.getCpf());// Atribui ao cliente o cliente
										// encontrado pelo
			// metodo buscar do repositorio com o cpf dado
		}
		return c;// Retorna o cliente
	}

	public static void buscarTodos() {// Metodo para buscas todos os clientes
		rc.buscarTodos();// Invoca o metodo buscar todos do repositorio
	}
}
