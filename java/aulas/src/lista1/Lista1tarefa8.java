package lista1;

import java.util.Scanner;

public class Lista1tarefa8
{
	public static void main(String[] args)
	{
		double custoFabrica, custoConsumidor, taxa;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o custo de fábrica: ");
		custoFabrica = leia.nextDouble();
				
		taxa = ((custoFabrica*0.28)+(custoFabrica*0.45));
		custoConsumidor = custoFabrica+taxa;
		
		System.out.printf("O custo para o cusimidor é de: R$ %.2f ",custoConsumidor);
		
	}
}
