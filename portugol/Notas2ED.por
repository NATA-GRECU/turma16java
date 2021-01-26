programa
{
	
	funcao inicio()
	{
	  //variaveis
	  //Corrigir erro de caso digitar uma matricula que n existe
		cadeia alunos[] = {"ALONSO MENDES SILVA DE OLIVEIRA","ANDRESSA FERREIRA DOS SANTOS","ATHOS GIOM DE PAIVA MESQUITA","CANDIDO JURELMO DOS SANTOS CAVALEIRO","CAROLINA GUIDA","DANIELE DOS SANTOS PINHEIRO","DÉBORA VIDEIRA MONTEIRO","DENILSON TEIXEIRA DE SOUZA","DENISE BRITO ANJOS","FELIPE CASAGRANDE TEIXEIRA DE CASTRO","FERNANDO BEDNARSKI RAMOS","FERNANDO DE BARROS SABALETE","GISELE DE OLIVEIRA PAZ","GUSTAVO DE SOUZA GUILHEN","GUSTAVO ESTEBAN CARRERAS JORGE","GUSTAVO LIMA DE SOUZA","IGOR MILHOMENS DOS SANTOS","JEAN PABLO CESARIO DA SILVA","JESSICA REGINA RODRIGUES HOLANDA","KAREN BERNARDI","KEWIN SOUTO BARROS","LEONARDO LIMA CINTRA","LEONARDO QUEIROZ BURJATO","LUCAS ALVES SCHIMIT","LUCAS DE BARROS PAIFAR","LUCAS LOIOLA DE ALMEIDA","MARCOS DOS SANTOS","MARIA NAZARE CORTEZ LIMA","MARIANA LIMA","MATHEUS RIBEIRO VILLELA","MAYARA CARDINOT MAFIOLETTI","MILTON JUNIOR CAVALCANTE DA PENHA","NATÃ DE ARAUJO GRECU","OSVALDO TAVARES VELASCO","PAOLA ALENCAR LISBOA","RAPHAEL EUZÉBIO SCAZITI","RENATO ANDRÉ NASCIMENTO SILVA","RUI ALMEIDA DE ANDRADE","TATIANE TISSONI ANTUNES","VICTOR DE MORAIS ARAUJO"}
		cadeia matricula[40]
		inteiro notas[40] //40 pq tem 40 alunos
		cadeia matriculaAluno
		inteiro indice=0
		caracter opcao='1'
		cadeia status
		
		//entradas
		//popilando o vetor de matriculas
		para(inteiro x =0;x<40;x++)
		{
			matricula[x] = "G0-"+(x+1) //x+1 para n usar o 0
		}
		faca
		{
		//mostrar na tela matriculas e nomes
		escreva("TURMA DO GRUPO G0-ZERO CONSCIENTE\n")
		linha()
		escreva("MATRICULA\tALUNO\n")
		para(inteiro x=0;x<40;x++)
		{
			escreva(matricula[x],"\t",alunos[x],"\n")
		}
		escreva("Digite o código da matricula do aluno para inserir a nota: ")
		leia(matriculaAluno)
		para(inteiro x=0;x<40;x++)
		{
			se(matriculaAluno == matricula[x])
			{
				indice = x
			}
		}
		escreva("Aluno - ",alunos[indice]," Informe a nota: ")
		leia(notas[indice]) //A nota vai ser adicionado ao vetor do numero do indice
		escreva("Continua 1-Sim ou 2-Nao? ")
		leia(opcao)
		} enquanto (opcao =='1')//So sai do loop quando o numero foi igual a 1
		limpa()
		escreva("TURMA DO GRUPO G0-ZERO CONSCIENTE\n")
		linha()
		escreva("MATRICULA\tNOTA\tSTATUS\tALUNO\n")
		para(inteiro x=0;x<40;x++)
		{
			se(notas[x] == 0)
			{
				status=""
			}
			senao se(notas[x]<5)
			{
				status = "REPROVADO"
			} 
			senao se (notas[x] <=8)
			{
				status="EM ANALISE"
			}
			senao
			{
				status="APROVADO"
			}
			escreva(matricula[x],"\t",notas[x],"\t",status,"\t",alunos[x],"\n")
		}



		
	}
	//FIM
	funcao linha()
	{
		para (inteiro y=0;y<60;y++)
		{
			escreva("=")
		}
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 114; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */