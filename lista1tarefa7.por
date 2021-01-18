programa
{
	
	funcao inicio()
	{
 	real a, b, c, d, g, f
 	real x, y
 
 	escreva("Coloque um valor para A: ")
 	leia(a)
 	escreva("\nColoque um valor para B: ")
 	leia(b)
 	escreva("\nColoque um valor para C: ")
 	leia(c)
 	escreva("\nColoque um valor para D: ")
 	leia(d)
 	escreva("\nColoque um valor para E: ")
 	leia(g)
 	escreva("\nColoque um valor para F: ")
 	leia(f)

 	x = (((c*g)-(b*f))/((a*g)-(b*d)))
 	y = (((a*f)-(c*d))/((a*g)-(b*d)))

 	escreva("Resultado de X = " + x)
 	escreva("\nResultado de Y = " +y)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 322; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */