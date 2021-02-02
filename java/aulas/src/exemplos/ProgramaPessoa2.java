package exemplos;

import entidades.Pessoa;

public class ProgramaPessoa2 
{
	public static void main(String[] args) 
	{
		Pessoa cliente1 = new Pessoa("JEAN CESARIO");
		Pessoa cliente2 = new Pessoa("PAOLA ALENCAR");
		Pessoa cliente3 = new Pessoa("NATÃ", true);
		
		cliente1.nome = "JEAN CESARIO";
		cliente1.estaViva = false;
		
		if(cliente1.estaViva)
		{
			System.out.println("ELE ESTÁ VIVO");
			
		}
		else
		{
			System.out.println("Sei la meu!!!");
		}
		
		System.out.println(cliente2.nome);
		System.out.println(cliente3.nome);

		
	}
}
