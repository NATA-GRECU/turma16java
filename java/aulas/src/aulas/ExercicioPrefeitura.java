package aulas;
import java.util.*;
public class ExercicioPrefeitura
{
	public static void main(String[] args) 
	{
		double salarioHabitante=0.00,mediaSalarios=0.00,mediaFilhos=0.00,maiorSalario=0.00,percentualSalario=0.00;
		double totalSalarios=0.00;
		int numeroFilhos=0;
		double totalFilhos=0.00;
		double contadorValor100=0.00;
		final int habitantes = 20;
		
		Scanner leia = new Scanner(System.in);
		
		for(int giro=1;giro<=habitantes;giro++)
		{
			System.out.printf("Digite o salário do habitante %d :",giro,":");
			salarioHabitante = leia.nextDouble();
			System.out.println("Digite o número de filhos deste habitante: ");
			numeroFilhos = leia.nextInt();
			
			totalSalarios = totalSalarios + salarioHabitante;
			totalFilhos+=numeroFilhos;
			
			if (salarioHabitante > maiorSalario)
			{
				maiorSalario = salarioHabitante;
			}
			if (salarioHabitante <= 100)
			{
				contadorValor100++;
			}
		}
		mediaSalarios = totalSalarios/habitantes;
		mediaFilhos = totalFilhos/habitantes;
		percentualSalario = (contadorValor100/habitantes)*100;
		
		System.out.printf("Média salário: R$ %.2f", mediaSalarios);
		System.out.printf("\nO maior salario informado foi: R$ %.2f", maiorSalario);
		System.out.printf("\nNúmero de pessoas que ganham até R$100 = %.0f",contadorValor100,"\nSendo um percentual total de: %.0f %% ",percentualSalario);
		System.out.printf("\nMédia de filhos: %.0f", mediaFilhos,"%.0f");
	}
}
