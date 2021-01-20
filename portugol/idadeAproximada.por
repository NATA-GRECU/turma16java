programa
{
	
	funcao inicio()
	{
		//PEDIR AO USUARIO NOME[COMPLETO OU SO O PRIMERIO
		//SEXO[M/F]
		//ANO DE NASCIMENTO[AAAA]
		//ESCREVA NA TELA A IDADE APROXIMADA DA PESSOA

//Variaveis
		cadeia nomeCompleto 
		caracter sexoPessoa
		inteiro anoNascimento
		inteiro idade
		const  inteiro ANOATUAL = 2021
//Entrada
		escreva("Digite seu nome: ")
		leia(nomeCompleto)
		escreva("Digite seu sexo(M/F): ")
		leia(sexoPessoa)
		escreva("Digite o ano de nascimento(AAAA): ")
		leia(anoNascimento)
		/*até 17 - jovem
		 * de 18 até 59 - adulto/a
		 * de 60 anos para cima idoso/a
		 */
		
//Processamento
		idade = ANOATUAL - anoNascimento
//Saida
		se (sexoPessoa == 'M')
		{ 
			se (idade<18)
			{
				escreva("Olá, sua idade é " + idade + " anos e é considerado jovem")
			} 
			senao se (idade<60)
			{
				escreva("Olá, sua idade é " + idade + " anos e é considerado adulto")
			} 
			senao se (idade>60)
			{
				escreva("Olá, sua idade é " + idade + " anos e é considerado idoso")
			}
		} 
		
		senao se (sexoPessoa == 'm') 
		{
			se (idade<18)
			{
				escreva("Olá, sua idade é " + idade + " anos e é considerado jovem")
			} 
			senao se (idade<60)
			{
				escreva("Olá, sua idade é " + idade + " anos e é considerado adulto")
			} 
			senao se (idade>60)
			{
				escreva("Olá, sua idade é " + idade + " anos e é considerado idoso")
			}
		}
		senao se (sexoPessoa == 'F')
		{
			se (idade<18)
			{
				escreva("Olá, sua idade é " + idade + " anos e é considerada jovem")
			} 
			senao se (idade<60)
			{
				escreva("Olá, sua idade é " + idade + " anos e é considerada adulta")
			} 
			senao se (idade>60)
			{
				escreva("Olá, sua idade é " + idade + " anos e é considerada idosa")
			}
		}
		senao se (sexoPessoa == 'f') 
		{
			se (idade<18)
			{
				escreva("Olá, sua idade é " + idade + " anos e é considerada jovem")
			} 
			senao se (idade<60)
			{
				escreva("Olá, sua idade é " + idade + " anos e é considerada adulta")
			} 
			senao se (idade>60)
			{
				escreva("Olá, sua idade é " + idade + " anos e é considerada idosa")
			}
		}
		senao 
		{
			se (idade<18)
			{
				escreva("Olá, sua idade é " + idade + " anos e é consideradx jovem")
			} 
			senao se (idade<60)
			{
				escreva("Olá, sua idade é " + idade + " anos e é consideradx adultx")
			} 
			senao se (idade>60)
			{
				escreva("Olá, sua idade é " + idade + " anos e é consideradx idosx")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2291; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */