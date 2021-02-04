package Lista3POO;

import java.util.Scanner;

public class Tarefa2
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		System.out.println("Escolha qual animal você quer C-cachorro/P-Preguiça/K-Cavalo:");
		char op = leia.next().toUpperCase().charAt(0);
		if(op == 'C')
		{
			System.out.println("Digite o nome do seu cachorro: ");
			String nome = leia.nextLine();
			System.out.println("Digite a idade do seu cachorro: ");
			int idade = leia.nextInt();
			
			Tarefa1Animal dog1 = new Tarefa1Cachorro(nome, idade);
			
			System.out.print("Nome do cachorro: "+dog1.getNome());
			System.out.print("\nIdade do cachorro: "+dog1.getIdade());
			System.out.println("\n"+dog1.emitirSom());
		}
		else if(op == 'P')
		{
			leia.nextLine();
			System.out.println("Digite o nome da sua preguiça: ");
			String nome = leia.nextLine();
			System.out.println("Digite a idade da sua preguiça: ");
			int idade = leia.nextInt();
			
			Tarefa1Animal preg1 = new Tarefa1Preguica(nome, idade);
			
			System.out.print("Nome da sua preguiça: "+preg1.getNome());
			System.out.print("\nIdade da preguiça: "+preg1.getIdade());
			System.out.println("\n"+preg1.emitirSom());
		}
		else if(op == 'K')
		{
			leia.nextLine();
			System.out.println("Digite o nome do seu cavalo: ");
			String nome = leia.nextLine();
			System.out.println("Digite a idade do seu cavalo: ");
			int idade = leia.nextInt();
			
			Tarefa1Animal cav1 = new Tarefa1Cavalo(nome, idade);
			
			System.out.print("Nome do cavalo: "+cav1.getNome());
			System.out.print("\nIdade do cavalo: "+cav1.getIdade());
			System.out.println("\n"+cav1.emitirSom());
		}
	}
}
