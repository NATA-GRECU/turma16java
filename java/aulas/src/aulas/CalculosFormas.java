package aulas;

import java.util.Locale;
import java.util.Scanner;

import formas.Triangulo;

public class CalculosFormas {

	public static void main(String[] args)
	{
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in); //instanciou o teclado - classe scanner.
		Triangulo tri1 = new Triangulo(); //Criou um triangulo
		Triangulo tri2 = new Triangulo();
		
		
		System.out.println("Digite a base do primeiro triângulo 1 ");
		tri1.base = leia.nextDouble();
		System.out.println("Digite a altura do triangulo 1: ");
		tri1.altura = leia.nextDouble();
		System.out.println("Área do triangulo 1: ");
		tri1.area();
		
		System.out.println("\nSEGUNDO CASO: ");
		System.out.println("Digite a base do primeiro triângulo 2: ");
		tri2.base = leia.nextDouble();
		System.out.println("Digite a altura do triangulo 2: ");
		tri2.altura = leia.nextDouble();
		
		System.out.println("Área do triangulo 3: ");
		tri2.area();		
	}

}
