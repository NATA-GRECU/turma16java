package aulas;

import java.util.Scanner;

public class ExercicioImparOuPar 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		int numeroDigitado, numeroPar;
		
		System.out.println("Digite um n�mero positivo: ");
		numeroDigitado = leia.nextInt();
		
		numeroPar = (numeroDigitado%2);
		
		if(numeroDigitado < 0)
		{
			System.out.println("Desculpe, este n�mero n�o � positivo.");
		}
		else if(numeroDigitado == 0)
		{
			System.out.println("O 0 � neutro.");
		}
		else if(numeroPar == 0)
		{
			System.out.printf("O n�mero %d � par.",numeroDigitado);
		}
		else
		{
			System.out.printf("O n�mero %d � impar.",numeroDigitado);
		}
		
				
				
				
	}
}
