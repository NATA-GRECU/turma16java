package lista2POO;

public class Tarefa2FonecedorMain 
{
	public static void main(String[] args) 
	{
		
		Tarefa2Fornecedor joao1 = new Tarefa2Fornecedor("Joao","Av. Paulista","11-33488575",2002);
		joao1.setValorCredito(100);
		joao1.setValorDivida(75);
		
		
		System.out.print("NOME\tENDEREÇO\t\tTELEFONE");
		System.out.println("\n"+joao1.getNome()+"\t"+joao1.getEndereco()+"\t\t"+joao1.getTelefone());
		System.out.println("IDADE:");
		joao1.idade();
		System.out.println("Seu saldo é: ");
		joao1.obterSaldo();
	}
}
