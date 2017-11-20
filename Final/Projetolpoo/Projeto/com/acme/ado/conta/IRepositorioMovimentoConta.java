package com.acme.ado.conta;

import java.io.IOException;

import com.acme.excecoes.ExcecaoObjetoExistente;
import com.acme.excecoes.ExcecaoObjetoInexistente;
import com.acme.rn.classesGerais.Registro;

public interface IRepositorioMovimentoConta<MovimentoConta extends Registro> {

	public void incluir(MovimentoConta novo) throws ExcecaoObjetoExistente, ExcecaoObjetoInexistente, IOException;

	public MovimentoConta buscar(String s) throws ExcecaoObjetoInexistente, IOException, ClassNotFoundException;

	public MovimentoConta buscarTodos() throws IOException, ClassNotFoundException;

}
