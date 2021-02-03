package lista2POO;

public class Tarefa3EmpregadoMain
{
	public static void main(String[] args) 
	{
		
		Tarefa3Empregado empregado1 = new Tarefa3Empregado("Natã","Rua Saracanta","11-43732839",2002);
		empregado1.setCodigoSetor(101);
		empregado1.setSalarioBase(3400);
		empregado1.setImposto(0.15);
		
		System.out.println("NOME\t\tSETOR\tTELEFONE\t\t");
		System.out.println(empregado1.getNome()+"\t\t"+empregado1.getCodigoSetor()+"\t"+empregado1.getTelefone());
		System.out.print("IDADE: ");
		empregado1.idade();
		System.out.println("\nSALARIO BRUTO\t\tIMPOSTO");
		System.out.println("R$ "+empregado1.getSalarioBase()+"\t\t"+empregado1.getImposto()*100+"%");
		System.out.print("\nSALARIO LÍQUIDO: R$");
		empregado1.calcularSalario();
	}
}
