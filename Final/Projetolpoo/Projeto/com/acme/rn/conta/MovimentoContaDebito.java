package com.acme.rn.conta;

import java.util.Date;

import com.acme.excecoes.ExcecaoValorInvalido;

public class MovimentoContaDebito extends MovimentoConta {

	public MovimentoContaDebito(ContaMilhagem contaOrigem, ContaMilhagem contaDestino, double valor, String nomeFonte,
			Date data) throws ExcecaoValorInvalido {
		super(contaOrigem, contaDestino, valor, nomeFonte, data);
	}
	
	public String getChave(){
		return "" + super.getChave() + "Debito";
	}

}
