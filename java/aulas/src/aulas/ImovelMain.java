package aulas;

public class ImovelMain 
{
	public static void main(String[] args)
	{
		Casa1 casa1 = new Casa1("S�o Paulo", 100, "Azul beb�", "Mans�o",244);
		
		casa1.setLocalizacao("Santo Andr�");
	    casa1.setTamanho(150);
		casa1.setCor("Vermelho");
		
		System.out.printf(casa1.getLocalizacao()+"\n"+casa1.getTamanho()+"\n"+casa1.getTipo()+"\n"+casa1.getCor()+"\n"+casa1.getNumeroCasa()+"\n");
		casa1.abrirPorta();
	}
}
