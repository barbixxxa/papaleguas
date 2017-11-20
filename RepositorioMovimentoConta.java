package com.acme.ado.conta;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.acme.rn.cliente.Cpf;
import com.acme.rn.conta.ContaMilhagem;
import com.acme.rn.conta.IdentificadorConta;
import com.acme.rn.conta.MovimentoConta;

public class RepositorioMovimentoConta {
	private MovimentoConta[] movimentoContaNovo; // Declaracao dos atributos
	private int quantidade;

	public RepositorioMovimentoConta() { // Construtor
		movimentoContaNovo = new MovimentoConta[150]; // Array
		quantidade = 0; // Contador
	}

	public void incluir(MovimentoConta MovimentoContaNovo) { // Metodo para
																// incluir nova
																// conta
		if (quantidade < movimentoContaNovo.length) { // Verifica se ha espaco
														// no array
			if ((buscar(MovimentoContaNovo.getcontaOrigem(), MovimentoContaNovo.getData())) == false) { // Verificacao
				// do
				// cpf
				// e
				// identificadorConta
				movimentoContaNovo[quantidade] = MovimentoContaNovo; // Atribui
																		// a
																		// conta
																		// ao
																		// array
				quantidade++; // Aumenta o contador
				System.out.println("Movimento registrado.\n"); // Mensagem de
																// sucesso
			} else {
				System.out.println("Movimento ja foi registrado.\n"); // Mensagem
																		// de
																		// erro
			}
		} else {
			System.out.println("Lista lotada.\n"); // Mensagem de erro
		}
	}

	public boolean buscar(ContaMilhagem cm, Date data) { // Metodo
															// para
															// buscar
															// uma conta
		boolean r = false; // Inicializa uma conta nula
		for (int i = 0; i < quantidade; i++) { // Loop para encontrar a conta
			if ((cm.equals(movimentoContaNovo[i].getcontaOrigem())) && (data.equals(movimentoContaNovo[i].getData()))) {
				r = true; // Atribui a conta encontrada a conta nula
				break;
			} // Sai do loop
		}
		return r; // Retorna a conta
	}

	public void buscarTodos() { // Metodo para listar as informacoes do array
		List list = Arrays.asList(movimentoContaNovo);
		System.out.println(list);
	}
}
