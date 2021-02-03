package BANK16;

public class ContaCorrente extends Conta
{
	private int qtMesTalao;
	
	public ContaCorrente(String numero, String cpf)
	{
		super(numero, cpf);
	}
	
	public void emitirTalao(int qtde)
	{
		if(qtde > 3)
		{
			System.out.println("Voc� nao pode emitir mais que 3 tal�es por m�s");
		}
	}
	public int getQtMesTalao() {
		return qtMesTalao;
	}

	public void setQtMesTalao(int qtMesTalao) {
		this.qtMesTalao = qtMesTalao;
	}
	
}
