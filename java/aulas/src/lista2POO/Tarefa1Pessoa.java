package lista2POO;
/*
 * 1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores
		(getters) e modificadores (setters), e ainda o construtor padr�o e pelo menos mais duas
		op��es de construtores conforme sua percep��o. Atributos: String nome; String endere�o;
		String telefone;
 */
public class Tarefa1Pessoa 
{
	private String nome;
	private String endereco;

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	private String telefone;
	private double altura;
	private int anoNascimento;

	public Tarefa1Pessoa(String nome, String endereco, String telefone, int anoNascimento) 
	{
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.anoNascimento = anoNascimento;
	}
	
	public Tarefa1Pessoa(double altura)
	{
		super();
		this.altura = altura;
	}
	
	void idade()
	{
		System.out.println(2021-anoNascimento);;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
	
}
