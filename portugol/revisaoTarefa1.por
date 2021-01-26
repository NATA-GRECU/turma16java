programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		/*
		 * Elabore um programa que calcule o que deve ser pago por um produto, considerando o preço 
		 * normal de etiqueta e a escolha da condição de pagamento. 
		 * Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e 
		 * efetuar o cálculo adequado. 
			Código Condição de pagamento 
			1 À vista em dinheiro ou cheque, recebe 20% de desconto 
			2 À vista no cartão de crédito, recebe 15% de desconto 
			3 Em duas vezes, preço normal de etiqueta sem juros 
			4 Em três vezes, preço normal de etiqueta mais juros de 10%
		 */
		 real precoProduto=0.00, precoFinal=0.00,parcelas=0.00
		 inteiro codigoPagamento=0
		 caracter pagamentoAVista = '1'
		 caracter pagamentoCartao = '2'
		 caracter pagamento2x = '3'
		 caracter pagamento3x = '4'

		 escreva("Bem-vindo,")
		 escreva("\nDigite o valor da etiqueta do produto: ")
		 leia(precoProduto)

		 escreva("Digite a forma de pagamento (1-A vista, 2-A vista cartão, 3-2x cartão, 4-3x cartão): ")
		 leia(codigoPagamento)

			 se(codigoPagamento == 1)
			 {
			 	limpa()
			 	precoFinal = precoProduto-(precoProduto*0.2)
			 	escreva("Você terá de pagar: R$",mat.arredondar(precoFinal, 2))
			 }
			 senao se(codigoPagamento == 2)
			 {
			 	limpa()
			 	precoFinal = precoProduto-(precoProduto*0.15)
			 	escreva("Você terá de pagar: R$",mat.arredondar(precoFinal, 2))
			 }
			 senao se(codigoPagamento == 3)
			 {
			 	limpa()
			 	precoFinal = precoProduto
			 	parcelas = precoFinal/2
			 	escreva("Você terá de pagar: R$",mat.arredondar(precoFinal, 2),"\nEm 2x de: R$",mat.arredondar(parcelas, 2))
			 }
			 senao se(codigoPagamento == 4)
			 {
			 	limpa()
			 	precoFinal = precoProduto+(precoProduto*0.1)
			 	parcelas = precoFinal/3
			 	escreva("Você terá de pagar: R$",mat.arredondar(precoFinal, 2),"\nEm 3x de: R$",mat.arredondar(parcelas, 2))
			 }
			 escreva("\nObrigado pela compra! Volte Sempre!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1728; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */