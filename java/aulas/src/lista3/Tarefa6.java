package lista3;
import java.util.*;

public class Tarefa6
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		double numerosInteiro,soma=0.00,contador=0.00;
		double media=0.00;
		
		do
		{
			System.out.println("Entre com um n�mero: ");
			numerosInteiro = leia.nextInt();
			
			if(numerosInteiro%3 == 0 && numerosInteiro != 0)
			{
				contador++;
				soma=soma+numerosInteiro;
				
				
			}
		}
		while(numerosInteiro != 0);
		if(contador != 0)
		{
		media=soma/(contador);
		System.out.println("M�dia dos multiplos de 3 igual a: "+media);
		}
		else
		{
			System.out.println("Nenhum n�mero multiplo de 3 foi informado, n�o existe m�dia.");
		}
	}
}
