//OK
package com.acme.testes.cliente;

import com.acme.rn.cliente.Cliente;
import com.acme.rn.cliente.ControladorCliente;
import com.acme.rn.cliente.Cpf;

public class TesteControladorCliente {

	public static void main(String[] args) {
		String cpf = "11144477735"; // Declaracao da cadeia de
									// caracteres
		Cpf cpff = new Cpf(cpf); // Cria um novo atributo do tipo cpf
		Cliente cliente = new Cliente(cpff, "Eu", 9999, 9, 1);// Inicializa um
																// novo cliente

		ControladorCliente.incluir(cliente);// Inclui um novo cliente ao
											// repositorio pelo
		// controlador cliente
		ControladorCliente.incluir(cliente);// Tenta incluir novamente o cliente
											// ao controlador
		System.out.println(ControladorCliente.buscar(cliente.getCpf()));// Imprimi
																		// oque
																		// foi
		// encontrado pelo
		// controlador cliente
		ControladorCliente.alterar(cliente);// Altera o cliente do repositorio
											// pelo controlador
		// clinte
		ControladorCliente.buscarTodos();// Busca todos os clientes existentes
											// no repositorio
		ControladorCliente.excluir(cliente.getCpf());// Exclui o cliente do
														// repositorio pelo
		// controlador cliente
		System.out.println(ControladorCliente.buscar(cliente.getCpf()));// Imprimi
																		// oque
																		// foi
		// encontrado pelo //
		// controlador cliente

	}

}
