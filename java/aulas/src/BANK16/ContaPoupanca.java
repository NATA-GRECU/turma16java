package BANK16;

public class ContaPoupanca extends Conta
{
	private int diaAniversario;
	public ContaPoupanca(String numero, String cpf, int diaAniversario)
	{
		super(numero, cpf);
		this.diaAniversario = diaAniversario;
	}
	
	public int getDiaAniversario() {
		return diaAniversario;
	}
	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	public void aniversario(int dia)
	{
		double correcao = super.getSaldo()*0.0005;
		if(dia == diaAniversario)
		{
			super.creditar(correcao);
		}
	}
	

}
