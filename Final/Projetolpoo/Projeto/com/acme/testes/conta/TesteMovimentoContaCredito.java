
package com.acme.testes.conta;

import java.util.Date;
import java.util.Scanner;

import com.acme.excecoes.ExcecaoRegraInvalida;
import com.acme.excecoes.ExcecaoValorInvalido;
import com.acme.rn.cliente.Cliente;
import com.acme.rn.cliente.Cpf;
import com.acme.rn.conta.ContaMilhagem;
import com.acme.rn.conta.IdentificadorConta;
import com.acme.rn.conta.MovimentoContaCredito;

public class TesteMovimentoContaCredito {

	public static void main(String[] args) throws ExcecaoValorInvalido, ExcecaoRegraInvalida {
		int valor; // Declaracao de atributos do tipo inteiro
		String nomeFonte; // Declaracao do atributo do tipo cadeia de caracteres
		Date data = new Date(); // Inicializacao do atributo do tipo data
		Cpf cpf = new Cpf("11144477735"); // Inicializacao do atributo do tipo
											// cpf
		Cliente c = new Cliente(cpf, "Son \"Kakaroto\" Goku", 96969, 25, 1); // Inicializacao
																				// do
																				// atributo
																				// do
																				// tipo
																				// cliente
		IdentificadorConta idc = new IdentificadorConta(99); // Inicializacao do
																// atributo do
																// tipo
																// identificadorConta

		ContaMilhagem cmO = new ContaMilhagem(idc, c); // Inicializacao do
														// atributo do tipo
														// ContaMilhagem

		Scanner sc = new Scanner(System.in); // Inicializacao do scanner

		System.out.println("Insira o valor: "); // Imprimi mensagem na tela
		valor = sc.nextInt(); // Atribui ao atributo o proximo inteiro digitado
		System.out.println("Insira o nome da fonte: "); // Imprimi mensagem na
														// tela
		nomeFonte = sc.next(); // Atribui ao atributo a proxima cadeia de
								// caracteres digitada
		cmO.creditar(valor); //Credita o valor a conta

		MovimentoContaCredito mcc = new MovimentoContaCredito(cmO, cmO, valor, nomeFonte, data); // Inicializacao
		// do
		// atributo
		// do
		// tipo
		// MovimentoConta

		System.out.println(mcc.toString() + "\n" + mcc.getNomeExtrato()); // Imprimi
																			// na
																			// tela
																			// as
																			// informacoes
																			// do
																			// movimentoConta
		sc.close(); // Fecha o scanner

		System.out.println("\nChave:" + mcc.getChave()); // Retorna o valor da
															// chave do
		// movimento conta

	}

}
