package lista1;

import java.util.Scanner;

public class Lista1Tarefa6 
{
	public static void main(String[] args) 
	{
		double r, p, x1, y1, x2, y2;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um n�mero para X1: ");
		x1 = leia.nextDouble();
		System.out.println("Digite um n�mero para Y1: ");
		y1 = leia.nextDouble();
		System.out.println("Digite um n�mero para X2: ");
		x2 = leia.nextDouble();
		System.out.println("Digite um n�mero para Y2: ");
		y2 = leia.nextDouble();
		
		p = Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2);
		r = Math.sqrt(p);
		
		System.out.println("\nO resultado �: 2");
		System.out.print(r);
	}
}
