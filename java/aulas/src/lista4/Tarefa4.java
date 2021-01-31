package lista4;
import java.util.*;

public class Tarefa4 
{
	public static void main(String[] args) 
	{
		/*
		 * 4.	Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, 
		 * exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
		 */
		Scanner leia = new Scanner(System.in);
		int matriz[][] = new int[3][3];
		int somaValores, somaDiagonal=0;
		final int TAMANHO=3;
		for(int linha=0;linha<TAMANHO;linha++)
		{
			for(int coluna=0; coluna<TAMANHO;coluna++)
			{
				System.out.println("Digite um valor: ");
				matriz[linha][coluna] = leia.nextInt();
				
				if(linha == coluna)
				{
					somaDiagonal += matriz[linha][coluna];
				}
			}
			
			System.out.println();
		}
		for(int linha=0;linha<TAMANHO;linha++)
		{
			for(int coluna=0; coluna<TAMANHO;coluna++)
			{
				
				System.out.println("  | \t"+matriz[linha][coluna]+"  | ");
			}
			
			System.out.println();
		}
		System.out.println("A soma da diagonal principal é: "+somaDiagonal);
	
	}
}
