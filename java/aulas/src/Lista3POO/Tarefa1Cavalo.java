package Lista3POO;

public class Tarefa1Cavalo extends Tarefa1Animal implements Tarefa1Interface1
{


	public Tarefa1Cavalo(String nome, int idade) 
	{
		super(nome, idade);
	}

	@Override
	public String deveCorrer() 
	{
		return "Cavalo está correndo";
	}

	@Override
	public String emitirSom() 
	{
		String cavalo = "Relinchar";
		return super.emitirSom()+cavalo;
	}
	
	
}
