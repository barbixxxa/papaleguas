package com.acme.menu;


import java.util.Scanner;


import com.acme.rn.cliente.Cliente;
import com.acme.rn.cliente.ControladorCliente;
import com.acme.rn.cliente.Cpf;
import com.acme.rn.conta.ControladorContaMilhagem;
import com.acme.rn.conta.ControladorMovimentoConta;
import com.acme.rn.conta.IdentificadorConta;

public class MenuSemInterface {

	private static int sexo, idade, x;
	private static long idLong, idLongCredito;
	private static double renda, valor;
	private static String nome, cpff, cpfff;
	static Scanner sc = new Scanner(System.in);
	private static Cpf cpf, cpfDois;
	private static Cliente cliente, clienteNovo;
	private static IdentificadorConta id, idCredito;
	
	public static void dadosCliente() throws Exception {
		System.out.println("Insira o cpf:");
		cpff = sc.nextLine();
		cpf = new Cpf(cpff);
		System.out.println("Insira o nome:");
		nome = sc.nextLine();
		System.out.println("Insira a renda:");
		renda = sc.nextFloat();
		System.out.println("Insira a idade:");
		idade = sc.nextInt();
		System.out.println("Insira o sexo(1 = Masculino e 2 = Feminino): ");
		sexo = sc.nextInt();
	}
	
	public static void cpfCliente() throws Exception{
		System.out.println("Insira o cpf:");
		cpff = sc.nextLine();
		cpf = new Cpf(cpff);
	}

	public static void incluirCliente() throws Exception {
		dadosCliente();
		cliente = new Cliente(cpf, nome, renda, idade, sexo);
		ControladorCliente.incluir(cliente);
	}

	public static void buscarCliente() throws Exception {
		cpfCliente();
		System.out.println(ControladorCliente.buscar(cpf));
	}

	public static void alterarCliente() throws Exception {
		System.out.println("Insira o cpf do Cliente Antigo:");
		cpfff = sc.nextLine();
		cpfDois = new Cpf(cpfff);

		dadosCliente();
		clienteNovo = new Cliente(cpf, nome, renda, idade, sexo);
		ControladorCliente.alterar(cpfDois, clienteNovo);
	}

	public static void excluirCliente() throws Exception {
		cpfCliente();
		ControladorCliente.excluir(cpf);
	}

	public static void opcoesClientes() throws Exception {
		do {

			System.out.println("Digite:\n" + "1 para Incluir\n" + "2 para Buscar\n" + "3 para Alterar\n"
					+ "4 para Excluir\n" + "9 para Voltar ao Menu\n" + "0 para Sair...");
			x = sc.nextInt();
			sc.nextLine();
			switch (x) {
			case 1: {
				incluirCliente();

				break;
			}
			case 2: {
				buscarCliente();

				break;
			}
			case 3: {
				alterarCliente();
				break;
			}
			case 4: {
				excluirCliente();
				break;
			}
			case 9:{
				menu();
				break;
			}
			default: {
				System.out.println("Operacao cancelada.");
				break;
			}
			}
		} while (x != 0);
	}

	public static void extrato() throws Exception {
		ControladorMovimentoConta.BuscarTodos();
	}
	
	public static void dadosTransacoes() throws Exception{
		System.out.println("Insira o identificador conta:");
		idLong = sc.nextLong();
		System.out.println("Insira o valor:");
		valor = sc.nextDouble();
		id = new IdentificadorConta(idLong);
	}
	
	public static void creditarConta() throws Exception{
		dadosTransacoes();
		ControladorContaMilhagem.creditar(id, valor);
	}
	
	public static void debitarConta() throws Exception{
		dadosTransacoes();
		ControladorContaMilhagem.debitar(id, valor);
	}
	
	public static void transferirConta() throws Exception{
		dadosTransacoes();
		System.out.println("Insira o identificador da conta destino:");
		idLongCredito = sc.nextLong();
		idCredito = new IdentificadorConta(idLongCredito);
		ControladorContaMilhagem.transferir(id, idCredito, valor);
	}
	
	public static void buscarConta() throws Exception{
		System.out.println("Insira o identificador conta:");
		idLong = sc.nextLong();
		id = new IdentificadorConta(idLong);
		System.out.println(ControladorContaMilhagem.buscar(id));
	}
	
	public static void opcoesConta() throws Exception{
		do {

			System.out.println("Digite:\n" + "1 para Creditar\n" + "2 para Debitar\n" + "3 para Transferir\n"
					+ "4 para Buscar\n" + "5 para Extrato\n" + "9 para Voltar ao Menu\n" + "0 para Sair...");
			x = sc.nextInt();
			sc.nextLine();
			switch (x) {
			case 1: {
				creditarConta();
				break;
			}
			case 2: {
				debitarConta();

				break;
			}
			case 3: {
				transferirConta();
				break;
			}
			case 4: {
				buscarConta();
				break;
			}
			case 5:{
				extrato();
				break;
			}
			case 9:{
				menu();
				break;
			}
			default: {
				System.out.println("Operacao cancelada.");
				break;
			}
			}
		} while (x != 0);
	}
	
	public static void menu() throws Exception {
		do {

			System.out.println(
					"Digite:\n" + "1 para Opcoes de Cliente\n" + "2 para Opcoes de Conta\n" + "0 para Sair...\n");
			x = sc.nextInt();
			sc.nextLine();
			switch (x) {
			case 1: {
				opcoesClientes();
				break;
			}
			case 2: {
				opcoesConta();
				break;
			}
			default: {
				System.out.println("Operacao cancelada.");
				break;
			}
			}
		} while (x != 0);
	}

	public static void main(String[] args) throws Exception {
		menu();

	}

}
