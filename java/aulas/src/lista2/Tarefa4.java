package lista2;
import java.util.*;

public class Tarefa4 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		double numeroDigitado, numeroPar,numeroParRaiz,numeroImpar,numeroImparPotencia;
		
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
			numeroParRaiz = Math.sqrt(numeroDigitado);
			System.out.printf("O n�mero %.0f � par. E sua raiz �: %.0f",numeroDigitado,numeroParRaiz);
		}
		else
		{
			numeroDigitado = Math.pow(numeroDigitado, 2);
			System.out.printf("O n�mero � impar. Ele elavado ao quadrado �: %.0f",numeroDigitado);
		}
	}
}
