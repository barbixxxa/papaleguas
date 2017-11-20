//OK
package com.acme.testes.cliente;

import com.acme.rn.cliente.Cliente;
import com.acme.rn.cliente.Cpf;

public class TesteCliente {

	public static void main(String[] args) {
		String cpf = "11144477735"; // Declaracao da cadeia de caracteres
		Cpf cpfDois, cpfUm; // Declarao dos atributos
		cpfUm = new Cpf(cpf); // Cria um novo atributo do tipo cpf
		Cliente c = new Cliente(cpfUm, "Son \"Kakaroto\" Goku", 789, 25, 0); // Cria
																				// um
																				// novo
																				// atributo
																				// do
																				// tipo
																				// cliente
																				// com
																				// tais
																				// atributos
		System.out.println(c); // Imprimi as informacoes do cliente

		cpf = "04623671186"; // Altera o valor da cadeia de caracteres
		cpfDois = new Cpf(cpf); // Cria um novo atributo do tipo cpf
		c.setNome("Marta Vieira da Silva"); // Altera o nome do cliente
		c.setRenda(c.getRenda() / 2); // Altera a renda do cliente
		c.setIdade(29); // Altera a idade do cliente
		c.setSexo(1); // Altera o sexo do cliente

		System.out.println("\nCpf: " + cpfDois.getCpf() + // Imprimi os dados do
															// cliente
															// utilizando os
															// metodos get
		"\nPrimeiro nome: " + c.getPrimeiroNome() + "\nUltimo Nome: " + c.getUltimoNome() + "\nSalario: " + c.getRenda()
				+ "\nIdade: " + c.getIdade() + "\nSexo: " + c.getSexo());

		System.out.println(c.getChave()); // Retorna a chave do cliente

	}

}
