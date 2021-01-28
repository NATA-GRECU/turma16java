package lista3;
import java.util.*;
public class Tarefa2
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		int numero,contadorPar=0,contadorImpar=0;
		
		
		for(int x = 0; x<10;x++)
		{
			System.out.println("Entre com um número: ");
		numero = leia.nextInt();
			if(numero%2 == 0)
			{
				contadorPar++;
			}
			else if (numero%2 != 0)
			{
				contadorImpar++;
			}
		}
		System.out.printf("Você digitou %d números par.",contadorPar);
		System.out.printf("\nE %d números impar",contadorImpar);

	}
}
