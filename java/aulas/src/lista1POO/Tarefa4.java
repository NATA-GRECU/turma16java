package lista1POO;
import java.util.*;
public class Tarefa4 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		ClasseTarefa4 funcionario = new ClasseTarefa4();
		
		System.out.print("Digite o nome do funcionario: ");
		funcionario.nome = leia.nextLine();
		System.out.print("Digite o registro do funcionario: ");
		funcionario.codigoRegistro = leia.nextInt();
		System.out.print("Digite o ano de nascimento do funcionario: ");
		funcionario.anoNascimento = leia.nextInt();
		System.out.print("Digite o salario do funcionario: ");
		funcionario.salario = leia.nextDouble();
		
		System.out.println();
		System.out.println("NOME\tREGISTRO\tIDADE\tSALARIO");
		System.out.println(funcionario.nome+"\t"+funcionario.codigoRegistro+"\t\t"+funcionario.idade()+"\t"+funcionario.salario);
	}
	
}
