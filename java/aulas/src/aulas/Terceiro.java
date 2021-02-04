package aulas;

public class Terceiro extends Empregados
{
	private double acrescimo;
	public Terceiro(String nome, int matricula, int horas, double valorHora, double acrescimo)
	{
		super(nome, matricula, horas, valorHora);
		this.acrescimo = acrescimo;
	}
	public double getAcrescimo()
	{
		return acrescimo;
	}
	public void setAcrescimo(double acrescimo) {
		this.acrescimo = acrescimo;
	}

	@Override
	public double calculoSalario() 
	{
		double novoSalario = (super.getHoras()*super.getValorHora())+((super.getHoras()*super.getValorHora())*acrescimo);
		return novoSalario;
	}

}
