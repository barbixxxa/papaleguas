package com.acme.ado.cliente;

import java.io.File;
import java.io.IOException;

import com.acme.ado.classesGerais.RepositorioRegistroArquivo;
import com.acme.rn.cliente.Cliente;
import com.acme.rn.cliente.Cpf;

public class RepositorioCliente implements IRepositorioCliente<Cliente>{
	private RepositorioRegistroArquivo<Cliente> registroArquivo;
	private static final File local = new File("C:\\Papaleguas AIRLINES\\Clientes");

	public RepositorioCliente() {
		registroArquivo = new RepositorioRegistroArquivo<Cliente>();
	}

	/**
	 * Metodo para incluir cliente
	 */
	public void incluir(Cliente novoCliente) throws IOException {
		registroArquivo.definirLocal(local);
		registroArquivo.incluir(novoCliente);
	}

	public Cliente buscar(Cpf cpf) throws ClassNotFoundException, IOException { // Metodo
																				// para
																				// buscar
																				// cliente
																				// recebendo
																				// o
		// cpf
		registroArquivo.definirLocal(local);
		Cliente c = null;
		if (cpf != null) {
			c = (Cliente) registroArquivo.buscar(cpf.getCpf());
		}
		return c;
	}

	public boolean excluir(Cpf cpf) throws ClassNotFoundException, IOException { // Metodo para excluir cliente recebendo
										// cpf
		registroArquivo.definirLocal(local);
		if (registroArquivo.excluir(cpf.getCpf())) {
			return true;
		}
		return false;
	}

	public boolean alterar(Cpf antigoCliente, Cliente novoCliente) throws IOException, ClassNotFoundException { // Metodo
																						// para
																						// alterar
																						// dados
																						// do
		registroArquivo.definirLocal(local);																				// cliente
		if (registroArquivo.alterar(antigoCliente.getCpf(), novoCliente)) {
			return true;
		}

		return false;

	}

	public Cliente buscarTodos() throws IOException, ClassNotFoundException { // Metodo para listar todos os clientes
								// existentes no array
		registroArquivo.definirLocal(local);
		return registroArquivo.buscarTodos();
	}

}
