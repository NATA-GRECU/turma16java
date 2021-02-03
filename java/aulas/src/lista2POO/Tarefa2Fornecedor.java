package lista2POO;

public class Tarefa2Fornecedor extends Tarefa1Pessoa
{
	private double valorCredito;
	private double valorDivida;
	
	public Tarefa2Fornecedor(String nome, String endereco, String telefone, int anoNascimento) 
	{
		super(nome, endereco, telefone, anoNascimento);
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	public void obterSaldo()
	{
		System.out.println((valorCredito-valorDivida));
		//devolve a diferença entre os valores dos atributos valorCredito e valorDivida.
	}
}
