package com.acme.testes.conta;

import com.acme.ado.conta.RepositorioContaMilhagem;

import com.acme.rn.cliente.Cliente;
import com.acme.rn.cliente.Cpf;
import com.acme.rn.conta.ContaMilhagem;
import com.acme.rn.conta.IdentificadorConta;

public class TesteRepositorioContaMilhagem {

	public static void main(String[] args) throws Exception {
		String cpff = "04623671186"; // Inicializa o atributo do tipo cadeia de
										// caracteres
		Cpf cpf = new Cpf(cpff); // Inicializa o atributo do tipo Cpf com a
									// cadeia de caracteres recebida
		Cliente c = new Cliente(cpf, "Eu", 999, 28, 1); // Inicializa o atributo
														// do tipo Cliente com
														// os atributos
														// recebidos
		IdentificadorConta id = new IdentificadorConta(2015); // Inicializa o
																// atributo do
																// tipo
																// IdentificadorConta
																// com o inteiro
																// recebido
		ContaMilhagem cm = new ContaMilhagem(id, c); // Inicializa o atributo do
														// tipo ContaMilhagem
														// com os atributos
														// recebidos
		RepositorioContaMilhagem rcm = new RepositorioContaMilhagem(); // Inicializa
																		// o
																		// atributo
																		// do
																		// tipo
																		// RepositorioContaMilhagem
		rcm.incluir(cm); // Inclui ao repositorio a contamilhagem

		System.out.println("Cliente: \n" + rcm.buscar(id)); // Imprimi
															// o
															// resultado
															// da
															// busca
															// no
															// repositorio

		

		

		

		IdentificadorConta idD = new IdentificadorConta(1325);
		ContaMilhagem cmNovo = new ContaMilhagem(idD, c); // Inicializa o
															// atributo do tipo
															// ContaMilhagem com
															// os atributos
															// recebidos
		rcm.alterar(id, cmNovo); // Altera a contaMilhagem
		rcm.buscarTodos(); // Busca e lista todas as informaçoes presente no
							// array
		rcm.excluir(id); // Exclui do repositorio a conta com o cpf e
		// identificadorconta recebidos
	}

}
