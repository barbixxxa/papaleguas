
package com.acme.testes.cliente;

import com.acme.rn.cliente.Cliente;
import com.acme.rn.cliente.ControladorCliente;
import com.acme.rn.cliente.Cpf;

public class TesteControladorCliente {

	public static void main(String[] args) throws Exception {
		/**
		 * Declaracao e inicializacao dos atributos
		 */
		String cpf = "11144477735";
		Cpf cpff = new Cpf(cpf);

		Cliente cliente = new Cliente(cpff, "Eu", 9999, 199, 1);
		Cliente clienteDois = new Cliente(cpff, "Ela", 700, 25, 2);// tem que
																	// etsar
																	// incluido

		ControladorCliente.incluir(cliente); // Incluir cliente

		System.out.println(ControladorCliente.buscar(cliente.getCpf())); // Buscar
																			// cliente

		ControladorCliente.alterar(cliente.getCpf(), clienteDois);
		ControladorCliente.buscarTodos(); // Buscar todos os clientes
		System.out.println(ControladorCliente.buscar(cliente.getCpf()));

		ControladorCliente.excluir(cliente.getCpf()); // Excluir cliente

	}

}
