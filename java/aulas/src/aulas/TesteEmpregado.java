package aulas;

public class TesteEmpregado 
{
	public static void main(String[] args) 
	{
		Empregados terceiro = new Terceiro("Joao", 33, 120, 50.00,0.1);
		System.out.println("Salario final = R$ "+terceiro.calculoSalario());
	}
}
