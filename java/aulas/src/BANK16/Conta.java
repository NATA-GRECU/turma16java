package BANK16;
import java.util.*;
public class Conta 
{
	Scanner leia = new Scanner(System.in);
	private String numero;
	private String cpf;
	private double saldo;
	
	public Conta(String numero, String cpf) 
	{
		super();
		this.numero = numero;
		this.cpf = cpf;
	}
	public void debitar(double valor)
	{
		if (valor <= saldo)
		{
			saldo -= valor;
		}
	}
	public void creditar(double valor)
	{
		saldo += valor;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNumero() {
		return numero;
	}
	public String getCpf() {
		return cpf;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
}