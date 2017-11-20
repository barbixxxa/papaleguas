package p;
//OK
//OK
import p.MovimentoConta;
import p.ContaMilhagem;
import p.IdentificadorConta;
import java.util.Date;
import java.util.Scanner;

public class TesteMovimentoConta {
	
	public static void main(String[] args) {
		
		int valor, tipo;																	//Declaracao de atributos do tipo inteiro
		String nomeFonte;																	//Declaracao do atributo do tipo cadeia de caracteres
		Date data = new Date();																//Inicializacao do atributo do tipo data
		Cpf cpf = new Cpf("11144477735");													//Inicializacao do atributo do tipo cpf
		Cliente c = new Cliente(cpf, "Son \"Kakaroto\" Goku", 96969, 25, 0);				//Inicializacao do atributo do tipo cliente
		IdentificadorConta idc = new IdentificadorConta(99);								//Inicializacao do atributo do tipo identificadorConta
		IdentificadorConta idcc = new IdentificadorConta(54);								//Inicializacao do atributo do tipo identificadorConta	
		ContaMilhagem cmO = new ContaMilhagem(idc, c);										//Inicializacao do atributo do tipo ContaMilhagem
		ContaMilhagem cmD = new ContaMilhagem(idcc, c);										//Inicializacao do atributo do tipo ContaMilhagem
		Scanner sc = new Scanner(System.in);												//Inicializacao do scanner
		
		System.out.println("Insira o valor: ");												//Imprimi mensagem na tela
		valor = sc.nextInt();																//Atribui ao atributo o proximo inteiro digitado
		System.out.println("Insira o tipo: ");												//Imprimi mensagem na tela
		tipo = sc.nextInt();																//Atribui ao atributo o proximo inteiro digitado
		System.out.println("Insira o nome da fonte: ");										//Imprimi mensagem na tela
		nomeFonte = sc.next();																//Atribui ao atributo a proxima cadeia de caracteres digitada
		
		MovimentoConta mc = new MovimentoConta(cmO, valor, tipo, cmD, nomeFonte, data);		//Inicializacao do atributo do tipo MovimentoConta
		System.out.println(mc.toString() + "\n" + mc.getNomeExtrato());						//Imprimi na tela as informacoes do movimentoConta
		sc.close();																			//Fecha o scanner
	}

}
