package com.acme.rn.conta;

import java.util.Date;

public class MovimentoConta {

	private ContaMilhagem contaOrigem; // Declaracao dos atributos
	private ContaMilhagem contaDestino;
	private int valor;
	private int tipo;
	private String nomeFonte;
	private Date data;
	private final int credito = 1, debito = 2, transferencia = 3;

	public MovimentoConta(ContaMilhagem contaOrigem, int valor, int tipo, ContaMilhagem contaDestino, String nomeFonte,
			Date data) {// Construtor
						// para
						// inicializar
						// os
						// atributos
		setcontaDestino(contaDestino);
		setcontaOrigem(contaOrigem);
		setValor(valor);
		setNomeFonte(nomeFonte);
		setTipo(tipo);
		setData(data);
	}

	public void setData(Date data) {// Metodo para atribuir a data
		this.data = data;
	}

	public void setValor(int valor) {// Metodo para atribuir o valor da
										// transacao
		this.valor = valor;
	}

	public void setTipo(int tipo) {// Metodo para atribuir o tipo de transacao
		this.tipo = tipo;
	}

	public void setNomeFonte(String nomeFonte) {// Metodo para atribuir o nome
												// da fonte
		this.nomeFonte = nomeFonte;
	}

	public void setcontaOrigem(ContaMilhagem cm) {// Metodo para atribuir uma
													// conta
		this.contaOrigem = cm;
	}

	public void setcontaDestino(ContaMilhagem cm) {// Metodo para atribuir uma
													// conta
		this.contaDestino = cm;
	}

	public ContaMilhagem getcontaOrigem() { // Metodo para receber a conta
		return contaOrigem;
	}

	public ContaMilhagem getcontaDestino() { // Metodo para receber a conta
		return contaDestino;
	}

	public int getValor() { // Metodo para receber o valor
		return valor;
	}

	public int getTipo() { // Metodo para receber o tipo
		return tipo;
	}

	public String getNomeFonte() { // Metodo para receber o nome da fonte
		return nomeFonte;
	}

	public Date getData() { // Metodo para receber a data
		return data;
	}

	public void Data() { // Metodo para iniciar o atributo data
		data = new Date();
	}

	public String getNomeExtrato() { // Metodo para receber o nome no extrato
		String s;
		if (contaOrigem.getCliente().getSexo() == 0) { // Se o sexo do cliente
														// for
														// masculino
			s = " MR.";
		}

		else {
			s = " MRS."; // Se nao for masculino entao e feminino
		}

		return "" + contaOrigem.getCliente().getUltimoNome().toUpperCase() + // Retorna
		// o
		// ultimo
		// e o
		// primeiro
		// nome
		// do
		// cliente
		// em
		// maiuscula
		// seguido
		// da
		// saudacao
		", " + contaOrigem.getCliente().getPrimeiroNome().toUpperCase() + s;
	}

	public String toString() { // Metodo que altera o tipo original para o tipo
								// cadeia de caracteres
		return this.getcontaOrigem().toString() + "Valor: " + this.getValor() + "\nTipo: " + this.getTipo()
				+ "\nConta de Destino: \n" + this.getcontaDestino() + "Nome da Fonte: " + this.getNomeFonte()
				+ "\nData: " + this.getData() + "\n";
	}

	public boolean equals(Object o) {// Metodo para comparar dois objetos
		boolean r = false;// Inicializa com o valor logico falso
		if (o instanceof Date) {// Verifica se o objeto e do tipo Date
			r = this.getData().equals(((Date) o));// Compara os dois objetos
													// caso sejam iguais atribui
													// o valor logico verdadeiro
		}
		return r;// Retorna o valor logico
	}

}
