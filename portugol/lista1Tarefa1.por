programa
{
	
	funcao inicio()
	{
	//NOME*
	//INICIO*
	//OBJETIVO*
		//VARIAVEIS
		//ENTRADAS
		//PROCESSAMENTOS
		//SAIDAS
	//FIM*
	/* 
	 *  Objetivo
	 *  1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias 
	 *  e mostre-a expressa apenas em dias. 
	 */
	 //VARIAVEIS		
	inteiro anosIdade //cameLcase
	inteiro mesesIdade
	inteiro diasIdade
	inteiro diasTotais
	//entradas
	escreva("Por favor informe os anos da pessoa: ")
	leia(anosIdade)
	escreva("Por favor informe os meses da pessoa: ")
	leia(mesesIdade)
	escreva("Por favor informe os dias da pessoa: ")
	leia(diasIdade)
	//processamento
	diasTotais = (anosIdade*365)+(mesesIdade*30)+diasIdade
	//saida
	escreva("O resultado em dis é: " + diasTotais)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 739; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */