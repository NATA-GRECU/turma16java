package lista4;
import java.util.Random;
public class Tarefa2 
{
	public static void main(String[] args) 
	{
		/*
		 * 2.	Um dado é lançado 10 vezes e o valor correspondente é anotado. 
		 * Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
		 * A seguir determine e imprima a média aritmética dos lançamentos, contabilize e 
		 * apresente também quantas foram as ocorrências da maior pontuação.
		 */
		
		int lancamento[] = new int[10];
		int somaDados=0;
		double mediaDados=0.00;
		int maiorPontuacao=0, contador=0;
		
		for(int x=0; x<10; x++)
		{
			Random aleatorio = new Random();
			System.out.printf("Lançamento do dado %d : ",(x+1));
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
		System.out.printf("O maior dado lançado foi %d, e ele foi lançado: %d vez(es).",maiorPontuacao,contador);
		System.out.printf("\nA média aritmetica dos dados é de: %.2f",mediaDados);
	}			

}
