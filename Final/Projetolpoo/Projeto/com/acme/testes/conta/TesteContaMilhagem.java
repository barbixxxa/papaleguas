package com.acme.testes.conta;

import com.acme.rn.cliente.Cliente;
import com.acme.rn.cliente.Cpf;
import com.acme.rn.conta.ContaMilhagem;
import com.acme.rn.conta.IdentificadorConta;

public class TesteContaMilhagem {

	public static void main(String[] args) throws Exception {
		int valorDois = 75, valor = 59; // Inicializacao dos atributos do tipo
										// inteiro
		String cpfDois = "11144477735", cpf = "04623671186"; // Inicializacao
																// dos atributos
																// do tipo
																// cadeia de
																// caracteres
		Cpf cpff = new Cpf(cpf); // Inicializacao do atributo do tipo Cpf
		Cpf cpffDois = new Cpf(cpfDois); // Inicializacao do atributo do tipo
											// Cpf
		Cliente cliente = new Cliente(cpff, "K k k", 999, 69, 1); // Inicializacao
																	// do
																	// atributo
																	// do tipo
																	// Cliente
		Cliente clienteDois = new Cliente(cpffDois, "Rs rs rs", 1000, 103, 2); // Inicializacao
																				// do
																				// atributo
																				// do
																				// tipo
																				// Cliente
		IdentificadorConta idc = new IdentificadorConta(valor); // Inicializacao
																// do atributo
																// do tipo
																// IdentificadorConta
		IdentificadorConta idcDois = new IdentificadorConta(valorDois); // Inicializacao
																		// do
																		// atributo
																		// do
																		// tipo
																		// IdentificadorConta
		ContaMilhagem cm = new ContaMilhagem(idc, cliente); // Inicializacao do
															// atributo do tipo
															// ContaMilhagem
		ContaMilhagem cmDois = new ContaMilhagem(idcDois, clienteDois); // Inicializacao
																		// do
																		// atributo
																		// do
																		// tipo
																		// ContaMilhagem

		cm.creditar(100); // Creditar o valor a conta desejada
		 // Debitar o valor da conta desejada
		System.out.println("Saldo: " + cm.getSaldo() + "\nCliente: " + cm.getCliente()); // Imprimi
																							// as
																							// informacoes
																							// da
																							// conta

		cm.transferir(59, cmDois); // Transferir o valor de uma conta para
									// outra
		System.out.println("\nSaldo: " + cm.getSaldo() + "\nCliente: " + cm.getCliente() + // Imprimir
																							// as
																							// informacoes
																							// das
																							// contas
		"\n\nSaldo: " + cmDois.getSaldo() + "\nCliente: " + cmDois.getCliente());
		cmDois.desativar();
		cmDois.reativar(); // Reativar a conta

		System.out.println("\nSaldo: " + cm.getSaldo() + "\nCliente: " + cm.getCliente() + "Status: " + cm.getStatus() + // Imprimir
																															// as
																															// informacoes
																															// das
																															// contas
		"\n\nSaldo: " + cmDois.getSaldo() + "\nCliente: " + cmDois.getCliente() + "Status: " + cmDois.getStatus());

		System.out.println("\nChave:" + cm.getChave()); // Retorna o valor da
														// chave da conta
		// milhagem

	}

}
