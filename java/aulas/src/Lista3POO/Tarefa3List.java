package Lista3POO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Tarefa3List 
{
	public static void main(String[] args) 
	{
		Collection <String> estoque = new ArrayList();
		estoque.add("Tênis");
		estoque.add("Camisa");
		estoque.add("Calça");
		estoque.add("Bermuda");
		estoque.add("Blusa");
		System.out.println("ESTOQUE: "+estoque);
		estoque.remove("Tênis");
		System.out.println("ESTOQUE: "+estoque);
		Collection<String> estoque2 = Arrays.asList("Chuteira","Meião");
		estoque.addAll(estoque2);
		System.out.println("ESTOQUE: "+estoque);

	}
}
