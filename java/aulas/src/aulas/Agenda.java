package aulas;
import java.util.*;
public class Agenda 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		String AGENDA[][]= new String[24][31];
		String nome;
		int diaEvento, horaEvento;
		char opcao = '1';
		
		do
		 {
			 System.out.println("Bem vindo, digite seu nome: \n");
			 nome = leia.next();
			 System.out.println("ESCOLHA UM DIA PARA CADASTRO [1/31] : ");
			 diaEvento = leia.nextInt();
			
			 
			while(diaEvento <= 0 ||  diaEvento > 31)
			 {
				 System.out.println("\nData informada incorreta, escolha uma data entre 1 e 31: ");
			 	diaEvento = leia.nextInt(); //saida do loop
			 }
			 diaEvento -= 1; //ajuste para evitar o estouro da matriz
			 System.out.println("SELECIONE A HORA DO EVENTO[0-23]: ");
			 horaEvento = leia.nextInt();
			 while(horaEvento < 0 || horaEvento > 23)
			 {
			 	System.out.println("\nHora informada incorreta, escolha entre 0 e 23 H: ");
			 	horaEvento = leia.nextInt();
			 }
			 System.out.println("Informe a tarefa: ");
			 AGENDA[horaEvento][diaEvento] = leia.next();
			 System.out.println("Continua 1-Sim ou 2- Não: ");
			 opcao = leia.next().charAt(0);
			
	 	}while (opcao == '1');

	 	for(int x=0; x<31; x++)
	 	{
	 		
	 		for(int y=0;y<24;y++)
	 		{
	 			if (AGENDA[y][x] != "null")
	 			{
	 				
	 				 System.out.println("\nDia: "+(x+1)+" Hora: "+y+ " : "+ AGENDA[y][x]);
	 			}
	 			
	 		}
	 	}
	 	
	}
}