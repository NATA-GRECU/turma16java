package Lista3POO;

public class Tarefa1Cachorro extends Tarefa1Animal implements Tarefa1Interface1
{

	public Tarefa1Cachorro(String nome, int idade) 
	{
		super(nome, idade);
	}

	@Override
	public String deveCorrer() 
	{
		return "Estou correndo";
	}

	@Override
	public String emitirSom() {
		String cachorro = "Au au au!";
		return super.emitirSom()+cachorro;
	}


}
