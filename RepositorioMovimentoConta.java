package com.acme.ado.conta;

import com.acme.ado.classesGerais.IRepositorioRegistro;
import com.acme.ado.classesGerais.RepositorioRegistro;
import com.acme.excecoes.ExcecaoObjetoExistente;
import com.acme.excecoes.ExcecaoObjetoInexistente;
import com.acme.rn.conta.MovimentoConta;

public class RepositorioMovimentoConta {
	private IRepositorioRegistro<MovimentoConta> repIdentificaveis; // Declaracao
																	// dos
	// atributos

	public RepositorioMovimentoConta() { // Construtor que cria um array
		repIdentificaveis = new RepositorioRegistro<MovimentoConta>();
	}

	public void incluir(MovimentoConta novoMovimentoConta) throws ExcecaoObjetoExistente, ExcecaoObjetoInexistente { // Metodo
																														// para
		// incluir
		// cliente
		repIdentificaveis.incluir(novoMovimentoConta);
	}

	public MovimentoConta buscar(String s) throws ExcecaoObjetoInexistente { // Metodo
																				// para
																				// buscar
																				// cliente
		// recebendo o cpf
		MovimentoConta movC = null;
		if (s != null) {
			movC = (MovimentoConta) repIdentificaveis.buscar(s);
		}
		return movC;
	}

	public void buscarTodos() { // Metodo para listar todos os clientes
								// existentes no array
		repIdentificaveis.buscarTodos();
	}
}
