package com.acme.ado.classesGerais;

import com.acme.excecoes.ExcecaoObjetoExistente;
import com.acme.excecoes.ExcecaoObjetoInexistente;
import com.acme.rn.classesGerais.Registro;

public class RepositorioRegistro<Identificavel extends Registro> implements IRepositorioRegistro<Identificavel> {
	private Registro[] identificaveis; // Declaracao dos atributos
	private int quantidade;

	public RepositorioRegistro() { // Construtor que cria um array
		identificaveis = new Registro[150];
		quantidade = 0; // Inicializa o atributo ao iniciar o construtor
	}

	public void incluir(Identificavel novoIdentificavel) throws ExcecaoObjetoExistente, ExcecaoObjetoInexistente { // Metodo
		// para
		// incluir cliente
		if (quantidade < identificaveis.length) { // Verifica se ha espaco no
													// array
			if (buscarIdentificavel(novoIdentificavel.getChave()) == null) { // Verifica
																				// se
																				// o
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
				throw new ExcecaoObjetoExistente(
						"erro.Repositorio." + ".objetoExistente" + novoIdentificavel.getChave());
				// Mensagem
				// de
				// erro
			}
		} else { // Caso nao haja espaco livre
			throw new ExcecaoObjetoExistente("erro.RepositorioCheio." + novoIdentificavel.getChave()); // Mensagem
																										// de
																										// erro
		}
	}

	public Identificavel buscarIdentificavel(String s) { // Metodo
		// para
		// buscar
		// identificavel
		// recebendo string
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
				ident = (Identificavel) identificaveis[i]; // Caso seja entao
				// atribui os dados
				// do cliente
				// encontrado ao cliente nulo
				break; // Sai do loop
			}

		}
		return ident; // Retorna o identificavel
	}

	public Identificavel buscar(String s) throws ExcecaoObjetoInexistente { // Metodo
																			// para
																			// buscar
																			// cliente
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
				ident = (Identificavel) identificaveis[i]; // Caso seja entao
															// atribui os dados
				// do cliente
				// encontrado ao cliente nulo
				break; // Sai do loop
			} else if (ident == null) { // Caso o cliente ainda seja nulo
				throw new ExcecaoObjetoInexistente("erro.Repositorio.objetoInexistente"); // Mensagem
				// de
				// erro
			}
		}
		return ident; // Retorna o cliente
	}

	public boolean excluir(String s) throws ExcecaoObjetoInexistente { // Metodo
																		// para
																		// excluir
																		// cliente
																		// recebendo
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
			throw new ExcecaoObjetoInexistente("erro.Repositorio.objetoInexistente");// Mensagem
			// de
			// erro

		}
		return t; // Retorna o valor logico do atributo
	}

	public boolean alterar(String s, Identificavel novoIdentificavel)
			throws ExcecaoObjetoExistente, ExcecaoObjetoInexistente { // Metodo
		boolean t = false; // para
		// alterar
		// dados
		// do
		// cliente
		if (this.excluir(s)) { // Verifica se existe tal cliente
								// para ser
								// excluido se sim entao o exclui
			this.incluir(novoIdentificavel); // Inclui o cliente novo
			t = true; // Retorna o valor logico verdadeiro
		}
		return t; // Retorna o valor logico falso
	}

	public Identificavel buscarTodos() { // Metodo para listar todos os
		// identificaveis
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

		return null;// identificaveis[0];

	}
}
