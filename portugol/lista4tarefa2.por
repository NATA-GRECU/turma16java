programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		/*
		 * Um dado é lançado 10 vezes e o valor correspondente é anotado. 
		 * Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
		 * A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente 
		 * também quantas foram as ocorrências da maior pontuação.
		 */
		 inteiro lancamento[10] // Aqui o vetor foi criado e esta vazio
		 real somaDados=0.00
		 real mediaDados=0.00
		 inteiro maiorValor=0
		 inteiro contador=0
		//adendo do tio ED - Usar numeros aleatorios

		//Neste pedaço eu coloco os numeros de 1 a 6 no vetor
		 para(inteiro i=0;i<10;i++) // Loop de tamanho definido
		 {
		 	lancamento[i] = Util.sorteia(1, 6)
		 	somaDados = somaDados+lancamento[i]// Somar os dados

		 	se(lancamento[i] >= maiorValor)
		 	{
				se(lancamento[i] == maiorValor)		
		 		 {
		 		 	contador++
		 		 }
		 		 senao
		 		 {
		 		 	contador=1 //reinicialização
		 		 }
		 		 
		 		maiorValor = lancamento[i]
		 	}
		 }
		//aqui eu vou imprimir os numero na tela
		 para(inteiro i=0;i<10;i++)
		 {
		 	escreva("\nDado ",(i+1),": ", lancamento[i])
		 }
		mediaDados = somaDados/10
		escreva("\nA soma dos valores é: ",somaDados,"\n")
		escreva("A média aritmética é: ", mediaDados,"\n")
		escreva("\nO maior valor lançado foi: ", maiorValor, "  E ele foi lançado: ",contador," vezes.")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 971; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */