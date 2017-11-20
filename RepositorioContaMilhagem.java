package com.acme.ado.conta;

import com.acme.ado.classesGerais.IRepositorioRegistro;
import com.acme.ado.classesGerais.RepositorioRegistro;
import com.acme.excecoes.ExcecaoObjetoExistente;
import com.acme.excecoes.ExcecaoObjetoInexistente;
import com.acme.rn.conta.ContaMilhagem;
import com.acme.rn.conta.IdentificadorConta;

public class RepositorioContaMilhagem {
	private IRepositorioRegistro<ContaMilhagem> repIdentificaveis; // Declaracao
																	// dos
	// atributos

	public RepositorioContaMilhagem() { // Construtor que cria um array
		repIdentificaveis = new RepositorioRegistro<ContaMilhagem>();
	}

	public void incluir(ContaMilhagem novaContaMilhagem) throws ExcecaoObjetoExistente, ExcecaoObjetoInexistente { // Metodo
																													// para
		// incluir cliente
		repIdentificaveis.incluir(novaContaMilhagem);
	}

	public ContaMilhagem buscar(IdentificadorConta id) throws ExcecaoObjetoInexistente { // Metodo
																							// para
																							// buscar
		// cliente recebendo
		// o cpf
		ContaMilhagem cm = null;
		if (id != null) {
			cm = (ContaMilhagem) repIdentificaveis.buscar(Long.toString(id.getIdentificadorConta()));
		}
		return cm;
	}

	public boolean excluir(IdentificadorConta id) throws ExcecaoObjetoInexistente { // Metodo
																					// para
																					// excluir
		// cliente recebendo cpf

		if (repIdentificaveis.excluir(Long.toString(id.getIdentificadorConta()))) {
			return true;
		}
		return false;
	}

	public boolean alterar(IdentificadorConta antigoId, ContaMilhagem novaContaMilhagem)
			throws ExcecaoObjetoExistente, ExcecaoObjetoInexistente { // Metodo
																		// para
																		// alterar
																		// dados
																		// do
																		// cliente
		/*if ((repIdentificaveis.alterar(Long.toString(antigoId.getIdentificadorConta()), novaContaMilhagem)) == true) {
			return true;

		}*/

		return false;

	}

	public void buscarTodos() { // Metodo para listar todos os clientes
								// existentes no array
		repIdentificaveis.buscarTodos();
	}
}
