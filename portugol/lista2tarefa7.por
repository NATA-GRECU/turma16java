programa
{
	inclua biblioteca Matematica --> Mat //Alias
	
	funcao inicio()
	{
		/*
		 * Receber valores de base e altura de um triângulo e 
		 * verificar se são valores válidos (positivos maiores que zero). Em caso afirmativo, 
		 * calcular a área do triângulo.
		 */

		 //Variaveis
		 real baseTriangulo=0.00, alturaTriangulo=0.00, areaTriangulo=0.00
		 //entradas
		 linha()
		 escreva("\nDigite a base: ")
		 leia(baseTriangulo) // > 0
		 escreva("Digite a altura: ")
		 leia(alturaTriangulo) // > 0
		 //Processamentos
		 se (baseTriangulo > 0 e alturaTriangulo > 0)
		 {
		 	areaTriangulo = ( (baseTriangulo*alturaTriangulo) / 2 )
		 	//Saida
		 	linha()
		 	escreva("\nA area do triangulo é: ",Matematica.arredondar(areaTriangulo, 2))
		 	linha()
		 }
		 senao 
		 {
		 	//Saida
		 	escreva("Você digitou um numero negativo ou zero na base ou altura.")
		 	linha()
		 }
		 
	}
	funcao linha()
	{
		escreva("\n-------------------------------------")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 683; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */