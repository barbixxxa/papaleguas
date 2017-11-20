package p;
//OK
//OK

public class IdentificadorConta {

	
	private long numero;											//Declaracao dos atributos
	private int digitoVerificador; 															   
	
	public IdentificadorConta(long numero){ 						//Construtor para inicializar o atributo numero
		this.setIdentificadorConta(numero);							//Atribui ao atributo o valor long recebido
	}
	
	public void setIdentificadorConta(long numero){					//Metodo para atribuir valor ao atributo     
		this.numero = numero;										//Atribui ao atributo o valor long recebido
	}
	
	public long getIdentificadorConta(){							//Metodo para receber o valor do atributo
		return numero;
	}
	
	public int calcularDigitoVerificador(long valor){				//Metodo para calcular o digito verificador, recebendo um long
		int soma = 0;  												//Inicializa a variavel soma
			while (valor != 0) {  									//Realiza os passos seguintes caso o valor recebido seja diferente de 0
			soma += valor % 10;  									//Atribui a variavel soma o valor do resto da divisao da variavel valor e o numero 10
			valor /= 10;  											//Divide o valor da variavel valor por 10, para diminuir uma casa decimal
			}
		digitoVerificador = (soma%99);								//Atribui ao atributo o valor do resto da divisao da variavel soma e o numero 99
		return digitoVerificador;  									//Retorna o valor do atributo
	}
	
	public boolean verificarValidadeDigito(int digitoVerificador){	//Metodo para verificar a validade do digito verificador, recebendo um inteiro
		boolean verificar = false;								//Inicializa a variavel verificacao booleana com o valor logico falso
		if(this.digitoVerificador == digitoVerificador){			//Verifica se o digito informado e igual ao calculado
			verificar = true;										//Ja que o digito foi verificado atribui o valor logico verdadeiro a variavel verificacao
		}
				
		return verificar;											//Retorna o valor logico da variavel verificacao
	}


}
