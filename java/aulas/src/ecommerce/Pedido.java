package ecommerce;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Pedido {
	protected double precoTotal;
	protected char formaPgto;
	protected double precoFinal;
	protected String pgto;
	protected double desconto;
	protected double parcela;
	
	public void gerarNota(String nome, String tratamento) {
		this.cabecalho();
        System.out.println("Cliente: " + tratamento + nome);	
	}
	
	public void setFormaPgto() {
		Scanner leia = new Scanner(System.in);
		char formaPgto = leia.next().charAt(0);
		while (formaPgto != '0' && formaPgto != '1' && formaPgto != '2' && formaPgto != '3') {
			System.out.println("Forma invαlida. Digite novamente: ");
			formaPgto = leia.next().charAt(0);
		}
		
		this.formaPgto = formaPgto;
	}

	public void imprimirFormaPgto() {
		System.out.printf("0 - dιbito ou dinheiro - DESCONTO DE 10%% - Valor final: R$%.2f\n"
				, (precoFinal = precoTotal - (precoTotal * 0.10)));
		System.out.printf("1 - crιdito a vista - Valor final: R$%.2f\n" , (precoFinal = precoTotal));
		System.out.printf("2 - crιdito em 2 parcelas - Acrιscimo de 10%% - Valor final: R$%.2f\n"
				, (precoFinal = precoTotal + (precoTotal * 0.10)));
		System.out.printf("3 - crιdito em 3 parcelas - Acrιscimo de 15%% - Valor final : R$%.2f\n"
				, (precoFinal = precoTotal + (precoTotal * 0.15)));
	}

	public void totalFinal() {
		if (formaPgto == '0') {
			pgto = "A VISTA";
			desconto = precoTotal * 0.10;
			precoFinal = precoTotal - desconto;
			System.out.printf("Vocκ selecionou %s e teve R$%.2f de DESCONTO!\n" + "Preηo final: R$%.2f\n", pgto,
					desconto, precoFinal);

		} else if (formaPgto == '1') {
			precoFinal = precoTotal;
			pgto = "CRΙDITO A VISTA";
			System.out.printf("Vocκ selecionou %s\n" + "Preηo final: R$%.2f\n", pgto, precoFinal);
		} else if (formaPgto == '2') {
			precoFinal = precoTotal + (precoTotal * 0.10);
			pgto = "CRΙDITO 2x";
			parcela = precoFinal / 2;
			System.out.printf("Vocκ selecionou %s\n" + "Preηo por parcela: R$%.2f\n" + "Preηo final: R$%.2f\n", pgto,
					parcela, precoFinal);

		} else {
			precoFinal = precoTotal + (precoTotal * 0.15);
			pgto = "CRΙDITO 3x";
			parcela = precoFinal / 3;
			System.out.printf("Vocκ selecionou %s\n" + "Preηo por parcela: R$%.2f\n" + "Preηo final: R$%.2f\n", pgto,
					parcela, precoFinal);
		}
	}

	public void cabecalho() {
		System.out.println("\t");
		System.out.println(" WEB LOJA PC QUASE FERA ");
		System.out.println("\t");
		System.out.println("Montariamos o melhor computador do mercado se vendessemos peηas o suficiente\n");
		System.out.println("\n------------------------------------------------------------------------------");
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy | HH:mm:ss");
		Date date = new Date();
		System.out.println("CNPJ: 40028922/0001-01                          "+dateFormat.format(date));
		System.out.println("------------------------------------------------------------------------------");
	}
	public double getPrecoTotal() {
		return precoTotal;
	}
	
	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}
	
	public char getFormaPgto() {
		return formaPgto;
	}
	
	public double getPrecoFinal() {
		return precoFinal;
	}
	
	public void setPrecoFinal(double precoFinal) {
		this.precoFinal = precoFinal;
	}
	
	public String getPgto() {
		return pgto;
	}
	
	public void setPgto(String pgto) {
		this.pgto = pgto;
	}
	
	public double getParcela() {
		return parcela;
	}
	
	public void setParcela(double parcela) {
		this.parcela = parcela;
	}
	
	public void setFormaPgto(char formaPgto) {
		this.formaPgto = formaPgto;
	}
	
	public double getDesconto() {
		return desconto;
	}
	
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
}