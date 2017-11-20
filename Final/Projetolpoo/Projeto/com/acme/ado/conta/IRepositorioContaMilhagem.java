package com.acme.ado.conta;

import java.io.IOException;

import com.acme.excecoes.ExcecaoObjetoExistente;
import com.acme.excecoes.ExcecaoObjetoInexistente;
import com.acme.rn.classesGerais.Registro;
import com.acme.rn.conta.IdentificadorConta;

public interface IRepositorioContaMilhagem<ContaMilhagem extends Registro> {
	public void incluir(ContaMilhagem novo) throws ExcecaoObjetoExistente, ExcecaoObjetoInexistente, IOException;

	public ContaMilhagem buscar(IdentificadorConta id)
			throws ExcecaoObjetoInexistente, IOException, ClassNotFoundException;

	public boolean excluir(IdentificadorConta id) throws ExcecaoObjetoInexistente, ClassNotFoundException, IOException;

	public boolean alterar(IdentificadorConta id, ContaMilhagem novo)
			throws ExcecaoObjetoExistente, ExcecaoObjetoInexistente, IOException, ClassNotFoundException;

	public ContaMilhagem buscarTodos() throws IOException, ClassNotFoundException;

}
