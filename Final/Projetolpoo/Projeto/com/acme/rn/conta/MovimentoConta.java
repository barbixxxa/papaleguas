package com.acme.rn.conta;

import java.io.Serializable;
import java.util.Date;

import com.acme.excecoes.ExcecaoValorInvalido;
import com.acme.rn.classesGerais.Registro;

public abstract class MovimentoConta extends Registro implements Serializable{

	private ContaMilhagem contaOrigem; // Declaracao dos atributos
	private ContaMilhagem contaDestino;
	private double valor;
	private String nomeFonte;
	private Date data;

	public MovimentoConta(ContaMilhagem contaOrigem, ContaMilhagem contaDestino, double valor, String nomeFonte,
			Date data) throws ExcecaoValorInvalido {// Construtor
		// para
		// inicializar
		// os
		// atributos

		this.setContaOrigem(contaOrigem);
		this.setContaDestino(contaDestino);
		this.setValor(valor);
		this.setNomeFonte(nomeFonte);
		this.setData(data);
		this.validar();
	}

	public void setData(Date data) throws ExcecaoValorInvalido {// Metodo para
																// atribuir a
																// data
		if (data != null) {
			this.data = data;
		} else {
			throw new ExcecaoValorInvalido("erro.MovimentoConta.dataInvalida");
		}

	}

	public void setValor(double valor) throws ExcecaoValorInvalido {// Metodo
																	// para
																	// atribuir
																	// o valor
																	// da
		// transacao
		if (valor > 0) {
			this.valor = valor;
		} else {
			throw new ExcecaoValorInvalido("erro.MovimentoConta.valorInvalido");
		}

	}

	public void setNomeFonte(String nomeFonte) throws ExcecaoValorInvalido {// Metodo
																			// para
																			// atribuir
																			// o
																			// nome
		// da fonte
		if (nomeFonte != null) {
			this.nomeFonte = nomeFonte;
		} else {
			throw new ExcecaoValorInvalido("erro.MovimentoConta.nomeFonteInvalido");
		}

	}

	public void setContaOrigem(ContaMilhagem cmO) throws ExcecaoValorInvalido {// Metodo
																				// para
																				// atribuir
																				// uma
																				// conta
		if (cmO != null) {
			this.contaOrigem = cmO;

		} else {
			throw new ExcecaoValorInvalido("erro.MovimentoConta.contaOrigemInvalida");
		}

	}

	public void setContaDestino(ContaMilhagem cmD) throws ExcecaoValorInvalido {// Metodo
																				// para
																				// atribuir
																				// uma
		// conta
		if (cmD != null) {
			this.contaDestino = cmD;
		}else{
		throw new ExcecaoValorInvalido("erro.MovimentoConta.contaDestinoInvalida");
		}

	}

	public ContaMilhagem getContaOrigem() { // Metodo para receber a conta
		return contaOrigem;
	}

	public ContaMilhagem getContaDestino() { // Metodo para receber a conta
		return contaDestino;
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

	public void validar() throws ExcecaoValorInvalido {
		if (this.contaOrigem != null) {
			if (this.valor > 0) {
				if (this.contaDestino != null) {
					if (this.nomeFonte == null || ((this.nomeFonte.length()) < 100)) {
						if (this.data != null) {

						} else {
							throw new ExcecaoValorInvalido("erro.MovimentoConta.dataInvalida");
						}
					} else {
						throw new ExcecaoValorInvalido("erro.MovimentoConta.nomeFonteInvalido");
					}
				} else {
					throw new ExcecaoValorInvalido("erro.MovimentoConta.contaDestinoInvalida");
				}
			} else {
				throw new ExcecaoValorInvalido("erro.MovimentoConta.valorInvalido");
			}
		} else {
			throw new ExcecaoValorInvalido("erro.MovimentoConta.contaOrigemInvalida");
		}
	}

	public String toString() { // Metodo que altera o tipo original para o tipo
								// cadeia de caracteres
		return this.getContaOrigem().toString() + "Valor: " + this.getValor() + "\nConta de Destino: \n"
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
