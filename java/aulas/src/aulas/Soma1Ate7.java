package aulas;
import java.util.*;
public class Soma1Ate7 
{
	public static void main(String[] args) 
	{
		Scanner leia =  new Scanner(System.in);
		int numeroDigitado,x;
		
		System.out.println("Digite um número: ");
		numeroDigitado = leia.nextInt();
		
		x=numeroDigitado;
		
		do
		{
			x = x-1;
			numeroDigitado = numeroDigitado+x;
		}
		while (x != 0);
		System.out.println(numeroDigitado);
			
		
	}
}
