//OK
package com.acme.testes.conta;

import java.util.Date;
import com.acme.rn.cliente.Cliente;
import com.acme.rn.cliente.Cpf;
import com.acme.rn.conta.ContaMilhagem;
import com.acme.rn.conta.ControladorMovimentoConta;
import com.acme.rn.conta.IdentificadorConta;
import com.acme.rn.conta.MovimentoConta;

public class TesteControladorMovimentoConta {

	public static void main(String[] args) {
		Date data = new Date();// Inicializa uma nova data
		Cpf cpf = new Cpf("11144477735");// Inicializa um novo cpf
		Cliente cliente = new Cliente(cpf, "Eu", 9999, 9, 1);// Inicializa um
																// novo cliente
		IdentificadorConta id = new IdentificadorConta(Long.parseLong(cpf.getCpf()));// Inicializa
																						// um
																						// novo
																						// identificador
																						// conta
																						// com
																						// o
																						// cpf
																						// como
																						// id
		ContaMilhagem cm = new ContaMilhagem(id, cliente);// Inicializa uma nova
															// conta milhagem
		MovimentoConta mc = new MovimentoConta(cm, 987654, "Oi", data);// Inicializa
																		// um
																		// novo
																		// movimento
																		// conta

		ControladorMovimentoConta.inserir(mc);// Inseri o movimento conta ao
												// repositorio pelo
		// controlador conta

	}

}
