package com.acme.excecoes;

public class ExcecaoProblemaFisicoAcessoRepositorio extends RuntimeException{
	private String excecao;
	public ExcecaoProblemaFisicoAcessoRepositorio(String msg){
		super(msg);
	}
	
	public ExcecaoProblemaFisicoAcessoRepositorio(String msg, String excecao){
		super(msg);
		this.excecao = excecao;
	}

}
