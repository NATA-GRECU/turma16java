package lista4;
import java.util.Random;

public class Tarefa3
{
	public static void main(String[] args) 
	{
		/*
		 * 3.	Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
			a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
			b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
		 */
		
		int n2[][] = new int[4][6];
		int n1[][] = new int[4][6];
		int m1[][] = new int[4][6];
		int m2[][] = new int[4][6];
		Random aleatorio = new Random();
		
		for(int linha=0;linha<4;linha++)
		{
			for(int coluna=0;coluna<6;coluna++)
			{
				n1[linha][coluna]=aleatorio.nextInt(9)+1;
				n2[linha][coluna]=aleatorio.nextInt(9)+1;
				
				m1[linha][coluna] = n1[linha][coluna]+n2[linha][coluna];
				m2[linha][coluna] = n1[linha][coluna]-n2[linha][coluna];
			}
		}
		for(int linha = 0;linha<4;linha++)
		{
			System.out.println();
			for(int coluna=0;coluna<6;coluna++)
			{
				System.out.printf("  | "+ m1[linha][coluna]+" |  ");
			}
		}
		System.out.println();
		for(int linha = 0;linha<4;linha++)
		{
			System.out.println();
			for(int coluna=0;coluna<6;coluna++)
			{
				System.out.printf("  | "+ m2[linha][coluna]+" |  ");
			}
		}
		
	}
}
