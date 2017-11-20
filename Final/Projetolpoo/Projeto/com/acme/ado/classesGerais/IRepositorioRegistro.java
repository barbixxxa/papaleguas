package com.acme.ado.classesGerais;



import java.io.IOException;

import com.acme.excecoes.ExcecaoObjetoExistente;
import com.acme.excecoes.ExcecaoObjetoInexistente;
import com.acme.rn.classesGerais.Registro;

public interface IRepositorioRegistro<Identificavel extends Registro> {

	public void incluir(Identificavel novo) throws ExcecaoObjetoExistente, ExcecaoObjetoInexistente, IOException;

	public Identificavel buscar(String id) throws ExcecaoObjetoInexistente, IOException, ClassNotFoundException;

	public boolean excluir(String id) throws ExcecaoObjetoInexistente, ClassNotFoundException, IOException;

	public boolean alterar(String id, Identificavel novo) throws ExcecaoObjetoExistente, ExcecaoObjetoInexistente, IOException, ClassNotFoundException;

	public Identificavel buscarTodos() throws ClassNotFoundException, IOException;
}
