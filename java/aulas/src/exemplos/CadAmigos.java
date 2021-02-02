package exemplos;

import java.util.Scanner;

import entidades.Pessoa;

public class CadAmigos {

	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		Pessoa brother1 = new Pessoa("Natã");
		
		System.out.println("Digite o nome: ");
		brother1.nome = leia.next();
		System.out.println("Digite M-masculino ou F-feminino: ");
		brother1.genero = leia.next().toUpperCase().charAt(0);
		System.out.println("Digite o ano de nascimento [aaaa]: ");
		brother1.anoNascimento = leia.nextInt();
		
		System.out.printf("Olá %s %s, sua idade aproximada é de %d anos. ",brother1.senhorSenhora(),brother1.nome,brother1.idade());
		System.out.println(brother1.statusPessoa());
		
	}

}
