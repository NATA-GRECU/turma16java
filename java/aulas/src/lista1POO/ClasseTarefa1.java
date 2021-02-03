package lista1POO;

public class ClasseTarefa1
{
	//Atributos
	public String nome;
	public char genero;
	public int anoNascimento;
	public String cpf;
	
	//Construtores
	public ClasseTarefa1(String nome, String cpf) 
	{
		
		this.nome = nome;
		this.cpf = cpf;
	} 
	public ClasseTarefa1(char genero) 
	{
		this.genero = genero;
	}
	public ClasseTarefa1(int anoNascimento) 
	{
		this.anoNascimento = anoNascimento;
	}
	
	
	public int idade()
	{
		return 2021  - anoNascimento;
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	





	
