//OK 19/11 16:51
package com.acme.rn.cliente;

import com.acme.excecoes.ExcecaoValorInvalido;
import com.acme.rn.classesGerais.Registro;

public class Cliente extends Registro {
	private String nome; // Declaracao dos atributos
	private Cpf cpf;
	private float renda;
	private int idade;
	private int sexo;
	private static final int masculino = 1, feminino = 2;

	public Cliente(Cpf cpf, String nome, float renda, int idade, int sexo) throws ExcecaoValorInvalido { // Construtor
		// para
		// inicializar
		// os
		// atributos
		this.setCpf(cpf); // Atribui ao atributo o valor recebido
		this.setIdade(idade);
		this.setNome(nome);
		this.setRenda(renda);
		this.setSexo(sexo);
		this.validar();
	}

	public String getNome() { // Metodo para receber o valor do atributo
		return nome;
	}

	public String getPrimeiroNome() { // Metodo para receber o valor do atributo
		int indice = nome.indexOf(" "); // Recebe o valor do local onde se
										// encontra a cadeia de caracteres
										// buscada
		String primeiroNome = nome.substring(0, indice); // Recebe a cadeia de
															// caracteres da
															// posicao inicial
															// ate a final,
															// ambas dadas
		return primeiroNome; // Retorna a cadeia de caracteres
	}

	public String getUltimoNome() { // Metodo para receber o valor do atributo
		int indice = nome.lastIndexOf(" "); // Recebe o valor do ultimo local
											// onde se encontra a cadeia de
											// caracteres buscada
		String ultimoNome = nome.substring(indice + 1); // Recebe a cadeia de
														// caracteres da posicao
														// inicial até a final
														// da cadeia de
														// caracteres
		return ultimoNome; // Retorna a cadeia de caracteres
	}

	public float getRenda() { // Metodo para receber o valor do atributo
		return renda;
	}

	public int getIdade() { // Metodo para receber o valor do atributo
		return idade;
	}

	public int getSexo() { // Metodo para receber o valor do atributo
		return sexo;
	}

	public Cpf getCpf() {// Metodo para receber cpf
		return cpf;
	}

	public void setCpf(Cpf cpf) throws ExcecaoValorInvalido {// Metodo para
																// atribuir cpf
		if (cpf != null) {
			this.cpf = cpf;
		} else {
			throw new ExcecaoValorInvalido("erro.Cliente.cpfInvalido");
		}

	}

	public void setNome(String nome) throws ExcecaoValorInvalido { // Metodo
																	// para
																	// atribuir
																	// valor ao
																	// atributo
		if (nome != null) {
			this.nome = nome;
		} else {
			throw new ExcecaoValorInvalido("erro.Cliente.nomeInvalido");
		}
	}

	public void setRenda(float renda) throws ExcecaoValorInvalido { // Metodo
																	// para
																	// atribuir
																	// valor ao
		if (renda > 0) {
			this.renda = renda;
		} else {
			throw new ExcecaoValorInvalido("erro.Cliente.rendaInvalida");
		}
	}

	public void setIdade(int idade) throws ExcecaoValorInvalido { // Metodo para
																	// atribuir
																	// valor ao
																	// atributo
		if (idade > 0) {
			this.idade = idade;
		} else {
			throw new ExcecaoValorInvalido("erro.Cliente.idadeInvalida");
		}
	}

	public void setSexo(int sexo) throws ExcecaoValorInvalido { // Metodo para
																// atribuir
																// valor ao
																// atributo
		if (sexo == masculino || sexo == feminino) {
			this.sexo = sexo;
		} else {
			throw new ExcecaoValorInvalido("erro.Cliente.sexoInvalido");
		}
	}

	public String getChave() {
		return cpf.getCpf();
	}

	public void validar() throws ExcecaoValorInvalido {
		if (this.cpf != null) {
			if (this.nome != null && (this.nome.length() < 60) && !this.nome.startsWith(" ")) {
				if (17 < this.idade && this.idade < 201) {
					if (this.renda == 0 || (this.renda > 0 && this.renda <= 1000000)) {
						if (this.sexo == masculino || this.sexo == feminino) {

						} else {
							throw new ExcecaoValorInvalido("erro.Cliente.sexoInvalido");
						}
					} else {
						throw new ExcecaoValorInvalido("erro.Cliente.rendaInvalida");
					}
				} else {
					throw new ExcecaoValorInvalido("erro.Cliente.idadeInvalida");
				}
			} else {
				throw new ExcecaoValorInvalido("erro.Cliente.nomeInvalido");
			}
		} else {
			throw new ExcecaoValorInvalido("erro.Cliente.cpfInvalido");
		}
	}

	public String toString() { // Metodo que altera o tipo original para o tipo
								// cadeia de caracteres
		return "Cpf: " + cpf.getCpf() + "\n" + "Nome: " + this.getNome() + "\n" + "Renda: " + this.getRenda() + "\n"
				+ "Idade: " + this.getIdade() + "\n" + "Sexo: " + this.getSexo() + "\n";
	}

	public boolean equals(Object o) { // Metodo para comparar dois objetos
		boolean r = false;// Inicializa com o valor logico falso
		if (o instanceof Cliente) {// Verifica se o objeto e do tipo cliente
			r = this.getCpf().equals(((Cliente) o).getCpf());// Compara dois
																// objetos caso
																// sejam iguais
																// atribui o
																// valor logico
																// verdadeiro
		}
		return r;// Retorna o valor logico
	}

}
