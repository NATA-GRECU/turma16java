package lista1;

import java.util.Scanner;

public class Lista1Tarefa7 
{
	public static void main(String[] args) 
	{
		double a,b,c,d,e,f,x,y;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um valor para A: ");
		a = leia.nextDouble();
		System.out.println("Digite um valor para B: ");
		b = leia.nextDouble();
		System.out.println("Digite um valor para C: ");
		c = leia.nextDouble();
		System.out.println("Digite um valor para D: ");
		d = leia.nextDouble();
		System.out.println("Digite um valor para E: ");
		e = leia.nextDouble();
		System.out.println("Digite um valor para F: ");
		f = leia.nextDouble();
		
		x = (((c*e)-(b*f))/((a*e)-(b*d)));
		y = (((a*f)-(c*d))/((a*e)-(b*d)));
		
		System.out.println("O resultado de X é: ");
		System.out.print(x);
		System.out.println("\nO resultado de Y é: ");
		System.out.print(y);
		
	}
}
