package lista4;
import java.util.Random;
public class Tarefa2 
{
	public static void main(String[] args) 
	{
		/*
		 * 2.	Um dado � lan�ado 10 vezes e o valor correspondente � anotado. 
		 * Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor. 
		 * A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize e 
		 * apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.
		 */
		
		int lancamento[] = new int[10];
		int somaDados=0;
		double mediaDados=0.00;
		int maiorPontuacao=0, contador=0;
		
		for(int x=0; x<10; x++)
		{
			Random aleatorio = new Random();
			System.out.printf("Lan�amento do dado %d : ",(x+1));
			lancamento[x] = aleatorio.nextInt(6)+1;
			System.out.println(lancamento[x]);
			somaDados += lancamento[x];
			
			if(lancamento[x] >= maiorPontuacao)
			{

				if(lancamento[x] == maiorPontuacao)
				{
					contador++;
				}
				else
				{
					contador=1;
				}				
				maiorPontuacao = lancamento[x];

			}
			
		}
		mediaDados = somaDados/10;
		System.out.printf("O maior dado lan�ado foi %d, e ele foi lan�ado: %d vez(es).",maiorPontuacao,contador);
		System.out.printf("\nA m�dia aritmetica dos dados � de: %.2f",mediaDados);
	}			

}
