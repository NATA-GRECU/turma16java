package lista2;

import java.util.*;

public class Tarefa3 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		int idadePessoa;
		
		System.out.println("Digite sua idade: ");
		idadePessoa = leia.nextInt();
		
		if(idadePessoa >= 10 && idadePessoa<=14)
		{
			System.out.printf("Voc� tem %d anos, e est� na categoria Infatil ",idadePessoa);
		}
		else if(idadePessoa <= 17)
		{
			System.out.printf("Voc� tem %d anos, e est� na categoria Juvenil ",idadePessoa);
		}
		else if(idadePessoa <= 25)
		{
			System.out.printf("Voc� tem %d anos, e est� na categoria Adulto ",idadePessoa);
		}
	}
}
