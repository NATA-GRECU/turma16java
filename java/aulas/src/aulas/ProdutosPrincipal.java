package aulas;
import aulas.ProdutoConstrutor;
public class ProdutosPrincipal {

	public static void main(String[] args)
	{
		
		ProdutoConstrutor item1 = new ProdutoConstrutor("Sabão");
		ProdutoConstrutor item2 = new ProdutoConstrutor("Esponja ",1);
		ProdutoConstrutor item3 = new ProdutoConstrutor("Sabonete",1,1.50);
		
		System.out.println("NOME\tDESCRICAO\tCODIGO");
		System.out.println(item1.descricao);
		System.out.println(item2.descricao+"\t"+item2.cod);
		System.out.println(item3.descricao+"\t"+item3.valor+"\t"+item3.cod);
	}

}
