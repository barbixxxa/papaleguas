//OK
package com.acme.testes.classesGerais;

import com.acme.ado.classesGerais.RepositorioIdentificavel;
import com.acme.rn.classesGerais.Identificavel;

public class TesteRepositorioIdentificavel {
	public static void main(String args[]) {
		Identificavel id = new Identificavel(); // Declaracao e inicializacao
												// dos atributos
		RepositorioIdentificavel repIdent = new RepositorioIdentificavel();

		repIdent.incluir(id); // Inclui o atributo ao repositorio
		System.out.println(repIdent.buscar(id.getChave())); // Imprimi o que foi
															// encontrado pelo
															// metodo buscar
		repIdent.buscarTodos(); // Metodo buscar todos
		repIdent.alterar(id.getChave(), id); // Altera o atributo do repositorio
		repIdent.excluir(id.getChave());// Exclui o atributo do repositorio
		repIdent.buscarTodos();// Busca todos
	}

}
