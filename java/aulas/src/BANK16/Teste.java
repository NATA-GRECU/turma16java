package BANK16;

import java.util.Locale;
import java.util.Scanner;

public class Teste 
{
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		char op;
		double valor;
		//Conta conta1 = new Conta("1212","43615822897");
		
		System.out.println("Digite o numero da conta: ");
		String numero = leia.next();
		System.out.println("Digite o CPF: ");
		String cpf = leia.next();
		
		Conta conta1 = new Conta(numero,cpf);
		
		for (int x=1;x<10; x++)
		{
			System.out.print("Digite D=debito ou C-credito: ");
			op = leia.next().toUpperCase().charAt(0);
			System.out.print("\nDigite o valor: ");
			valor = leia.nextDouble();
			if(op == 'D')
			{
				conta1.debitar(valor);
			}
			else if (op=='C')
			{
				conta1.creditar(valor);
			}
			else
			{
				System.out.println("\nOpção invalida!");
			}
			System.out.println("Saldo atual: "+conta1.getSaldo());
		}
		System.out.println("Fim de programa!");
	}
	
}
