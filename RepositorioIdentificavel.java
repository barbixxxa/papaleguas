package com.acme.ado.classesGerais;

import com.acme.rn.classesGerais.Identificavel;

public class RepositorioIdentificavel {
	private Identificavel[] identificaveis; // Declaracao dos atributos
	private int quantidade;

	public RepositorioIdentificavel() { // Construtor que cria um array
		identificaveis = new Identificavel[150];
		quantidade = 0; // Inicializa o atributo ao iniciar o construtor
	}

	public void incluir(Identificavel novoIdentificavel) { // Metodo para
															// incluir cliente
		if (quantidade < identificaveis.length) { // Verifica se ha espaco no
													// array
			if (buscar(novoIdentificavel.getChave()) == null) { // Verifica se o
																// cpf do
																// cliente
																// novo nao
																// existe no
																// array
				identificaveis[quantidade] = novoIdentificavel; // Inclui o
																// cliente a
																// posicao do
																// contador
																// no array
				quantidade++; // Aumenta o contador
				System.out.println(novoIdentificavel.getChave() + " cadastrado com sucesso.\n"); // Mensagem
																									// de
																									// sucesso
			} else { // Caso o cpf ja exista
				System.out.println(novoIdentificavel.getChave() + " ja existe no repositorio.\n"); // Mensagem
																									// de
																									// erro
			}
		} else { // Caso nao haja espaco livre
			System.out.println("Repositorio lotado.\n"); // Mensagem de erro
		}
	}

	public Identificavel buscar(String s) { // Metodo para buscar cliente
											// recebendo o
											// cpf
		Identificavel ident = null; // Inicializa um cliente nulo
		for (int i = 0; i < quantidade; i++) { // Loop para encontrar a posicao
												// do
												// cliente dentro do array
			if (identificaveis[i].getChave().equalsIgnoreCase(s)) { // Verifica
																	// se
																	// o
																	// identificavel
																	// do
																	// cliente
																	// encontrado
																	// e
																	// igual ao
																	// cpf dado
				ident = identificaveis[i]; // Caso seja entao atribui os dados
											// do cliente
											// encontrado ao cliente nulo
				break; // Sai do loop
			} else if (ident == null) { // Caso o cliente ainda seja nulo
				System.out.println("Objeto inexistente no repositorio.\n"); // Mensagem
																			// de
																			// erro
			}
		}
		return ident; // Retorna o cliente
	}

	public boolean excluir(String s) { // Metodo para excluir cliente recebendo
										// o
										// cpf
		boolean t = false; // Inicializa o atributo com valor logico falso
		for (int i = 0; i < quantidade; i++) { // Loop para encontrar a posicao
												// do
												// cliente dentro do array
			if (identificaveis[i].getChave().equalsIgnoreCase(s)) { // Verifica
				// se o
				// cpf
				// do
				// cliente encontrado e
				// igual ao recebido
				identificaveis[i] = identificaveis[quantidade]; // Atribui os
																// dados do
																// ultimo
																// cliente ao
																// cliente
																// encontrado,
																// excluindo-o
				identificaveis[quantidade] = null; // Atribui null ao ultimo
													// cliente
				System.out.println("Exclusao feita com sucesso.\n"); // Mensagem
																		// de
																		// sucesso
				quantidade--; // Diminui o contador
				t = true; // Atribui o valor logico verdadeiro
				break; // Sai do lopp
			}

		}
		if (t == false) { // Verifica o valor logico do atributo
			System.out.println("Objeto inexistente no repositorio.\n" // Mensagem
					// de
					// erro
					+ "Nao e possivel excluir\n");
		}
		return t; // Retorna o valor logico do atributo
	}

	public boolean alterar(String s, Identificavel novoIdentificavel) { // Metodo
																		// para
																		// alterar
																		// dados
																		// do
																		// cliente
		if (this.excluir(s)) { // Verifica se existe tal cliente
								// para ser
								// excluido se sim entao o exclui
			this.incluir(novoIdentificavel); // Inclui o cliente novo
			return true; // Retorna o valor logico verdadeiro
		}
		return false; // Retorna o valor logico falso
	}

	public void buscarTodos() { // Metodo para listar todos os identificaveis
								// existentes no array
		for (int i = 0; i < quantidade; i++) {// Imprimi tudo nao nulo existente
												// no array
			if (identificaveis[i] != null) {
				System.out.println(identificaveis[i]);
			}

		}

		if (identificaveis[0] == null) { // Se ha algo no array entao esta na
											// posicao 0
			// Se o elemente desta posicao for nulo entao imprimi
			System.out.println("Repositorio vazio.\n");
		}

	}
}
