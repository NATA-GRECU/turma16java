programa
{
	
	funcao inicio()
	{
		/*
		 *  Faça um sistema que leia um número inteiro e mostre uma mensagem indicando 
		 *  se este número é par ou ímpar, e se é positivo ou negativo.
		 */
		 inteiro numero, numeroPar

		 escreva("Digite um número inteiro: ")
		 leia(numero)

		 numeroPar = (numero%2)

		 se (numero>0 e numero%2 == 0) 
		 {
		 	escreva("O número digitado é positivo, e par.")
		 }
		 senao se (numero<0 e numero%2 == 0) 
		 {
		 	escreva("O número digitado é negativo, e par.")
		 }
		 senao se (numero>0 e numero%2 > 0)
		 {
		 	escreva("O número digitado é positivo, e impar.")
		 }
		 senao
		 {
		 	escreva("O número digitado é negativo, e impar.")
		 }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 543; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */