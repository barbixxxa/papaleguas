package p;
//OK
//OK
public class TesteRepositorioContaMilhagem {

	public static void main(String[] args) {
		String cpff = "04623671186";													//Inicializa o atributo do tipo cadeia de caracteres
		Cpf cpf = new Cpf(cpff);														//Inicializa o atributo do tipo Cpf com a cadeia de caracteres recebida
		Cliente c = new Cliente(cpf, "Eu", 999, 28, 1);									//Inicializa o atributo do tipo Cliente com os atributos recebidos
		IdentificadorConta id = new IdentificadorConta(2015);							//Inicializa o atributo do tipo IdentificadorConta com o inteiro recebido
		ContaMilhagem cm = new ContaMilhagem(id, c);									//Inicializa o atributo do tipo ContaMilhagem com os atributos recebidos
		RepositorioContaMilhagem rcm = new RepositorioContaMilhagem();					//Inicializa o atributo do tipo RepositorioContaMilhagem
		rcm.incluir(cm);																//Inclui ao repositorio a contamilhagem
		
		System.out.println("Cliente: \n" + rcm.buscar(cm.getCliente().getCpf(), id));	//Imprimi o resultado da busca no repositorio
		
		rcm.excluir(cpf,id);															//Exclui do repositorio a conta com o cpf e identificadorconta recebidos
		
		System.out.println("Cliente: \n" + rcm.buscar(cm.getCliente().getCpf(), id));	//Imprimi o resultado da busca no repositorio
		
		rcm.incluir(cm);																//Inclui ao repositorio a contaMilhagem
		id.setIdentificadorConta(9999);													//Altera o indetificadorConta
		ContaMilhagem cmNovo = new ContaMilhagem(id, c);								//Inicializa o atributo do tipo ContaMilhagem com os atributos recebidos
		rcm.alterar(cm, cmNovo);														//Altera a contaMilhagem
		rcm.buscarTodos();																//Busca e lista todas as informaçoes presente no array
	}

}
