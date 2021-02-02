package lista5;

public class ClasseTarefa2 
{
	public boolean aviao;
	public int acelerar;
	public boolean andarFrente;
	public boolean puxarMancheTras;
	public boolean voando;
	
	void ligarAviao()
	{
		aviao = true;
		System.out.println("Avião ligado...");
	}
	void aumentarVelocidade()
	{
		System.out.println("Acelerando...");
		for(int x=0;x<280;x++)
		{
		int velocidadeNova = (x+10);
		x=velocidadeNova;
		System.out.println(x);
		}
	}
	void manche()
	{
		puxarMancheTras = true;
		System.out.println("Levantando vôo...");
	}
	void voar()
	{
		voando = true;
		System.out.println("Voando...");
	}
	
	}
