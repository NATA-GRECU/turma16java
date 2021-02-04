package Lista3POO;

public class Tarefa1Preguica extends Tarefa1Animal implements Tarefa1InterfaceEscalar
{

	public Tarefa1Preguica(String nome, int idade)
	{
		super(nome, idade);
	}
	@Override
	public String subirEmArvores()
	{
		return "Subindo na árvore";
	}
	@Override
	public String emitirSom()
	{
		String preguica = "Som de preguiça";
		return super.emitirSom()+preguica;
	}
	
}	
