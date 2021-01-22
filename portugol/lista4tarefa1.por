programa
{
	
	funcao inicio()
	{
		/*
		 * Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade 
		 * e o escreva em seguida. Encontre após a maior pontuação e a apresente. 
		 */

		 real pontos[5], maior=0.0

		 para(inteiro i=0;i<5;i++)
		 {
		 	escreva("Insira um valor da pontuação: ")
		 	leia(pontos[i])
		 	se (pontos[i]>maior)
		 	{
		 		maior = pontos[i]
		 	}
		 }
		 para(inteiro i=0;i<5;i++)
		 {
		 	escreva("\nNumeros inseridos: ", pontos[i])
		 }
		 escreva("\n\n O maior numero é: ", maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 248; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {pontos, 11, 8, 6}-{maior, 11, 19, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */