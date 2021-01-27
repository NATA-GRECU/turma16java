package lista1;

import java.util.Scanner;

public class Lista1Tarefa3 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		int tempoSegundos, hora, minutos, segundos;
		
		System.out.print("Digite o tempo em segundos: ");
		tempoSegundos = leia.nextInt();
		
		hora = tempoSegundos/3600;
		minutos = ((tempoSegundos%3600)/60);
		segundos = (tempoSegundos%60)%60;
		
		System.out.printf("O tempo é de: %d horas, %d minutos, %d segundos",hora,minutos,segundos);
			
	}
}
