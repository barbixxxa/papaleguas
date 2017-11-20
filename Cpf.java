package com.acme.rn.cliente;

public class Cpf {

	private String cpf; // Declaracao do atributo

	public String getCpf() { // Metodo para retornar o cpf
		return this.cpf;
	}

	public boolean equals(Object o) {// Metodo para comparar dois objetos
		boolean r = false;// Inicializa com o valor logico falso
		if (o instanceof Cpf) {// Verifica se o objeto e do tipo cpf
			this.cpf.equals(((Cpf) o).cpf);// Compara dois objetos caso sejam
											// iguais atribui o valor logico
											// verdadeiro
		}
		return r;// Retorna o valor logico
	}

	public boolean calcularDigitoVerificador(String cpf) { // Metodo para
															// calcular digito
															// verificador do
															// cpf
		boolean verificacao = false;// Inicializa com o valor logico falso
		int n[] = new int[11]; // Declaracao dos atributos
		int d = 0, v = 0;

		for (int i = 0; i < 11; i++) { // Loop para atribuir os valores do cpf
										// ao array
			n[i] = Integer.parseInt(cpf.substring(i, i + 1)); // Passa de string
																// para int
		}

		int multiplicador = 10; // Atributo multiplicador dos numeros do cpf

		for (int i = 0; i < 9; i++, multiplicador--) { // Loop para calcular o
														// primeiro digito
														// verificador
			d += n[i] * multiplicador;
		}

		d %= 11; // Atribui o resto da divisao ao atributo

		if (d < 2) { // Se o digito for menor que 2 este sera 0
			d = 0;
		} else {
			d = 11 - d; // Subtrai o resultado de 11 para encontrar o digito,
						// segundo a formula
		}

		multiplicador = 11; // Atribuicao do valor ao multiplicador

		for (int i = 0; i < 10; i++, multiplicador--) { // Loop para calcular o
														// segundo digito
														// verificador
			v += n[i] * multiplicador;
		}
		v %= 11; // Atribui o resto da divisao ao atributo

		if (v < 2) { // Se o digito for menor que 2 este sera 0
			v = 0;
		} else {
			v = 11 - v; // Subtrai o resultado de 11 para encontrar o digito,
						// segundo a formula
		}

		if (d == n[9] && v == n[10]) { // Verifica se o digito esta correto
			verificacao = true;
		}

		return verificacao; // Retorna o valor logico da verificacao
	}

	public void setCpf(String cpf) { // Metodo para receber o cpf
		if (cpf.length() > 10 && cpf.length() < 12 && this.calcularDigitoVerificador(cpf) == true) // Verificacao
																									// do
																									// cpf
			this.cpf = cpf;
		else
			System.out.println("Cpf nao e valido.");
	}

	public Cpf(String cpf) { // Construtor que atribui o valor recebido ao
								// atributo cpf
		this.setCpf(cpf);
	}
}
