package lista4;
import java.util.*;
public class Tarefa1 
{
	public static void main(String[] args)
	{
		/*
		 * 1.	Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o 
		 * de uma atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente. 
		 */
		Scanner leia = new Scanner(System.in);
		int pontuacao[]= new int[5];
		int maiorNumero=0;
		
		for(int x=0; x<5; x++)
		{
			System.out.printf("Digite o valor da atividade %d: " ,(x+1));
			pontuacao[x] = leia.nextInt();
			
			if(pontuacao[x]>maiorNumero)
			{
				maiorNumero = pontuacao[x];
			}
		}
		for(int x=0; x<5; x++)
			{
				System.out.print("\nOs valores das atividade s�o: "+pontuacao[x]);
				
			}				System.out.println("\nO maior valor foi: "+maiorNumero);

	}
}
