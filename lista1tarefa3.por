programa
{
	
	funcao inicio()
	{
		//programa - objetivo
		//inicio
		 	//variaveis
		 	//entradas
		 	//procesamentos
		 	//saidas
		 //fim
		 /*
		  * 3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos 
		  * e mostre-o expresso em horas, minutos e segundos. 
		  */
		 
		  //variaveis
		  inteiro tempoSegundos, hora, minutos, segundos

		  //entradas
		  escreva("Digite a quantidade total em segundos do evento: ")
		  leia(tempoSegundos)

		  //processamento
		  hora = (tempoSegundos/3600)
		  minutos = (tempoSegundos % 3600) / 60
		  segundos = (tempoSegundos % 60) % 60

		  //teste
		  escreva("Total de horas: " + hora)
		  escreva("\nTotal em minutos: " + minutos)
	       escreva("\nTotal em segundos: " + segundos)
	  	  escreva( "\nTempo total do evento: "+hora+":"+minutos+":" + segundos)
	       
		  
		
		  
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 306; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */