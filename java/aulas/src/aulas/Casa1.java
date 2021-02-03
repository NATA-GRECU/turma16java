package aulas;

public class Casa1 extends ImovelHeranca
{
	private int numeroCasa;
	
	public Casa1(String localizacao, double tamanho, String cor, String tipo) 
	{
		super(localizacao, tamanho, cor, tipo);
	}
	
	public Casa1(String localizacao, double tamanho, String cor, String tipo, int numeroCasa) {
		super(localizacao, tamanho, cor, tipo);
		this.numeroCasa = numeroCasa;
	}

	public void abrirPorta()
	{
		System.out.println("Abrindo a porta...");
	}

	public int getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

}
