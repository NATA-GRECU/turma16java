package encapsulamento;

public class Main {

	public static void main(String[] args) 
	{
		Cachorro dog = new Cachorro("Veludo","Vira-lata Caramelo", 20);
		
		dog.setNome("Loop"); //Alterar nome
		System.out.println(dog.getNome());
		
		
		
	}
	
}
