package com.acme.ado.conta;

import com.acme.ado.classesGerais.RepositorioIdentificavel;

import com.acme.rn.conta.MovimentoConta;
import com.acme.rn.conta.IdentificadorConta;

public class RepositorioMovimentoConta {
	private RepositorioIdentificavel repIdentificaveis; // Declaracao dos
														// atributos

	public RepositorioMovimentoConta() { // Construtor que cria um array
		repIdentificaveis = new RepositorioIdentificavel();
	}

	public void incluir(MovimentoConta novoMovimentoConta) { // Metodo para incluir cliente
		repIdentificaveis.incluir(novoMovimentoConta);
	}

	public MovimentoConta buscar(String s) { // Metodo para buscar cliente recebendo o cpf
		MovimentoConta movC = null;
		if(s != null){
			movC = (MovimentoConta) repIdentificaveis.buscar(s);
		}
	return movC;		
	}


	public void buscarTodos() { // Metodo para listar todos os clientes
								// existentes no array
		repIdentificaveis.buscarTodos();
	}
}
