package aulas;
import java.util.*;
public class ContaPoupanca
{
	public static void main(String[] args)
	{
		System.out.println("BANCO G4");
		Scanner leia = new Scanner(System.in);
		double saldo=0.00,creditar=0.00,correcao=0.00;
		
		char opcao;
		
		do
		{
		System.out.println("SELECIONE O MOVIMENTO - D/C:");
		opcao = leia.next().charAt(0);
				
		if(opcao == 'D' || opcao =='d')
		{
			System.out.println("Você nao pode debitar, pois seu saldo é zero");
		}
		else if(opcao == 'C' || opcao == 'c')
		{
			System.out.println("Qual valor você quer creditar: ");
			creditar = leia.nextDouble();
			saldo += creditar;
		}System.out.println("Descrição: ");
		System.out.println("SALDO ATUAL: "+saldo);
		System.out.println("CONTINUA S/N: ");
		opcao = leia.next().charAt(0);
		}
		
		while(opcao == 'S' || opcao == 's');
				do
				{
				System.out.println("CORREÇÃO MONETARIA S/N: ");
				opcao = leia.next().charAt(0);
				if(opcao == 's' || opcao == 'S')
				{
					correcao = (saldo*0.0005)+saldo;
					System.out.println("Seu saldo com a correção monetaria é de: R$ "+correcao);
				}
				}
				while(opcao == 'n' || opcao == 'N');
				
	}
}
