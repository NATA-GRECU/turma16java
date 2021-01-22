programa
{
	
	funcao inicio()
	{
		/*
		 * 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o 
		 * salário e número de filhos. A prefeitura deseja saber:   
		a) média do salário da população; 
		b) média do número de filhos; 
		c) maior salário; 
		d) percentual de pessoas com salário até R$100,00.  
		 */
		 //Variaveis
		 real salarioHabitante=0.00, mediaSalarios=0.00, mediaFilhos=0.00, maiorSalario=0.00, percentualSalario100=0.00
		 real totalSalarios = 0.00
		 inteiro numeroFilhos=0
		 real totalFilhos=0.00
		 real contadorValor100 = 0.00
		 const inteiro habitantes = 5 // Giros

		 //Giro
		 para (inteiro giro=1; giro<=habitantes; giro++)
		 {
		 	//Entradas
		 	escreva("Digite o salário do habitante ",giro,": ")
		 	leia(salarioHabitante)
		 	escreva("Digite o numero de filhos deste habitante: ")
		 	leia(numeroFilhos)
		 	//Processamentos
		 	totalSalarios = totalSalarios + salarioHabitante // Totalizador
		 	totalFilhos += numeroFilhos //Totalizador
		 	se (salarioHabitante > maiorSalario)
		 	{
		 		maiorSalario = salarioHabitante
		 	}
		 	se (salarioHabitante <= 100)
		 	{
		 		//contadorValor100 = contadorValor100 + 1
		 		contadorValor100++ // Geral usa esse
		 		//contadorValor100+=1
		 	}
		 }
		 //Processo tbm
		 mediaSalarios = totalSalarios / habitantes
		 mediaFilhos = totalFilhos / habitantes
		 percentualSalario100 = (contadorValor100 / habitantes)*100
		
		 //Saidas
		 limpa()
		 escreva("Média salario: R$ " , mediaSalarios,"\n")
		 escreva("O maior salario informado foi: R$ ", maiorSalario,"\n")
		 escreva("Número de pessoa que ganham até R$ 100 = ",contadorValor100,"\nSendo um percentual total de: ",percentualSalario100,"%\n")
		 escreva("Média de filhos: ", mediaFilhos,"\n")
		 escreva("Obrigado pela ajuda!")
		 //FIM
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 572; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */