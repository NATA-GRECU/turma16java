programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		/*
		 *  Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento 
		 *  do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. 
		 *  João precisa que você faça um sistema que leia a variável P (peso de tomates) e verifique se há excesso. 
		 *  Se houver, gravar na variável E (Excesso) e na variável M o valor da multa que João deverá pagar. 
		 *  Caso contrário mostrar tais variáveis com o conteúdo ZERO.
		 */
		 
		 //Variaveis
		 real pesoTomate, excessoTomate, multaJoao
		//Entrada
		 escreva("Digite o peso: ")
		 leia(pesoTomate)

		 //Processamento
		 excessoTomate = (pesoTomate-50.00)
		 multaJoao = excessoTomate*4.00

		 se (pesoTomate<=50.00)
		 {
		 	escreva("Não há excesso de peso.")
		 }
		 senao se (pesoTomate>50.00)
		 {
		 	escreva("Carga com peso excedente de: "+ Matematica.arredondar(excessoTomate, 2)+"Kg")
		 	escreva("\nO valor da multa será de: "+ mat.arredondar(multaJoao, 2)+"R$")
		 }

		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 961; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */