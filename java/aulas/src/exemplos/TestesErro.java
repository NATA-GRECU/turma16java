package exemplos;

import java.util.Scanner;

public class TestesErro 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		try
		{
			System.out.println("Digite uma sequencia de nomes: ");
			String[] vetor = leia.nextLine().split(" ");
			System.out.println("Digite uma posi��o da lista: ");
			int posicao = leia.nextInt();
			System.out.println("O nome na posi��o escolhida � "+vetor[posicao]);
		
		}
		catch(Exception erro)
		{
			System.out.println("Amig�o, voc� precisa digitar corretamente!");
		}
		System.out.println("Fim de programa!!!");
	}
	
}
