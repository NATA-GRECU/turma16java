package aulas;
import java.util.*;
public class TabelaTimes 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		String times[] = new String[4];
		int pontos[] = new int[4];
		char resposta;
		//int rodada[] = new int[4];
		
		for(int x=0;x<4;x++)
		{
			System.out.println("RODADA"+(x+1));
			
			for(int y=0;y<4;y++)
			{
				System.out.println(times[y]+"Digite G-ganhou P-perdeu ou E-empatou [G/P/E]:\r\n");
				resposta = leia.next().charAt(0);
				
				
				if(resposta == 'G')
				{
					pontos[y]=pontos[y]+3;
				}
				else if(resposta == 'E')
				{
					pontos[y]=pontos[y]+1;
				}
				else if (resposta =='D')
				{
					pontos[y]=pontos[y]+0;
				}
				System.out.println("");
				
			}
			
			for(int z=0;z<4;z++)
			{
				System.out.println(times[z]+pontos[z]);
			}
			
		}
		
	}	
}
