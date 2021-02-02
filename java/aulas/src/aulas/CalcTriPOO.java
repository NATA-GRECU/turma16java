package aulas;

import java.util.Locale;
import java.util.Scanner;

public class CalcTriPOO 
{
	public static void main(String[] args) 
	{	
		Locale.setDefault(Locale.US); //Define o tipo de padronização (usar ele primeiro)
		Scanner leia = new Scanner(System.in);
		double base, altura, area,base2,altura2,area2,base3,altura3,area3,maiorArea;
		
		System.out.println("Digite a base do triângulo: ");
		base = leia.nextDouble();
		System.out.println("Digite a altura do triangulo: ");
		altura = leia.nextDouble();
		area = ((base*altura)/2);
		//
		System.out.println("Digite a base do 2º triângulo: ");
		base2 = leia.nextDouble();
		System.out.println("Digite a altura do 2º triangulo: ");
		altura2 = leia.nextDouble();
		area2 = ((base2*altura2)/2);
		//
		System.out.println("Digite a base do 3º triângulo: ");
		base3 = leia.nextDouble();
		System.out.println("Digite a altura do 3º triangulo: ");
		altura3 = leia.nextDouble();
		area3=((base3*altura3)/2);
		//
		if(area > area2 && area > area3)
		{
			System.out.printf("A maior área do tringulo formado é a do 1º com %.2f",area);
		}
		else if(area2>area && area2 >area3)
		{
			System.out.printf("A maior área do tringulo formado é a do 2º com  %.2f",area2);
		}
		else if(area3>area && area3 > area2)
		{
			System.out.printf("A maior área do tringulo formado é a do 3º com %.2f",area3);
		}
	}
}
