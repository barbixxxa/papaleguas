package com.acme.rn.conta;

import java.io.IOException;

import com.acme.ado.classesGerais.IRepositorioRegistro;
import com.acme.ado.classesGerais.RepositorioRegistro;
import com.acme.excecoes.ExcecaoObjetoExistente;
import com.acme.excecoes.ExcecaoObjetoInexistente;
import com.acme.excecoes.ExcecaoValorInvalido;

public class ControladorMovimentoConta {
	private static IRepositorioRegistro<MovimentoConta> rmc = new RepositorioRegistro<MovimentoConta>();// Declaracao
	// e
	// inicializacao
	// do
	// atributo

	public static void inserir(MovimentoConta mc) throws ExcecaoValorInvalido, ExcecaoObjetoExistente, ExcecaoObjetoInexistente, IOException {// Metodo
																	// para
																	// inserir
																	// um
		
		mc.validar();
		rmc.incluir(mc);// Caso contrario atribui o movimento ao repositorio
	}
}
// }
