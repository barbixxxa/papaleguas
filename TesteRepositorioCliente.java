package com.acme.testes.cliente;

import com.acme.ado.cliente.RepositorioCliente;
import com.acme.rn.cliente.Cliente;
import com.acme.rn.cliente.Cpf;

public class TesteRepositorioCliente {

	public static void main(String[] args) throws Exception {
		String cpf = "11144477735"; // Declaracao da cadeia de caracteres
		Cpf cpfUm = new Cpf(cpf); // Cria um novo atributo do tipo cpf
		Cliente c = new Cliente(cpfUm, "Son \"Kakaroto\" Goku", 789, 25, 1); // Cria
																				// um
																				// novo
																				// atributo
																				// do
																				// tipo
																				// cliente
																				// com
																				// tais
																				// atributos
		Cliente c1 = new Cliente(cpfUm, "Marta Vieira da Silva", 2154, 29, 2); // Cria
																				// um
																				// novo
																				// atributo
																				// do
																				// tipo
																				// cliente
																				// com
																				// tais
																				// atributos
		RepositorioCliente rc = new RepositorioCliente(); // Cria um novo
															// atributo do tipo
															// repositoriocliente

		rc.incluir(c); // Inclui o cliente c

		System.out.println(rc.buscar(cpfUm)); // Procura pelo cliente c e
												// imprimi o que foi encontrado
		rc.alterar(cpfUm, c1); // Altera dados do cliente
		rc.buscarTodos(); // Lista tudo que esta presente no array
		rc.excluir(cpfUm); // Exclui o cliente com este cpf
		rc.buscarTodos();
	}

}
