//OK
package com.acme.testes.conta;

import com.acme.rn.cliente.Cliente;
import com.acme.rn.cliente.ControladorCliente;
import com.acme.rn.cliente.Cpf;
import com.acme.rn.conta.ControladorContaMilhagem;
import com.acme.rn.conta.IdentificadorConta;

public class TesteControladorContaMilhagem {
	public static void main(String[] args) {
		String cpf = "11144477735"; // Declaracao da cadeia de caracteres
		Cpf cpff = new Cpf(cpf); // Cria um novo atributo do tipo cpf

		IdentificadorConta id = new IdentificadorConta(Long.parseLong(cpf));// Inicializa
																			// um
																			// novo
																			// identificador
																			// conta
																			// com
																			// o
																			// cpf
																			// como
																			// id

		Cliente cliente = new Cliente(cpff, "Eu", 9999, 9, 1);// Inicializa um
																// novo cliente

		ControladorCliente.incluir(cliente);// Inclui o cliente ao repositorio
											// pelo controlador
		// cliente

		ControladorContaMilhagem.inserir(cpff);// Inseri o cpf a uma conta ao
												// repositorio pelo
		// controlador conta milhagem
		ControladorContaMilhagem.creditar(id, 33310);// Credita pelo controlador
														// conta milhagem
		System.out.println(ControladorContaMilhagem.buscar(id));// Imprimi a
																// conta
																// encontrada
		ControladorContaMilhagem.debitar(id, 33300);// Debita pelo controlador
													// conta milhagem
		ControladorContaMilhagem.transferir(id, id, 1);// Transfere pelo
														// controlador conta
														// milhagem
		// Diz que ja existe pq executa o programa no mesmo segundo
		ControladorContaMilhagem.BuscarTodos();// Busca todas as contas
												// existentes

	}
}
