package com.acme.ado.cliente;

import java.util.Arrays;
import java.util.List;

import com.acme.rn.cliente.Cliente;
import com.acme.rn.cliente.Cpf;

public class RepositorioCliente {
	private Cliente[] clientes; // Declaracao dos atributos
	private int quantidade;

	public RepositorioCliente() { // Construtor que cria um array
		clientes = new Cliente[150];
		quantidade = 0; // Inicializa o atributo ao iniciar o construtor
	}

	public void incluir(Cliente novoCliente) { // Metodo para incluir cliente
		if (quantidade < clientes.length) { // Verifica se ha espaco no array
			if (buscar(novoCliente.getCpf()) == null) { // Verifica se o cpf do
														// cliente
				// novo nao existe no array
				clientes[quantidade] = novoCliente; // Inclui o cliente a
													// posicao do contador
				// no array
				quantidade++; // Aumenta o contador
				System.out.println("Cliente cadastrado com sucesso.\n"); // Mensagem
																			// de
																			// sucesso
			} else { // Caso o cpf ja exista
				System.out.println("Cliente ja cadastrado.\n"); // Mensagem de
																// erro
			}
		} else { // Caso nao haja espaco livre
			System.out.println("Lista lotada.\n"); // Mensagem de erro
		}
	}

	public Cliente buscar(Cpf cpf) { // Metodo para buscar cliente recebendo o
										// cpf
		Cliente c = null; // Inicializa um cliente nulo
		for (int i = 0; i < quantidade; i++) { // Loop para encontrar a posicao
												// do
			// cliente dentro do array
			if (cpf.getCpf().equals(clientes[i].getCpf().getCpf())) { // Verifica
																		// se o
																		// cpf
																		// do
				// cliente encontrado e
				// igual ao cpf dado
				c = clientes[i]; // Caso seja entao atribui os dados do cliente
									// encontrado ao cliente nulo
				break; // Sai do loop
			} else if (c == null) { // Caso o cliente ainda seja nulo
				System.out.println("Cliente nao cadastrado.\n"); // Mensagem de
																	// erro
			}
		}
		return c; // Retorna o cliente
	}

	public boolean excluir(Cpf cpf) { // Metodo para excluir cliente recebendo o
										// cpf
		boolean t = false; // Inicializa o atributo com valor logico falso
		for (int i = 0; i < quantidade; i++) { // Loop para encontrar a posicao
												// do
			// cliente dentro do array
			if (cpf.getCpf().equals(clientes[i].getCpf().getCpf())) { // Verifica
																		// se o
																		// cpf
																		// do
				// cliente encontrado e
				// igual ao recebido
				clientes[i] = clientes[quantidade]; // Atribui os dados do
													// ultimo
				// cliente ao cliente
				// encontrado, excluindo-o
				clientes[quantidade] = null; // Atribui null ao ultimo cliente
				System.out.println("Exlusao feita com sucesso.\n"); // Mensagem
																	// de
																	// sucesso
				quantidade--; // Diminui o contador
				t = true; // Atribui o valor logico verdadeiro
				break; // Sai do lopp
			}

		}
		if (t == false) { // Verifica o valor logico do atributo
			System.out.println("Cliente nao cadastrado.\n" // Mensagem de erro
					+ "Nao e possivel excluir\n");
		}
		return t; // Retorna o valor logico do atributo
	}

	public boolean alterar(Cpf antigoCliente, Cliente novoCliente) { // Metodo
																		// para
																		// alterar
		// dados do cliente
		if (this.excluir(antigoCliente)) { // Verifica se existe tal cliente
											// para ser
			// excluido se sim entao o exclui
			this.incluir(novoCliente); // Inclui o cliente novo
			return true; // Retorna o valor logico verdadeiro
		}
		return false; // Retorna o valor logico falso
	}

	public void buscarTodos() { // Metodo para listar todos os clientes
								// existentes no array
		List list = Arrays.asList(clientes);
		System.out.println(list);
	}
}
