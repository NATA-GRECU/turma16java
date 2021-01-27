package lista1;

import java.util.Scanner;

public class lista1tarefa1 
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int ano,mes,dia,diasIdade;
		System.out.print("Digite sua idade usando ANOS MESES e DIAS");
		System.out.print("\nANO:");
		ano = ler.nextInt();
		System.out.print("\nMES:");
		mes = ler.nextInt();
		System.out.print("\nDIA:");
		dia = ler.nextInt();
		
		diasIdade = ((ano*365)+(mes*30)+dia);
		
		//System.out.println("Sua idade em dias é de:");
		System.out.printf("\nSua idade em dias é de = %d",diasIdade);
		
		ler.close();
		
	}
}
