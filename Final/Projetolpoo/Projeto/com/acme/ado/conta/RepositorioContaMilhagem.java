package com.acme.ado.conta;

import java.io.File;
import java.io.IOException;

import com.acme.ado.classesGerais.RepositorioRegistroArquivo;
import com.acme.rn.conta.ContaMilhagem;
import com.acme.rn.conta.IdentificadorConta;

public class RepositorioContaMilhagem implements IRepositorioContaMilhagem<ContaMilhagem> {
	private RepositorioRegistroArquivo<ContaMilhagem> registroArquivo;
	private static final File local = new File("C:\\Papaleguas AIRLINES\\ContaMilhagem");

	public RepositorioContaMilhagem() {
		registroArquivo = new RepositorioRegistroArquivo<ContaMilhagem>();
	}

	/**
	 * Meotod para incluir ContaMilhagem
	 */
	public void incluir(ContaMilhagem novaContaMilhagem) throws IOException {
		registroArquivo.definirLocal(local);
		registroArquivo.incluir(novaContaMilhagem);
	}

	public ContaMilhagem buscar(IdentificadorConta id) throws ClassNotFoundException, IOException { // Metodo
		// para
		// buscar
		// cliente
		// recebendo
		// o
		// cpf
		registroArquivo.definirLocal(local);
		ContaMilhagem c = null;
		if (id != null) {
			c = (ContaMilhagem) registroArquivo.buscar(Long.toString(id.getIdentificadorConta()));
		}
		return c;
	}

	public boolean excluir(IdentificadorConta id) throws ClassNotFoundException, IOException { // Metodo para excluir
													// cliente recebendo
		// cpf
		registroArquivo.definirLocal(local);
		if (registroArquivo.excluir(Long.toString(id.getIdentificadorConta()))) {
			return true;
		}
		return false;
	}

	public boolean alterar(IdentificadorConta id, ContaMilhagem novaContaMilhagem) throws IOException, ClassNotFoundException { // Metodo
		// para
		// alterar
		// dados
		// do
		// cliente
		registroArquivo.definirLocal(local);
		if (registroArquivo.alterar(Long.toString(id.getIdentificadorConta()), novaContaMilhagem)) {
			return true;
		}

		return false;

	}

	public ContaMilhagem buscarTodos() throws IOException, ClassNotFoundException { // Metodo para listar todos os clientes
		// existentes no array
		registroArquivo.definirLocal(local);
		return registroArquivo.buscarTodos();
	}

}
