package lista3;
import java.util.*;

public class Tarefa6
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		int numerosInteiro,soma=0,contador=0;
		double media=0.00;
		
		do
		{
			System.out.println("Entre com um número: ");
			numerosInteiro = leia.nextInt();
			
			contador++;
			if(numerosInteiro%3 == 0)
			{
				
				soma=soma+numerosInteiro;
				
				
			}
		}
		while(numerosInteiro != 0);

		media=soma/(contador);

		System.out.println(media);
	}
}
