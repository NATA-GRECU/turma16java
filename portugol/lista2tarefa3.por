programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		/*
		 * Leia 4 (quatro) números;
			Calcule o quadrado de cada um;
			Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
			Caso contrário, imprima os valores lidos e seus respectivos quadrados.
		 */
		 //Variaveis
		 real numero1, numero2, numero3, numero4
		 real quad1, quad2, quad3, quad4
		//Entrada
		 escreva("Digite o primeiro número: ")
		 leia(numero1)
		 escreva("Digite o segundo número: ")
		 leia(numero2)
		 escreva("Digite o terceiro número: ")
		 leia(numero3)
		 escreva("Digite o quarto número: ")
		 leia(numero4)
		 //Processamento
		 quad1 = Matematica.potencia(numero1, 2)
		 quad2 = Matematica.potencia(numero2, 2)
		 quad3 = Matematica.potencia(numero3, 2)
		 quad4 = Matematica.potencia(numero4, 2)

		limpa()
		
		 se(quad3>=1000)
		 {
		 	escreva("Resultado: "+quad3)
		 }
		 senao
		 {
		 	escreva("Numero 1: "+numero1+"."+" O seu quadrado é: "+quad1)
		 	escreva("\nNumero 2: "+numero2+"."+" O seu quadrado é: "+quad2)
		 	escreva("\nNumero 3: "+numero3+"."+" O seu quadrado é: "+quad3)
		 	escreva("\nNumero 4: "+numero4+"."+" O seu quadrado é: "+quad4)
		 }
		 

		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 922; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */