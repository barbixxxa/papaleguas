package com.acme.testes.conta;
//OK
import com.acme.rn.cliente.Cliente;
import com.acme.rn.cliente.Cpf;
import com.acme.rn.conta.ContaMilhagem;
import com.acme.rn.conta.IdentificadorConta;

public class TesteContaMilhagem {

	public static void main(String[] args) {
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
		Cliente clienteDois = new Cliente(cpffDois, "Rs rs rs", 1000, 13, 0); // Inicializacao
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

		cm.creditar(100000000); // Creditar o valor a conta desejada
		cm.debitar(1); // Debitar o valor da conta desejada
		System.out.println("Saldo: " + cm.getSaldo() + "\nCliente: " + cm.getCliente()); // Imprimi
																							// as
																							// informacoes
																							// da
																							// conta

		cmDois.desativar(); // Desativara conta

		cm.transferir(59999999, cmDois); // Transferir o valor de uma conta para
											// outra
		System.out.println("\nSaldo: " + cm.getSaldo() + "\nCliente: " + cm.getCliente() + // Imprimir
																							// as
																							// informacoes
																							// das
																							// contas
		"\n\nSaldo: " + cmDois.getSaldo() + "\nCliente: " + cmDois.getCliente());
		cmDois.reativar(); // Reativar a conta

		cm.transferir(59999999, cmDois); // Transferir o valor de uma conta para
											// outra
		System.out.println("\nSaldo: " + cm.getSaldo() + "\nCliente: " + cm.getCliente() + "Status: " + cm.getStatus() + // Imprimir
																															// as
																															// informacoes
																															// das
																															// contas
		"\n\nSaldo: " + cmDois.getSaldo() + "\nCliente: " + cmDois.getCliente() + "Status: " + cmDois.getStatus());

	}

}
