package aulas;

public class ProdutoConstrutor 
{
	//Atributos
	public int cod;
	public String descricao;
	public double valor;
	
	//Construtores
	public ProdutoConstrutor() //Construtor padrão
	{
		
	}
	public ProdutoConstrutor(String descricao, int cod, double valor) 
	{
		this.descricao = descricao;
		this.cod = cod;
		this.valor = valor;
	}
	public ProdutoConstrutor(String descricao, int cod) 
	{
		this.descricao = descricao;
		this.cod = cod;
	}
	public ProdutoConstrutor(String descricao)
	{
		this.descricao = descricao;
	}
	
	
}
