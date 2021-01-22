programa
{
	
	funcao inicio()
	{
		/*
		 * TO DO LIST - Agenda
		 * 1 - Cadastrar eventos em um dia qualquer do mês 
		 * 2 - sempre em uma hora
		 * 3 - Pode mostra a lista até oo momento
		 */
		 cadeia AGENDA[24][31],nome
		 inteiro diaEvento=0,horaEvento=0
		 caracter opcao = '1'
		// inteiro x=0, y=0
		 // aqui vai ter o inicio do loop
		 faca
		 {
			 escreva("Bem vindo, digite seu nome: \n")
			 leia(nome)
			 escreva("ESCOLHA UM DIA PARA CADASTRO [1/31] : ")
			 leia(diaEvento)
			 enquanto(diaEvento <= 0 ou diaEvento > 31)
			 {
			 	escreva("\nData informada incorreta, escolha uma data entre 1 e 31: ")
			 	leia(diaEvento) //saida do loop
			 }
			 diaEvento -= 1 //ajuste para evitar o estouro da matriz
			 escreva("SELECIONE A HORA DO EVENTO[0-23]: ")
			 leia(horaEvento)
			 enquanto(horaEvento < 0 ou horaEvento > 23)
			 {
			 	escreva("\nHora informada incorreta, escolha entre 0 e 23 H: ")
			 	leia(horaEvento)
			 }
			 escreva("Informe a tarefa: ")
			 leia(AGENDA[horaEvento][diaEvento])
			 escreva("Continua 1-Sim ou 2- Não: ")
			 leia(opcao)
			
	 	}enquanto (opcao == '1')

	 	para(inteiro x=0; x<31; x++)
	 	{
	 		
	 		para(inteiro y=0;y<24;y++)
	 		{
	 			se (AGENDA[y][x] != "")
	 			{
	 				
	 				escreva("\nDia: ",x+1," Hora: ",y, " : ", AGENDA[y][x])	
	 			}
	 			
	 		}
	 	}
	 	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1327; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */