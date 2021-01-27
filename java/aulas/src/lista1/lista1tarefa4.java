package lista1;

import java.util.Scanner;

public class lista1tarefa4 
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		double A, B, C, D, R, S;
		System.out.println("Entre com um valor para A: ");
		A = ler.nextInt();
		System.out.println("Entre com um valor para B: ");
		B = ler.nextInt();
		System.out.println("Entre com um valor para C: ");
		C = ler.nextInt();
		
		R=Math.pow(A, 2)+Math.pow(B, 2);
		S=Math.pow(B, 2)+Math.pow(C, 2);
		D = ((R+S)/2);
		
		System.out.println(R);
		System.out.println(S);
		System.out.println(D);
		
	}
}
