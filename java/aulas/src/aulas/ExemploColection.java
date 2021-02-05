package aulas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExemploColection 
{
	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		List <Empregados> lista = new ArrayList<>(); //Fazer lista
		//LIST - interface
		
		double acrescimo;
		String nome;
		int matricula;
		int horas;
		double valorHora;
		
		System.out.println("Digite o numero de empregados: ");
		int numero = leia.nextInt();
		
		for (int x=1; x<=numero; x++)
		{
			System.out.println("Funcionario: "+x);
			System.out.println("Você é terceiro [S/N]: ");
			char op = leia.nextLine().toUpperCase().charAt(0);
			leia.nextLine();//Limpar buffer
			System.out.print("Digite seu nome: ");
			nome = leia.nextLine();	
			System.out.print("Digite sua matricula: ");
			matricula = leia.nextInt();
			System.out.print("Digite o valor por hora que você recebe: ");
			valorHora = leia.nextDouble();
			System.out.print("Digite as horas trabalhadas: ");
			horas = leia.nextInt();
			
		if(op == 'S')
		{
			System.out.print("Digite o valor do acréscimo: ");
			acrescimo = leia.nextDouble();
			lista.add(new Terceiro(nome, matricula, horas, valorHora, acrescimo));
		}
		else if (op == 'N')
		{
			lista.add(new Empregados(nome, matricula, horas, valorHora));

		}
		}
		System.out.println();
		System.out.println("PAGAMENTOS:");
		for (Empregados emp : lista)
		{
			System.out.println(emp.getNome()+" - $ "+ String.format("%.2f",emp.calculoSalario()));
		}
	}
}
