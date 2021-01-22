programa
{
	
	funcao inicio()
	{
		/*
		 * 1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final 
		 * o total do somatório, a média e o total de valores lidos. O programa deve fazer as leituras dos 
		 * valores enquanto o usuário estiver fornecendo valores positivos. Ou seja, o programa deve parar 
		 * quando o usuário fornecer um valor negativo.
		 */
		 //Variaveis
		 inteiro valoresNumericos=0, total=0, totalValoresLidos=0
		 real media=0.00,contador=0.00
		//entrada
		 escreva("Digite um valor numérico: ")
		 leia(valoresNumericos)
		 //total = total + valoresNumericos
		 enquanto(valoresNumericos>=0)
		{
		
		 escreva("Digite um valor numérico: ")
		 leia(valoresNumericos)

		  se (valoresNumericos>0)
		  {
		  	total = total+valoresNumericos
		  }
		
		}
		
		escreva("\nO total somado foi: ",total) 
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 587; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */