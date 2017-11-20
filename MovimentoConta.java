package com.acme.rn.conta;

import java.util.Date;

import com.acme.rn.classesGerais.Identificavel;

public class MovimentoConta extends Identificavel {

	private ContaMilhagem contaOrigem; // Declaracao dos atributos

	private double valor;
	private String nomeFonte;
	private Date data;

	public MovimentoConta(ContaMilhagem contaOrigem, double valor, String nomeFonte, Date data) {// Construtor
																									// para
																									// inicializar
																									// os
																									// atributos

		this.setcontaOrigem(contaOrigem);
		this.setValor(valor);
		this.setNomeFonte(nomeFonte);
		this.setData(data);
	}

	public void setData(Date data) {// Metodo para atribuir a data
		if (data != null) {
			this.data = data;
		}
	}

	public void setValor(double valor) {// Metodo para atribuir o valor da
										// transacao
		if (valor >= 0) {
			this.valor = valor;
		}
	}

	public void setNomeFonte(String nomeFonte) {// Metodo para atribuir o nome
												// da fonte
		if (nomeFonte != null) {
			this.nomeFonte = nomeFonte;
		}
	}

	public void setcontaOrigem(ContaMilhagem cm) {// Metodo para atribuir uma
													// conta
		if (cm != null) {
			this.contaOrigem = cm;
		}
	}

	public ContaMilhagem getcontaOrigem() { // Metodo para receber a conta
		return contaOrigem;
	}

	public double getValor() { // Metodo para receber o valor
		return valor;
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

	public String getChave() {
		return "" + contaOrigem.getIdentificadorConta().getIdentificadorConta() + data.getDate() + data.getMonth()
				+ data.getYear() + data.getHours() + data.getMinutes();
	}

	public String toString() { // Metodo que altera o tipo original para o tipo
								// cadeia de caracteres
		return this.getcontaOrigem().toString() + "Valor: " + this.getValor() + "\nConta de Destino: \n"
				+ "Nome da Fonte: " + this.getNomeFonte() + "\nData: " + this.getData() + "\n";
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
