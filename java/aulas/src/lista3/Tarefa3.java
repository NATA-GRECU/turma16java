package lista3;

import java.util.*;
public class Tarefa3 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		int idade,soma21=0,contador21=0,contador50=0;
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		while(idade != -99)
		{
			if(idade <= 21)
			{
				contador21++;
			}
			else if(idade >= 50)
			{
				contador50++;
			}
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
		}
		linha();
		System.out.println("O n�mero de pessoa at� 21 anos � de: "+contador21);
		System.out.println("\nO n�mero de pessoa com mais de 50 � de "+contador50);

	}
	public static void linha()
	{
		System.out.println("---------------------------------------------------------------");
	}
}
