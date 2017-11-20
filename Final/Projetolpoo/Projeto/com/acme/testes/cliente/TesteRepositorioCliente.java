package com.acme.testes.cliente;

import com.acme.ado.cliente.RepositorioCliente;
import com.acme.rn.cliente.Cliente;
import com.acme.rn.cliente.Cpf;

public class TesteRepositorioCliente {

	public static void main(String[] args) throws Exception {
		String cpf = "11144477735"; // Declaracao da cadeia de caracteres
		String cpfD = "04623671186";
		Cpf cpfUm = new Cpf(cpf); // Cria um novo atributo do tipo cpf
		Cpf cpfDois = new Cpf(cpfD);
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
		Cliente c1 = new Cliente(cpfDois, "Marta Vieira da Silva", 2154, 29, 2); // Cria
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
		rc.incluir(c1);

		System.out.println(rc.buscar(cpfUm)); // Procura pelo cliente c e		
											// imprimi o que foi encontrado
		rc.buscarTodos();
		System.out.println(rc.buscar(cpfDois));
		rc.alterar(cpfUm, c1); // Altera dados do cliente
		rc.buscarTodos(); // Lista tudo que esta presente na pasta
		
		
	}

}
