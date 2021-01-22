programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		const inteiro TAMANHO =3
		inteiro matriz[TAMANHO][TAMANHO] , somatorio=0
		
		para (inteiro linha = 0; linha<TAMANHO; linha++) // Giro da linha
		{
			para(inteiro coluna = 0; coluna<TAMANHO;coluna++)
			{
				matriz[linha][coluna] = Util.sorteia(1, 9)
				se (linha == coluna)
				{
					somatorio = somatorio + matriz[linha][coluna]
				}
				escreva(matriz[linha][coluna]," ")
			}
			escreva("\n")
		}
		escreva("Somatório da diagonal principal é: ",somatorio)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 528; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 8, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */