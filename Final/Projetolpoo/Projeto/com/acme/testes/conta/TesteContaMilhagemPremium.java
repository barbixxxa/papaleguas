package com.acme.testes.conta;

import com.acme.rn.cliente.Cliente;
import com.acme.rn.cliente.Cpf;
import com.acme.rn.conta.ContaMilhagemPremium;
import com.acme.rn.conta.IdentificadorConta;

public class TesteContaMilhagemPremium {

	public static void main(String[] args) throws Exception {
		int valorDois = 75, valor = 59; // Inicializacao dos atributos do tipo
		// inteiro
		String cpfDois = "11144477735", cpf = "04623671186"; // Inicializacao
		// dos atributos
		// do tipo
		// cadeia de
		// caracteres
		double fator = 0.2;
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
		ContaMilhagemPremium cmp = new ContaMilhagemPremium(idc, cliente, fator); // Inicializacao
																					// do
		// atributo do tipo
		// ContaMilhagem
		ContaMilhagemPremium cmDois = new ContaMilhagemPremium(idcDois, clienteDois, fator); // Inicializacao
		// do
		// atributo
		// do
		// tipo
		// ContaMilhagem

		cmp.creditar(100); // Creditar o valor a conta desejada
		cmp.debitar(1); // Debitar o valor da conta desejada
		System.out.println("Saldo: " + cmp.getSaldo() + "\nCliente: " + cmp.getCliente()); // Imprimi
		// as
		// informacoes
		// da
		// conta

		cmDois.desativar(); // Desativara conta

		// para
		// outra
		System.out.println("\nSaldo: " + cmp.getSaldo() + "\nCliente: " + cmp.getCliente() + // Imprimir
		// as
		// informacoes
		// das
		// contas
		"\n\nSaldo: " + cmDois.getSaldo() + "\nCliente: " + cmDois.getCliente());
		cmDois.reativar(); // Reativar a conta

		cmp.transferir(49, cmDois); // Transferir o valor de uma conta
									// para
		// outra
		System.out.println(
				"\nSaldo: " + cmp.getSaldo() + "\nCliente: " + cmp.getCliente() + "Status: " + cmp.getStatus() + // Imprimir
		// as
		// informacoes
		// das
		// contas
		"\n\nSaldo: " + cmDois.getSaldo() + "\nCliente: " + cmDois.getCliente() + "Status: " + cmDois.getStatus());

		System.out.println("\nChave:" + cmp.getChave()); // Retorna o valor da
		// chave da conta
		// milhagem

	}

}
