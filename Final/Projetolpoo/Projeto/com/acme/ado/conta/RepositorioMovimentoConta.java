package com.acme.ado.conta;

import java.io.File;
import java.io.IOException;

import com.acme.ado.classesGerais.RepositorioRegistroArquivo;
import com.acme.rn.conta.MovimentoConta;

public class RepositorioMovimentoConta implements IRepositorioMovimentoConta<MovimentoConta> {
	private RepositorioRegistroArquivo<MovimentoConta> registroArquivo;
	private static final File local = new File("C:\\Papaleguas AIRLINES\\MovimentoConta");

	public RepositorioMovimentoConta() {
		registroArquivo = new RepositorioRegistroArquivo<MovimentoConta>();
	}

	public void incluir(MovimentoConta novoMovimentoConta) throws IOException { // Metodo
																				// para
		// incluir
		// cliente
		registroArquivo.definirLocal(local);
		registroArquivo.incluir(novoMovimentoConta);
	}

	public MovimentoConta buscar(String s) throws ClassNotFoundException, IOException { // Metodo
		// para
		// buscar
		// cliente
		// recebendo
		// o
		// cpf
		registroArquivo.definirLocal(local);
		MovimentoConta c = null;
		if (s != null) {
			c = (MovimentoConta) registroArquivo.buscar(s);
		}
		return c;
	}

	public MovimentoConta buscarTodos() throws IOException, ClassNotFoundException { // Metodo para listar todos os
											// clientes
		// existentes no array
		registroArquivo.definirLocal(local);
		return registroArquivo.buscarTodos();
	}

}
