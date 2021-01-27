package lista1;

import java.util.Scanner;

public class Lista1Tarefa2 
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		int idadePessoa, anos, meses, dias;
		System.out.print("Digite sua idade total em dia: ");
		idadePessoa = leia.nextInt();
		
		anos = (idadePessoa/365);
		meses = (idadePessoa%365)/30;
		dias = (idadePessoa%365)%30;
		
		System.out.printf("Sua idade em anos, meses e dias é: %d anos, %d meses, %d dias",anos,meses,dias);
		
	}
}
