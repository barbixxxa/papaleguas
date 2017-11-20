package com.acme.ado.classesGerais;

import com.acme.excecoes.ExcecaoObjetoExistente;
import com.acme.excecoes.ExcecaoObjetoInexistente;
import com.acme.rn.classesGerais.Registro;

public interface IRepositorioRegistro<Identificavel extends Registro> {

	public void incluir(Identificavel novo) throws ExcecaoObjetoExistente, ExcecaoObjetoInexistente;

	public Identificavel buscar(String id) throws ExcecaoObjetoInexistente;

	public boolean excluir(String id) throws ExcecaoObjetoInexistente;

	public boolean alterar(String id, Identificavel novo) throws ExcecaoObjetoExistente, ExcecaoObjetoInexistente;

	public Identificavel buscarTodos();
}
