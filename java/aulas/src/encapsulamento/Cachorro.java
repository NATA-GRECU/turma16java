package encapsulamento;

public class Cachorro extends Animal implements AnimalInterface
{
	String raca;

	public Cachorro(String nome,String raca, double peso) {
		super(nome, peso);
		
		this.raca = raca;
	}
	public void latir()
	{
		System.out.println("Cachorro está latindo");
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	@Override
	String movimentacao()
	{
		return "estou correndo";
	}
	@Override
	
	String emitirSom() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public
	String necessidadesFisiologicas() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	String khHora() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
