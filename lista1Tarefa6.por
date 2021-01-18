programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real r, p, x1, y1, x2, y2

//Entrada
		escreva("Digite um numero para X¹: ")
		leia(x1)
		escreva("Digite um numero para Y¹: ")
		leia(y1)
		escreva("Digite um numero para X²: ")
		leia(x2)
		escreva("Digite um numero para Y²: ")
		leia(y2)

//Processo
		p = mat.potencia(x2 - x1, 2.00) + mat.potencia(y2 - y1, 2.00)
		r = mat.raiz( p, 2.00)
//Saida
		escreva("O resultado é: " + r)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 466; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */