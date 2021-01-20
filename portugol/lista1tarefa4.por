programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
	real a, b, c
	real d, r, s

	escreva("Defina valor de A:")
	leia(a)
	escreva("Defina valor de B:")
	leia(b)
	escreva("Defina valor de C:")
	leia(c)
	
	
	r = mat.potencia(a+b,2.00)
	s = mat.potencia(b+c,2.00)
	d = ((r+s)/2)

	escreva("O valor de D é: "+ d)
	escreva("O valor de R é: "+ r)
	escreva("O valor de S é: "+ s)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 102; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */