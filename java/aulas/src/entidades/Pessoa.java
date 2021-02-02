package entidades;

public class Pessoa 
{
	//Atributos
	public String nome;
	public char genero;
	public int anoNascimento;
	public boolean estaViva;

	//Construtores - pedreiros do classe (tem o mesmo nome que a clase)
	public Pessoa(String nome, boolean estaViva) 
	{
		
		this.nome = nome;
		this.estaViva = estaViva;
	}
	public Pessoa(String nome)
	{
		this.nome = nome;
	}
	public int idade()
	{
		return 2021 - anoNascimento;
	}
	
	public String statusPessoa()
	{
		int idade;
		idade = 2021 - anoNascimento;
		String mensagem;
		if(idade<18)
		{
			mensagem = "Esta pessoa é menor de idade, portanto não pode comprar revistas pornograficas.";
		}
		else
		{
			mensagem = "Esta pessoa é maior de idade, pode comprar qualquer produto da banca.";
		}
		return mensagem;
	}
	public String senhorSenhora()
	{
		String mensagem;
		if(genero == 'M' || genero == 'm')
		{
			mensagem = "Sr.";
		}
		else if(genero == 'F' || genero == 'f')
		{
			mensagem = "Sra.";
		}
		else
		{
			mensagem = "Srx.";
		}
		return mensagem;
	}
	
	
}




//*Sobrecargas

//Encapsulamento

//Metodos
//*Sobrecargas

//Overhide 
//Sobrecarga da sobrecarga