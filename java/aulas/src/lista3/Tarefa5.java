package lista3;

import java.util.*;
public class Tarefa5 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		int numero,soma=0;
		
		System.out.println("Digite um numero: ");
		numero = leia.nextInt();
		soma = numero;
		do
		{
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();
			soma = soma+numero;

		}
		while(numero != 0);
		System.out.println("A soma dos números digitados é: "+soma);
		
		
	}
}
