package p;

import java.util.Scanner;
import p.Cpf;
import p.Cliente;
import p.IdentificadorConta;
import p.MovimentoConta;
import p.ContaMilhagem;
import p.RepositorioContaMilhagem;
import p.RepositorioMovimentoConta;
import p.RepositorioCliente;
public class TesteFULL {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		RepositorioCliente r = new RepositorioCliente();
		
		Cpf cPf,novoCPf;
		String cpf,nome,novoNome,novoCpf;
		int idade,sexo,novaIdade,novoSexo;
		float renda,novaRenda;
		Cliente c,k;
		
		do{

		System.out.println("Digite:\n"
				+ "1 para incluir\n"
				+ "2 para excluir\n"
				+ "3 para buscar\n"
				+ "4 para alterar\n"
				+ "Qualquer tecla para sair...");
		x = sc.nextInt();
		sc.nextLine();
		switch(x){
		case 1:{
			System.out.println("Insira o cpf:");
			cpf = sc.nextLine();
			cPf = new Cpf(cpf);
			System.out.println("Insira o nome:");
			nome = sc.nextLine();
			System.out.println("Insira a renda:");
			renda = sc.nextFloat();
			System.out.println("Insira a idade:");
			idade = sc.nextInt();
			System.out.println("Insira o sexo(0 = Masculino e 1 = Feminino): ");
			sexo = sc.nextInt();
			c = new Cliente(cPf,nome,renda,idade,sexo);
			r.incluir(c);
			     break;
			     }
		case 2:{
            System.out.println("Insira o cpf:");
            cpf = sc.nextLine();
            cPf = new Cpf(cpf);
            /*System.out.println("Insira o nome:");
            nome = sc.nextLine();
            System.out.println("Insira a renda:");
            renda = sc.nextFloat();
            System.out.println("Insira a idade:");
            idade = sc.nextInt();
            System.out.println("Insira o sexo(0 = Masculino e 1 = Feminino): ");
            sexo = sc.nextInt();
            c = new Cliente(cPf,nome,renda,idade,sexo);
            r.excluir(cPf);*/
	     		 break;
	     	   	 }
		case 3:{
            System.out.println("Insira o cpf:");
            cpf = sc.nextLine();
            cPf = new Cpf(cpf);
            /*System.out.println("Insira o nome:");
            nome = sc.nextLine();
            System.out.println("Insira a renda:");
            renda = sc.nextFloat();
            System.out.println("Insira a idade:");
            idade = sc.nextInt();
            System.out.println("Insira o sexo(0 = Masculino e 1 = Feminino): ");
            sexo = sc.nextInt();
            c = new Cliente(cPf,nome,renda,idade,sexo);*/
            System.out.println(r.buscar(cPf).toString());
			 	 break;
			     }
		case 4:{ System.out.println("Insira o cpf:");
            cpf = sc.nextLine();
            cPf = new Cpf(cpf);
            /*System.out.println("Insira o nome:");
            nome = sc.nextLine();
            System.out.println("Insira a renda:");
            renda = sc.nextFloat();
            System.out.println("Insira a idade:");
            idade = sc.nextInt();
            System.out.println("Insira o sexo(0 = Masculino e 1 = Feminino): ");
            sexo = sc.nextInt();
            c = new Cliente(cPf,nome,renda,idade,sexo);*/
             System.out.println("Insira o novo cpf:");
			 novoCpf = sc.nextLine();
			 novoCPf = new Cpf(novoCpf);
			 System.out.println("Insira o novo nome:");
			 novoNome = sc.nextLine();
			 System.out.println("Insira a nova renda:");
			 novaRenda = sc.nextFloat();
			 System.out.println("Insira a nova idade:");
			 novaIdade = sc.nextInt();
			 System.out.println("Insira o novo sexo(0 = Masculino e 1 = Feminino: ");
			 novoSexo = sc.nextInt();
			 k = new Cliente(novoCPf,novoNome,novaRenda,novaIdade,novoSexo);
				 r.alterar(cPf, k);
				 break;
			    }
		default:{ System.out.println("OperaÃ§Ã£o cancelada.");
				  break;
				}
		}
	}while(x!=0);	sc.close();
  }
		
		
}
