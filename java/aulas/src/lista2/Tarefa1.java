package lista2;

import java.util.*;
public class Tarefa1 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		double x, y, z, numeroMaior;
		
		System.out.println("Digite o 1º número: ");
		x = leia.nextDouble();
		System.out.println("Digite o 2º número: ");
		y = leia.nextDouble();
		System.out.println("Digite o 3º número: ");
		z = leia.nextDouble();
		
		if (x > y && x > z)
		{
			System.out.printf("O número %.0f, foi o maior número digitado.",x);
		}
		else if (y > x && y > z)
		{
			System.out.printf("O número %.0f, foi o maior número digitado.",y);
		}
		else if (z > x && z > y)
		{
			System.out.printf("O número %.0f, foi o maior número digitado.",z);
		}
		else
		{
			System.out.println("Você digitou números iguais.");
		}
	}
}
