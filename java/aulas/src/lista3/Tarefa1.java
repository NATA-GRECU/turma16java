package lista3;

public class Tarefa1
{
	public static void main(String[] args)
	{
		int resto5;
		
		System.out.print("Os números com o resto 5 são:");
		for(int x = 1000;x<=1999;x++)
		{
		
			resto5 = x%11;
			if(resto5 == 5)
			{
				
				System.out.println("\n\t"+x);
			}
		}
	}
}
