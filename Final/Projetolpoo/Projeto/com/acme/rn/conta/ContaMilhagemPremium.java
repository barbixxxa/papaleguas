//OK 19/11 17;42
package com.acme.rn.conta;

import com.acme.excecoes.ExcecaoRegraInvalida;
import com.acme.excecoes.ExcecaoValorInvalido;
import com.acme.rn.cliente.Cliente;

public class ContaMilhagemPremium extends ContaMilhagem {

	private double fatorMultiCredito; // Declaracao dos atributos

	public ContaMilhagemPremium(IdentificadorConta id, Cliente cliente, double fator) throws ExcecaoValorInvalido { // Construtor
		// da
		// classe
		super(id, cliente); // Chamada do construtor da super-classe para
							// inicializar os atributos
		this.fatorMultiCredito = fator; // Inicializacao do atributo
	}

	public ContaMilhagemPremium(IdentificadorConta id, Cliente cliente) throws ExcecaoValorInvalido { // Construtor
		// sobrecarregado
		this(id, cliente, 1);// Chamado do construtor da classe para inicializar
								// os atributos
	}

	public void creditar(double valor, double fator) throws ExcecaoRegraInvalida { // Metodo sobrecarregado
														// creditar
		super.creditar(valor + (valor * fator));// Credita com o metodo da
												// super-classe
	}

	public void creditar(double valor) throws ExcecaoRegraInvalida { // Metodo sobreescrito creditar
		this.creditar(valor, fatorMultiCredito);
	}

}
