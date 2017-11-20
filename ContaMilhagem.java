package p;
//OK
//OK
public class ContaMilhagem {

	private IdentificadorConta identificador;						//Declaracao dos atributos
	private Cliente cliente;					
	private int saldo;
	private boolean ativo;

	public IdentificadorConta getIdentificadorConta(){				//Metodo para retornar o identificador da conta
		return identificador;
	}
	
	public boolean getStatus(){										//Metodo para retornar o status da conta
		return ativo;
	}
	
	public int getSaldo(){											//Metodo para retornar o saldo
		return saldo;
	}
	
	public Cliente getCliente(){									//Metodo para retornar o cliente
		return cliente;
	}
	
	public void creditar(int valor){								//Metodo para creditar um valor
	this.saldo += valor;
	}

	public void debitar(int valor){									//Metodo para debitar um valor
		if(saldo>valor)												//Verifica se o saldo permite o debito
		this.saldo -= valor;
	}


	public void transferir (int valor, ContaMilhagem conta){		//Metodo para transferir um valor de uma para outra conta
		if(conta.ativo == true){									//Verifica o status da conta
		this.debitar(valor);										//Debita o valor da conta de origem
		conta.creditar(valor);										//Credita o valor a conta de destino
		}
		else{													
			System.out.println("Conta desativada, nao Ã© possivel transferir.");
		}
	}

	public void desativar(){										//Metodo para desativar conta
		if(ativo==true)												//Verifica se a conta esta ativa
		this.ativo = false;
	}

	public void reativar(){											//Metodo para reativar conta
		if(ativo == false)											//Verifica se a conta esta desativada
		this.ativo = true;
	}

	public ContaMilhagem ( IdentificadorConta id, Cliente cliente){ //Construtor para inicializar os atributos
	this.identificador = id;										//Atribui os valor recebidos aos atributos
	this.cliente = cliente;
	this.saldo = 0;
	this.ativo = true;
	}

	public String toString(){										//Metodo que altera o tipo original para o tipo cadeia de caracteres
		return  this.getCliente().toString()
				+ "Saldo: " + this.getSaldo() + "\n"
				+ "Identificador: " + identificador.getIdentificadorConta() + "\n"
				+ "Ativo: " + this.getStatus() + "\n";
	}
	
}
