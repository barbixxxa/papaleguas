package com.acme.ado.conta;

import com.acme.ado.classesGerais.RepositorioIdentificavel;

import com.acme.rn.conta.ContaMilhagem;
import com.acme.rn.conta.IdentificadorConta;

public class RepositorioContaMilhagem {
	private RepositorioIdentificavel repIdentificaveis; // Declaracao dos
														// atributos

	public RepositorioContaMilhagem() { // Construtor que cria um array
		repIdentificaveis = new RepositorioIdentificavel();
	}

	public void incluir(ContaMilhagem novaContaMilhagem) { // Metodo para incluir cliente
		repIdentificaveis.incluir(novaContaMilhagem);
	}

	public ContaMilhagem buscar(IdentificadorConta id) { // Metodo para buscar cliente recebendo o cpf
		ContaMilhagem cm = null;
		if(id != null){
			cm = (ContaMilhagem) repIdentificaveis.buscar(Long.toString(id.getIdentificadorConta()));
		}
	return cm;		
	}

	public boolean excluir(IdentificadorConta id) { // Metodo para excluir cliente recebendo cpf
		
		if(repIdentificaveis.excluir(Long.toString(id.getIdentificadorConta()))){
			return true;
		}
	return false;
	}

	public boolean alterar(IdentificadorConta antigoId, ContaMilhagem novaContaMilhagem) { // Metodo para alterar dados do cliente
		if(repIdentificaveis.alterar(Long.toString(antigoId.getIdentificadorConta()), novaContaMilhagem)){
			return true;
		}
		
	return false;
		
	}

	public void buscarTodos() { // Metodo para listar todos os clientes
								// existentes no array
		repIdentificaveis.buscarTodos();
	}
}
