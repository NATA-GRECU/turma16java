package lista2;

import java.util.*;
public class Tarefa1 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		double x, y, z, numeroMaior;
		
		System.out.println("Digite o 1� n�mero: ");
		x = leia.nextDouble();
		System.out.println("Digite o 2� n�mero: ");
		y = leia.nextDouble();
		System.out.println("Digite o 3� n�mero: ");
		z = leia.nextDouble();
		
		if (x > y && x > z)
		{
			System.out.printf("O n�mero %.0f, foi o maior n�mero digitado.",x);
		}
		else if (y > x && y > z)
		{
			System.out.printf("O n�mero %.0f, foi o maior n�mero digitado.",y);
		}
		else if (z > x && z > y)
		{
			System.out.printf("O n�mero %.0f, foi o maior n�mero digitado.",z);
		}
		else
		{
			System.out.println("Voc� digitou n�meros iguais.");
		}
	}
}
