package com.acme.testes.conta;
//OK
import java.util.Scanner;

import com.acme.rn.conta.IdentificadorConta;

public class TesteIdentificadorConta {

	public static void main(String[] args) {

		IdentificadorConta id; // Declaracao dos atributos
		int dig;
		long numero;
		Scanner sc = new Scanner(System.in); // Inicializacao do Scanner

		System.out.println("Digite o numero da conta: "); // Imprimi a mensagem
															// na tela
		numero = sc.nextLong(); // Recebe o proximo long
		id = new IdentificadorConta(numero); // Inicializa o atributo do tipo
												// identificadorConta com o long
												// recebido

		System.out.println("Numero da conta:" + id.getIdentificadorConta() + // Imprimi
																				// as
																				// informacoes
																				// recebidas
																				// do
																				// atributo
																				// identificadorConta
		"\n" + "Digito verificador: " + id.calcularDigitoVerificador(id.getIdentificadorConta()) + "\n" + "Status: "
				+ id.verificarValidadeDigito(id.calcularDigitoVerificador(id.getIdentificadorConta())) + "\n\n");

		System.out.println("Insira o numero da conta: "); // Imprimi a mensagem
															// na tela
		numero = sc.nextLong(); // Recebe o proximo long
		id.setIdentificadorConta(numero); // Atribui o long recebido ao atributo
											// identificadorConta
		id.calcularDigitoVerificador(numero); // Calcula o digitoVerificador
		System.out.println("Digite o digito verificador: "); // Imprimi a
																// mensagem na
																// tela
		dig = sc.nextInt(); // Recebe o proximo inteiro
		System.out.println("Status: " + id.verificarValidadeDigito(dig)); // Imprimi
																			// o
																			// valor
																			// logico
																			// da
																			// verificacao
																			// do
																			// digito
																			// recebido
		sc.close(); // Fecha o Scanner
	}

}
