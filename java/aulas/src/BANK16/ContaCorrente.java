package BANK16;

public class ContaCorrente extends Conta
{
	public int qtMesTalao;

	public ContaCorrente(String numero, String cpf, int qtMesTalao) 
	{
		super(numero, cpf);
		this.qtMesTalao = qtMesTalao;
	}

	public int getQtMesTalao() 
	{
		return qtMesTalao;
	}

	public void setQtMesTalao(int qtMesTalao) 
	{
		this.qtMesTalao = qtMesTalao;
	}
	public void emitirTalao(int qtde)
	{
		while(qtde > 3)
		{
			System.out.println("Você só pode imprimir 3 talões por mês.");
			
		}
	}
	
}
