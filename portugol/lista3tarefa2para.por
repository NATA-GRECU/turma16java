programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
			inteiro total=0

		para (inteiro x=1;x<=500;x++)
		{
			se((x%2)==1 e (x%3)==0) //x%2==1(impar) x%2==0(par)
			{
			
			total = total + x  // Totalizador
			
			}
		}
		escreva("Total: ",total)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 217; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */