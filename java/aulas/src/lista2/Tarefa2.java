package lista2;
import java.util.*;
public class Tarefa2 
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		int x, y, z, primeiro=0, segundo=0, terceiro=0;
		
		System.out.println("Entre com um n�mero: ");
		x = leia.nextInt();
		System.out.println("Entre com um n�mero: ");
		y = leia.nextInt();
		System.out.println("Entre com um n�mero: ");
		z = leia.nextInt();
	
		if(x < y && x < z)
		{
			primeiro = x;
			if(y<z)
			{
				segundo = y;
				terceiro = z;
			}
			else
			{
				segundo = z;
				terceiro = y;
			}
		}
		if(y < x && y < z)
		{
			primeiro = y;
			if(x<z)
			{
				segundo = x;
				terceiro = z;
			}
			else
			{
				segundo = z;
				terceiro = x;
			}
		}
		if(z < y && z < x)
		{
			primeiro = z;
			if(y<x)
			{
				segundo = y;
				terceiro = x;
			}
			else
			{
				segundo = x;
				terceiro = y;
			}
		}
		System.out.printf("\t1�: %d\t2�: %d\t3�: %d",primeiro,segundo,terceiro);
	}
}
