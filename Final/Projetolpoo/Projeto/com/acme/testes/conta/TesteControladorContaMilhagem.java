package com.acme.testes.conta;

import com.acme.rn.cliente.Cliente;
import com.acme.rn.cliente.ControladorCliente;
import com.acme.rn.cliente.Cpf;
import com.acme.rn.conta.ControladorContaMilhagem;
import com.acme.rn.conta.IdentificadorConta;

public class TesteControladorContaMilhagem {
	public static void main(String[] args) throws Exception {
		/**
		 * Declaracao e inicializacao dos atributos
		 */
		String cpf = "11144477735";
		String cpf2 = "04623671186";
		Cpf cpff = new Cpf(cpf);
		Cpf cpfDois = new Cpf(cpf2);

		IdentificadorConta id = new IdentificadorConta(Long.parseLong(cpf));
		IdentificadorConta id2 = new IdentificadorConta(Long.parseLong(cpf2));

		Cliente cliente = new Cliente(cpff, "Eu", 9999, 199, 1);
		Cliente c1 = new Cliente(cpfDois, "Marta Vieira da Silva", 2154, 29, 2);

		ControladorCliente.incluir(cliente);// Incluir cliente
		ControladorCliente.incluir(c1);

		ControladorContaMilhagem.creditar(id, 666);// Creditar na ContaMilhagem
		System.out.println(ControladorContaMilhagem.buscar(id));// Buscar a
																// ContaMilhagem
		ControladorContaMilhagem.debitar(id, 111);// Debitar na ContaMilhagem
		System.out.println(ControladorContaMilhagem.buscar(id));
		ControladorContaMilhagem.transferir(id, id2, 1);// Transferir nas
														// ContasMilhagens
		System.out.println(ControladorContaMilhagem.buscar(id));

		ControladorContaMilhagem.BuscarTodos();// Buscar todas as
												// ContasMilhagens
	}
}
