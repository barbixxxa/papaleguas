package com.acme.testes.cliente;

import com.acme.excecoes.ExcecaoValorInvalido;
import com.acme.rn.cliente.Cpf;

public class TesteCpf {

	public static void main(String[] args) throws ExcecaoValorInvalido {
		Cpf cpf = new Cpf("11144477735"); // Inicializacao e declaracao dos
											// atributos

		System.out.println(cpf.getCpf()); // Metodo para receber o cpf

		System.out.println(cpf.calcularDigitoVerificador("11144477735"));// Metodo
																			// para
																			// verificar
																			// se
																			// o
																			// cpf
																			// e
																			// valido

	}

}
