package p;
//OK
//OK

import java.util.Arrays;
import java.util.List;

public class RepositorioMovimentoConta {
	private MovimentoConta[] mc;																								//Declaracao das variaveis
	private int qtd;
	
	public RepositorioMovimentoConta(){																							//Construtor 
		mc = new MovimentoConta[150];																							//Array
		qtd=0;																													//Contador
	}
	
	public void incluir(MovimentoConta novo){																					//Metodo para incluir nova conta
		if(qtd < mc.length){																									//Verifica se ha espaco no array
			if(buscar(novo.getContaO().getCliente().getCpf(), novo.getContaO().getIdentificadorConta()) == null){				//Verificacao do cpf e identificadorConta
				mc[qtd] = novo;																									//Atribui a conta ao array
				qtd++;																											//Aumenta o contador
				System.out.println("Movimento registrado.\n");																	//Mensagem de sucesso
			}else{
				System.out.println("Movimento ja foi registrado.\n");															//Mensagem de erro
			}
		}else{
			System.out.println("Lista lotada.\n");																				//Mensagem de erro
		}
	}
		
	public MovimentoConta buscar(Cpf cpf, IdentificadorConta id){																//Metodo para buscar uma conta
		MovimentoConta c = null;																								//Inicializa uma conta nula
		for(int i=0;i<qtd;i++){																									//Loop para encontrar a conta
			if(mc[i].getContaO().getCliente().getCpf().equals(cpf) && mc[i].getContaO().getIdentificadorConta().equals(id)){	//Verificacao do cpf e identificadorConta
				c = mc[i];																										//Atribui a conta encontrada a conta nula
				break;																											//Sai do loop
			}
			else if(c==null){																									//Verificacao da conta nula
				System.out.println("Movimento inexistente.\n");																	//Mensagem de erro
			}
		}
		return c;																												//Retorna a conta
	}
	
	public void buscarTodos(){																									//Metodo para listar as informacoes do array
		List list = Arrays.asList(mc);
		System.out.println(list);
		
		/*for(int i=0;i<qtd;i++){
			System.out.println(mc[i]);
		}*/
	}
}
