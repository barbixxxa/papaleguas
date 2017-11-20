
package com.acme.testes.cliente;

import com.acme.rn.cliente.Cliente;
import com.acme.rn.cliente.ControladorCliente;
import com.acme.rn.cliente.Cpf;
import com.acme.rn.conta.ControladorContaMilhagem;

public class TesteControladorCliente {

	public static void main(String[] args) throws Exception {
		String cpf = "11144477735"; // Declaracao da cadeia de
									// caracteres
		Cpf cpff = new Cpf(cpf); // Cria um novo atributo do tipo cpf

		Cliente cliente = new Cliente(cpff, "Eu", 9999, 199, 1);// Inicializa um
																// novo cliente

		ControladorCliente.incluir(cliente);// Inclui um novo cliente ao
											// repositorio pelo
		// controlador cliente

		System.out.println(ControladorCliente.buscar(cliente.getCpf()));// Imprimi
																		// oque
																		// foi
		// encontrado pelo
		// controlador cliente
		ControladorCliente.alterar(cliente);// Altera o cliente do repositorio
											// pelo controlador
		// cliente
		/**
		 * TODO problema no excluir, possivelmente tentando excluir do conta
		 * milhagem
		 */

		System.out.println(ControladorCliente.buscar(cliente.getCpf()));// Imprimi
		// oque
		// foi
		// encontrado pelo controlador cliente

		// ControladorCliente.excluir(cliente.getCpf());// Exclui o cliente do
		// repositorio pelo
		// controlador cliente

		// ControladorCliente.excluir(cliente.getCpf());// Exclui o cliente do
		// repositorio pelo
		// controlador cliente

		// ControladorCliente.buscarTodos();// Busca todos os clientes
		// existentes
		// no repositorio

	}

}
