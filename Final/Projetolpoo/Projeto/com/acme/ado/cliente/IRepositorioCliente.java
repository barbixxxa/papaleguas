package com.acme.ado.cliente;

import java.io.IOException;

import com.acme.excecoes.ExcecaoObjetoExistente;
import com.acme.excecoes.ExcecaoObjetoInexistente;
import com.acme.rn.classesGerais.Registro;
import com.acme.rn.cliente.Cpf;

public interface IRepositorioCliente<Cliente extends Registro> {

	public void incluir(Cliente novo) throws ExcecaoObjetoExistente, ExcecaoObjetoInexistente, IOException;

	public Cliente buscar(Cpf cpf) throws ExcecaoObjetoInexistente, IOException, ClassNotFoundException;

	public boolean excluir(Cpf cpf) throws ExcecaoObjetoInexistente, ClassNotFoundException, IOException;

	public boolean alterar(Cpf cpf, Cliente novo) throws ExcecaoObjetoExistente, ExcecaoObjetoInexistente, IOException, ClassNotFoundException;

	public Cliente buscarTodos() throws IOException, ClassNotFoundException;
}
