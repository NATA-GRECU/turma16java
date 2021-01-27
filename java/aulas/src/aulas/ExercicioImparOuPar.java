package aulas;

import java.util.Scanner;

public class ExercicioImparOuPar 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		int numeroDigitado, numeroPar;
		
		System.out.println("Digite um número positivo: ");
		numeroDigitado = leia.nextInt();
		
		numeroPar = (numeroDigitado%2);
		
		if(numeroDigitado < 0)
		{
			System.out.println("Desculpe, este número não é positivo.");
		}
		else if(numeroDigitado == 0)
		{
			System.out.println("O 0 é neutro.");
		}
		else if(numeroPar == 0)
		{
			System.out.printf("O número %d é par.",numeroDigitado);
		}
		else
		{
			System.out.printf("O número %d é impar.",numeroDigitado);
		}
		
				
				
				
	}
}
