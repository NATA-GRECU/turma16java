programa
{
	
	funcao inicio()
	{
	//Negativo não é considerado = Mensagem de desculps e não faz nada
	//0 = Neutro - Avisar
	//Se não é zero e nem negativo dizer se o numero é par ou negativo
		inteiro numeroDigitado,numPar

		escreva("Digite um número: ")
		leia(numeroDigitado)

		numPar = (numeroDigitado%2)

		se (numeroDigitado < 0)
		{
			escreva("Desculpa este não é um número natural.")
		}
		senao se (numPar == 0)
		{
			escreva("Seu número é Par")
		}
		senao se (numeroDigitado == 0)
			{
				escreva(" 0 é um número neutro.")
			}
		senao 
		{
			escreva("Seu número é Impar")
		}
			
			}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 548; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */