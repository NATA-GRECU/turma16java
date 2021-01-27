package lista2;
import java.util.*;

public class Tarefa4 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		double numeroDigitado, numeroPar,numeroParRaiz,numeroImpar,numeroImparPotencia;
		
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
			numeroParRaiz = Math.sqrt(numeroDigitado);
			System.out.printf("O número %.0f é par. E sua raiz é: %.0f",numeroDigitado,numeroParRaiz);
		}
		else
		{
			numeroDigitado = Math.pow(numeroDigitado, 2);
			System.out.printf("O número é impar. Ele elavado ao quadrado é: %.0f",numeroDigitado);
		}
	}
}
