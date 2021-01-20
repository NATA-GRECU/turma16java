programa
{
	
	funcao inicio()
	{
		/*
		 * Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
			Infantil A = 5 a 7 anos
			Infantil B = 8 a 11 anos
			Juvenil A = 12 a 13 anos
			Juvenil B = 14 a 17 anos
			Adultos = Maiores de 18 anos
		 */
		 inteiro idadeNadador

		 escreva("Digite a idade do nadador: ")
		 leia(idadeNadador)

		 se(idadeNadador>=18)
		 {
		 	escreva("A sua categoria é Adultos")
		 }
		 senao se (idadeNadador<5)
		 {
		 	escreva("Infelizmente não podemos atender")
		 }
		 senao se (idadeNadador>=5 e idadeNadador<=7)
		 {
		 	escreva("A sua categoria é Infantil A")
		 }
		 senao se (idadeNadador>=8 e idadeNadador<=11)
		 {
		 	escreva("A sua categoria é Infantil B")
		 }
		 senao se (idadeNadador>=12 e idadeNadador<=13)
		 {
		 	escreva("A sua categoria é Juvenil A")
		 }
		 senao
		 {
		 	escreva("A sua categoria é Juvenil B")
		 }
		 escreva("\nObrigado volte sempre!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 925; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */