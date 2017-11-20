package com.acme.rn.conta;

import java.util.Date;

import com.acme.excecoes.ExcecaoValorInvalido;

public class MovimentoContaCredito extends MovimentoConta {

	public MovimentoContaCredito(ContaMilhagem contaOrigem, ContaMilhagem contaDestino, double valor, String nomeFonte,
			Date data) throws ExcecaoValorInvalido {
		super(contaOrigem, contaDestino, valor, nomeFonte, data);
	}

	public String getChave(){
		return "" + super.getChave() + "Credito";
	}
}
