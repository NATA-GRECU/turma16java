programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		// SO PAGO IMPOSTO
		// RECEBER O SALARIO DE UMA PESSOA
		// RECEBE O NOME DA PESSOA
		// BASEADO NO SLARIO VAI RESPONDER
		// SE O SALARIO ATÉ 1.100(INCLUSIVE) REAIS ISENTO 
		// SALARIO ENTRE 1.100,01 E (INCLUSIVE)3.500 - 9% IMPOSTO (VALOR DO IMPOSTO E SALARIO FINAL)
		// SALARIO ENTRE 3.500,01 E (INCLUSIVE)10000 - 15% IMPOSTO  (VALOR DO IMPOSTO E SALARIO FINAL)
		// SALARIO ACIMA DE 10.000,01 PAGAM 27% IMPOSTO (VALOR DO IMPOSTO E SALARIO FINAL)
		// DETALHE - TRATAR COMO SENHOR OU SENHORA

		real salarioPessoa=0.00, salarioLiquido=0.00, valorImposto=0.00
		cadeia nomePessoa
		caracter sexoPessoa

		escreva("Digite seu nome: ")
		leia(nomePessoa)
		escreva("Digite seu sexo utilizando M (Masculino) e F (Feminino): ")
		leia(sexoPessoa)
		escreva("Digite seu salário aqui: R$ ")
		leia(salarioPessoa)

		se(salarioPessoa<=1100)
		{
			se(sexoPessoa == 'M' ou sexoPessoa == 'm')
			{
				limpa()
				escreva("Senhor: "+nomePessoa+"\nVocê está isento de impostos")
			}
			senao se (sexoPessoa == 'F' ou sexoPessoa == 'f')
			{
				limpa()
				escreva("Senhora: "+nomePessoa+"\nVocê está isenta de impostos")
			}
			senao
			{
				limpa()
				escreva("Senhorx: "+nomePessoa+"Você está isentx de impostos")
			}
		}
		senao se (salarioPessoa>1100 e salarioPessoa<=3500)
		{
			valorImposto = (salarioPessoa*0.09)
			salarioLiquido = (salarioPessoa - valorImposto)

			//escreva("Seu salário final é de: "+salarioLiquido+"  E o valor do imposto pago é de: "+valorImposto)
			se(sexoPessoa == 'M' ou sexoPessoa == 'm')
			{
				limpa()
				escreva("Senhor: "+nomePessoa+"\nO salario final do senhor é de: "+" R$ "+mat.arredondar(salarioLiquido, 2)+"\nO valor de imposto pago pelo senhor é de: "+" R$ "+mat.arredondar(valorImposto, 2))
			}
			senao se (sexoPessoa == 'F' ou sexoPessoa == 'f')
			{
				limpa()
				escreva("Senhora: "+nomePessoa+"\nO salario final da senhora é de: "+" R$ "+mat.arredondar(salarioLiquido, 2)+"\nO valor de imposto pago pela senhora é de: "+" R$ "+mat.arredondar(valorImposto, 2))
			}
			senao
			{
				limpa()
				escreva("Senhorx: "+nomePessoa+"O salario final dx senhorx é de: "+" R$ "+mat.arredondar(salarioLiquido, 2)+"\nO valor de imposto pago pelx senhorx é de: "+" R$ "+mat.arredondar(valorImposto, 2))
			}
			}
		senao se (salarioPessoa>3500 e salarioPessoa<=10000)
		{
			valorImposto = (salarioPessoa*0.15)
			salarioLiquido = (salarioPessoa - valorImposto)

			//escreva("Seu salário final é de: "+salarioLiquido+"  E o valor do imposto pago é de: "+valorImposto)
			se(sexoPessoa == 'M' ou sexoPessoa == 'm')
			{
				limpa()
				escreva("Senhor: "+nomePessoa+"\nO salario final do senhor é de: "+" R$ "+mat.arredondar(salarioLiquido, 2)+"\nO valor de imposto pago pelo senhor é de: "+" R$ "+mat.arredondar(valorImposto, 2))
			}
			senao se (sexoPessoa == 'F' ou sexoPessoa == 'f')
			{
				limpa()
				escreva("Senhora: "+nomePessoa+"\nO salario final da senhora é de: "+" R$ "+mat.arredondar(salarioLiquido, 2)+"\nO valor de imposto pago pela senhora é de: "+" R$ "+mat.arredondar(valorImposto, 2))
			}
			senao
			{
				limpa()
				escreva("Senhorx: "+nomePessoa+"\nO salario final dx senhorx é de: "+" R$ "+mat.arredondar(salarioLiquido, 2)+"\nO valor de imposto pago pelx senhorx é de: "+" R$ "+mat.arredondar(valorImposto, 2))
			}
		}
		senao
		{
			valorImposto = (salarioPessoa*0.27)
			salarioLiquido = (salarioPessoa - valorImposto)

			//escreva("Seu salário final é de: "+salarioLiquido+"  E o valor do imposto pago é de: "+valorImposto)
			se(sexoPessoa == 'M' ou sexoPessoa == 'm')
			{
				limpa()
				escreva("Senhor: "+nomePessoa+"\nO salario final do senhor é de: "+" R$ "+mat.arredondar(salarioLiquido, 2)+"\nO valor de imposto pago pelo senhor é de: "+" R$ "+mat.arredondar(valorImposto, 2))
			}
			senao se (sexoPessoa == 'F' ou sexoPessoa == 'f')
			{
				limpa()
				escreva("Senhora: "+nomePessoa+"\nO salario final da senhora é de: "+" R$ "+mat.arredondar(salarioLiquido, 2)+"\nO valor de imposto pago pelo senhora é de: "+" R$ "+mat.arredondar(valorImposto, 2))
			}
			senao
			{
				limpa()
				escreva("Senhorx: "+nomePessoa+"\nO salario final dx senhorx é de: "+" R$ "+mat.arredondar(salarioLiquido, 2)+"\nO valor de imposto pago pelx senhorx é de: "+" R$ "+mat.arredondar(valorImposto, 2))
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 863; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */