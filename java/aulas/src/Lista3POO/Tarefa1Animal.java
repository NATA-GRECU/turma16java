package Lista3POO;

public abstract class Tarefa1Animal
{
	private String nome;
	private int idade;
	private String emitirSom;
	
	public Tarefa1Animal(String nome, int idade)
	{
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() 
	{
		return idade;
	}
	public void setIdade(int idade) 
	{
		this.idade = idade;
	}
	public String getEmitirSom() 
	{
		return emitirSom;
	}
	public void setEmitirSom(String emitirSom) 
	{
		this.emitirSom = emitirSom;
	}
	
	public String emitirSom()
	{
		return "Som do animal: ";
	}
	
}
