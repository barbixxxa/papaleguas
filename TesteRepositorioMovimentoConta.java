//OK
package com.acme.testes.conta;

import java.util.Date;
import com.acme.ado.conta.RepositorioMovimentoConta;
import com.acme.rn.cliente.Cliente;
import com.acme.rn.cliente.Cpf;
import com.acme.rn.conta.ContaMilhagem;
import com.acme.rn.conta.IdentificadorConta;
import com.acme.rn.conta.MovimentoConta;

public class TesteRepositorioMovimentoConta {

	public static void main(String[] args) {
		int valor = 450; // Inicializa o atributo do tipo inteiro
		String cpff = "04623671186"; // Inicializa o atributo do tipo cadeia de
										// caracteres
		String nomeFonte = "Teste"; // Inicializa o atributo do tipo cadeia de
									// caracteres
		Cpf cpf = new Cpf(cpff); // Inicializa um novo atributo do tipo Cpf com
									// a cadeia de caracteres recebida
		Cliente c = new Cliente(cpf, "Eu", 999, 28, 1); // Inicializa um novo
														// atributo do tipo
														// Cliente com os
														// atributos recebidos
		IdentificadorConta id = new IdentificadorConta(2015); // Inicializa um
																// novo atributo
																// do tipo
																// IdentificadorConta
																// com o inteiro
																// recebido
		ContaMilhagem contaO = new ContaMilhagem(id, c); // Inicializa um novo
															// atributo do tipo
															// ContaMilhagem com
															// o
															// identificadorconta
															// e o cliente
															// recebido

		Date data = new Date(); // Inicializa um novo atributo do tipo Data
		MovimentoConta mc = new MovimentoConta(contaO, valor, nomeFonte, data); // Inicializa
																				// um
																				// novo
																				// atributo
																				// do
																				// tipo
																				// MovimentoConta
																				// com
																				// os
																				// atributos
																				// recebidos
		RepositorioMovimentoConta rmc = new RepositorioMovimentoConta(); // Inicializa
																			// um
																			// novo
																			// atributo
																			// do
																			// tipo
																			// RepositorioMovimentoConta

		rmc.incluir(mc); // Inclui ao repositorio o movimentoConta
		System.out.println("Movimento existe: \n" + rmc.buscar(mc.getChave())); // Imprimi
		// se o
		// movimento
		// ja
		// foi
		// adicionado
		// ao
		// repositorio
		rmc.incluir(mc); // Inclui ao repositorio o movimentoConta
		rmc.buscarTodos(); // Imprimi as informacoes de tudo existente no array
	}

}
