package lista1;

import java.util.Scanner;

public class lista1tarefa5 
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		double nota1, nota2, nota3, mediaFinal;
		
		System.out.println("Digite a 1� nota: ");
		nota1 = ler.nextDouble();
		System.out.println("Digite a 2� nota: ");
		nota2 = ler.nextDouble();
		System.out.println("Digite a 3� nota: ");
		nota3 = ler.nextDouble();
		
		mediaFinal = (((nota1*2)+(nota2*3)+(nota3*5))/(2+3+5));
		
		System.out.println("Sua m�dia final foi de :");
		System.out.println(mediaFinal);

		
	}
}
