programa
{
	
	funcao inicio()
	{
	inteiro valores[3][3]
	real somaValores =0.0, somaDiagonal =0.0

	para (inteiro y=0;y<3;y++)
	{
		para (inteiro x=0; x<3; x++)
		{
			escreva("Qual valor gostaria de relatar? ")
			leia(valores[x][y])

			somaValores += valores [y][x]

			se(x == y)
			{
				somaDiagonal = somaDiagonal+valores[y][x]
			}
		}
		
	}
		escreva ("\nA soma dos valores é: ", somaValores)
		escreva("\nValor da soma diagonal: ",somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 214; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {valores, 6, 9, 7};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */