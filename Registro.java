package com.acme.rn.classesGerais;

public abstract class Registro {

	public abstract String getChave(); // Metodo para retornar chave que todos
										// que herdam devem implementar

	public abstract void validar() throws Exception; // Metodo validar que deve ser implementado
									// pelos herdeiros
}
