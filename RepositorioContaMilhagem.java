package p;
import java.util.Arrays;
import java.util.List;
//OK
//OK
public class RepositorioContaMilhagem {
	private ContaMilhagem[] conta;																						//Declaracao dos atributos
	private int qtd;
	
	public RepositorioContaMilhagem(){																					//Construtor
		conta = new ContaMilhagem[150];																					//Array
		qtd=0;																											//Contador
	}
	
	public void incluir(ContaMilhagem novo){																			//Metodo para incluir conta
		if(qtd < conta.length){																							//Verifica se ha espaco no array
			if(buscar(novo.getCliente().getCpf(), novo.getIdentificadorConta()) == null){								//Verificacao do cpf e IdentificadorConta
				conta[qtd] = novo;																						//Atribui a conta ao array
				qtd++;																									//Aumenta o contador
				System.out.println("Conta cadastrada com sucesso.\n");													//Mensagem de sucesso
			}else{
				System.out.println("Conta ja existe.\n");																//Mensagem de erro
			}
		}else{
			System.out.println("Lista lotada.\n");																		//Mensagem de erro
		}
	}
		
	public ContaMilhagem buscar(Cpf cpf, IdentificadorConta id){														//Metodo para buscar conta pelo cpf e identificadorConta
		ContaMilhagem c = null;																							//Inicializa uma conta nula
		for(int i=0;i<qtd;i++){																							//Loop para encontrar a conta
			if(conta[i].getCliente().getCpf().equals(cpf) && conta[i].getIdentificadorConta().equals(id)){				//Verificacao da conta pelo cpf e IdentificadorConta
				c = conta[i];																							//Atribui a conta encontrada a conta nula
				break;																									//Sai do loop
			}
			else if(c==null){																							//Verifica a conta nula
				System.out.println("Conta inexistente.\n");																//Mensagem de erro
			}
		}
		return c;																										//Retorna a conta
	}

	public boolean excluir(Cpf cpf,IdentificadorConta id){																//Metodo para excluir conta
		boolean t = false;																								//Inicializa o atributo com valor logico falso
		for(int i=0;i<qtd;i++){																							//Loop para encontrar a conta
			if(conta[i].getCliente().getCpf().equals(cpf) && conta[i].getIdentificadorConta().equals(id)){				//Verificacao da conta pelo cpf e identificadorConta
				conta[i] = conta[qtd];																					//Atribui a ultima conta a conta encontrada
				conta[qtd] = null;																						//Exclui a ultima conta
				System.out.println("Exclusao feita com sucesso.\n");													//Mensagem de sucesso
				qtd--;																									//Diminui o contador
				t = true;																								//Altera para valor logico verdadeiro
				break;																									//Sai do loop
			}
			
		}if(t==false){																									//Verifica o valor logico do atributo
			System.out.println("Conta inexistente.\n"																	//Mensagem de erro
					+ "Nao e possivel excluir\n");
		 }
		return t;																										//Retorna o valor logico do atributo
	}
	
	public boolean alterar(ContaMilhagem antigo, ContaMilhagem novo){													//Metodo para alterar informacoes da conta
		if(this.excluir(antigo.getCliente().getCpf(), antigo.getIdentificadorConta())){									//Caso exista uma conta e esta seja excluida entao
			this.incluir(novo);																							//Inclui a conta nova
			return true;																								//Retorna o valor logico verdadeiro
		}
		return false;																									//Retorna o valor logico falso
	}
	
	public void buscarTodos(){																							//Metodo para listar todas as informacoes do array
		List list = Arrays.asList(conta);
		System.out.println(list);
		
		/*for(int i=0;i<qtd;i++){
			System.out.println(conta[i]);
		}*/

}
}
