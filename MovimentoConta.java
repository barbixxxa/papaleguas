package p;
//OK
//OK

import java.util.Date;

public class MovimentoConta {

	private ContaMilhagem contaO;										//Declaracao dos atributos
	private ContaMilhagem contaD;
	private int valor;
	private int tipo;
	private String nomeFonte;
	private Date data;
	
	public MovimentoConta(ContaMilhagem contaO, int valor, int tipo,	//Construtor para inicializar os atributos
			ContaMilhagem contaD, String nomeFonte, Date data){
		this.contaO = contaO;
		this.valor = valor;
		this.tipo = tipo;
		this.contaD = contaD;
		this.nomeFonte = nomeFonte;
		this.data = data;
	}
	
	public ContaMilhagem getContaO(){									//Metodo para receber a conta
		return contaO;
	}
	
	public ContaMilhagem getContaD(){									//Metodo para receber a conta
		return contaD;
	}
	
	public int getValor(){												//Metodo para receber o valor 
		return valor;
	}
	
	public int getTipo(){												//Metodo para receber o tipo
		return tipo;
	}
	
	public String getNomeFonte(){										//Metodo para receber o nome da fonte
		return nomeFonte;
	}
	
	public Date getData(){												//Metodo para receber a data
		return data;
	}
	
	public void Data(){													//Metodo para iniciar o atributo data
		data = new Date();
	}
	
	public String getNomeExtrato(){										//Metodo para receber o nome no extrato
		String s;
		if(contaO.getCliente().getSexo() == 0){							//Se o sexo do cliente for masculino
			s = " MR.";
		}
		
		else{
			s = " MRS.";												//Se nao for masculino entao e feminino
		}
		
		return "" + contaO.getCliente().getUltimoNome().toUpperCase() +	//Retorna o ultimo e o primeiro nome do cliente em maiuscula seguido da saudacao
		", " + contaO.getCliente().getPrimeiroNome().toUpperCase() + s;
	}
	
	public String toString(){											//Metodo que altera o tipo original para o tipo cadeia de caracteres
		return  this.getContaO().toString()
				+ "Valor: " + this.getValor()
				+ "\nTipo: " + this.getTipo()
				+ "\nConta de Destino: \n" + this.getContaD()
				+ "Nome da Fonte: " + this.getNomeFonte()
				+ "\nData: " + this.getData() + "\n";
	}
	
	
	
}
