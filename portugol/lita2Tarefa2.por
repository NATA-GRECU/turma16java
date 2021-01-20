programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		/*Elabore um sistema que leia as variáveis C e N, 
		respectivamente código e número de horas trabalhadas de um operário. 
		E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
		Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável 
		E, caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00.
		No final do processamento imprimir o salário total e o salário excedente.
		 */
		 //Variaveis
		 real numeroHoras=0.0, salarioTrabalhador=0.0, salarioExcesso=0.0
		 inteiro codigoTrabalhador
		//Entrada
		 escreva("Digite o codigo: ")
		 leia(codigoTrabalhador)
		 escreva("Digite a quantidade de horas trabalhadas: ")
		 leia(numeroHoras)

		 //Processamento
		 salarioExcesso = (numeroHoras-50.00)*20.00
		 salarioTrabalhador = numeroHoras*10.00+salarioExcesso

		 escreva("Cód.: "+codigoTrabalhador+"   Horas trabalhadas: "+numeroHoras)
		 escreva("\nSeu salário é de: "+mat.arredondar(salarioTrabalhador, 2)+"R$"+"     Salário excedente: "+mat.arredondar(salarioExcesso, 2)+"R$")
		 
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1065; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */