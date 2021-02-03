package lista1POO;

public class Tarefa1
{
	public static void main(String[] args)
	{
		ClasseTarefa1 cliente1 = new ClasseTarefa1("Natã Grecu","10110210101");
		ClasseTarefa1 cliente2 = new ClasseTarefa1('M');
		ClasseTarefa1 cliente3 = new ClasseTarefa1(2002);
		
		System.out.println("NOME\t\tGENÊRO\t\tIDADE\t\tCPF");
		System.out.println(cliente1.nome+"\t"+cliente2.genero+"\t\t"+cliente3.idade()+"\t\t"+cliente1.cpf);
	}
}
