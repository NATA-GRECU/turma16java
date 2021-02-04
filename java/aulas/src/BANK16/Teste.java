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
		System.out.println("Dia de aniversario: ");
		int dia = leia.nextInt();
		int qtde=0;
		while(dia <= 0 || dia > 31)
		{
			System.out.println("Data invalida! Tente de novo [1-31]: ");
			dia = leia.nextInt();
		}		
		
		System.out.println("Você deseja fazer um talão [S/N]: ");
		op = leia.next().toUpperCase().charAt(0);
		if(op == 'S')
		{
			System.out.println("Quantos talões deseja emitir: ");
			qtde =  leia.nextInt();
			
			while(qtde>3)
			{
				System.out.println("Voce so pode imprimir até 3 talões por mês. Digite novamente: ");
				qtde = leia.nextInt();
			}
		}
		ContaCorrente conta1 = new ContaCorrente(numero, cpf, qtde );
		conta1.emitirTalao(qtde);
		//ContaPoupanca conta1 = new ContaPoupanca(numero, cpf,dia);
		//Conta conta1 = new Conta(numero,cpf);
		
		
		for (int x=1;x<4; x++)
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
		//System.out.println("Digite o dia de hoje: ");
		//dia = leia.nextInt();
		//conta1.aniversario(dia);
		//System.out.printf("Saldo atual: R$ %.2f",conta1.getSaldo());
		System.out.println("\nFim de programa!");
	}
	
}
