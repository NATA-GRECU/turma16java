  
package aulas;

import java.util.Scanner;

public class ContaPoupanca 
{
	
	
	public static void main(String[] args) 
	{
		//variaveis
		Scanner leia = new Scanner(System.in);
		char opcao;
		
		
		System.out.println("BANCO G4");
<<<<<<< HEAD
		linha(40);
=======
		System.out.println("AONDE O SEU DINHEIRO TEM MAIS FORÇA!!!");
>>>>>>> 87e89258a2c96a21ded9392484c5aee4f31886cf
		
		do 
		{
				
			System.out.println("1 - CONTA POUPANÇA\r\n"
					+ "2 - CONTA CORRENTE\r\n"
					+ "3 - CONTA ESPECIAL \r\n"
					+ "4 - CONTA EMPRESA\r\n"
					+ "5 - CONTA ESTUDANTIL\r\n"
					+ "6 - SAIR\r\n"
					+ "");
			System.out.print("Digite o numero de sua opção: ");
			opcao = leia.next().charAt(0);
			
			if (opcao == '6')
			{
				break;
			}
			else if (opcao == '1') 
			{
				contaPoupanca();
			}
<<<<<<< HEAD
			else if (opcao == '2')
			{
				contaCorrente();
			}
			else if (opcao == '3')
			{
				contaEspecial();
			}
			
=======
>>>>>>> 87e89258a2c96a21ded9392484c5aee4f31886cf
			
			
		} while (true);
		//saida
		System.out.println("Obrigado, volte sempre!!!");

	}
	
	public static void contaPoupanca()
	{
		Scanner tec = new Scanner(System.in);
<<<<<<< HEAD
		double saldo = 0.00;
		char opcaoDC;
		char opcaoSN;
		String descricao[] = new String[10];
		double debito=0.00;
		double credito=0.00;
		double valor[] = new double[10];
		
		linha(40);
		System.out.println("CONTA POUPANÇA");
		linha(40);
		//processos
		for (int giro=0; giro<10; giro++)
		{
			System.out.printf("Lançamento %d : [D-débito/C-crédito] :",(giro+1));
			opcaoDC = tec.next().toUpperCase().charAt(0);
			if (opcaoDC =='D')
			{
				System.out.print("\nDigite o valor para débito :");
				debito = tec.nextDouble();
				
				valor[giro]=debito*(-1);
				
				if (saldo > 0)
				{
					while (saldo < debito )
					{
						System.out.printf("Saldo indisponivel, atual %.2f, tente de novo!!!\n",saldo);
						System.out.print("Digite o valor para débito :");
						debito = tec.nextDouble();
						valor[giro]=debito*(-1);
						
					}
					tec.nextLine();
					
					
					System.out.print("Descrição do débito :");
					descricao[giro] = tec.nextLine();
					saldo = saldo - debito;
					System.out.printf("Saldo atual é R$ %.2f \n", saldo);
				} 
				else if (saldo == 0) 
				{
					System.out.println("Você está sem saldo no momento, faça um crédito primeiro!!!");
				}
			}
			else if (opcaoDC == 'C')
			{
				System.out.print("\nDigite o valor do crédito: ");
				credito = tec.nextDouble();
				valor[giro]=credito;
				while (credito <=0 )
				{
					System.out.print("Valor informado negativo ou zero, tente de novo:");
					System.out.print("Digite o valor do crédito: ");
					credito = tec.nextDouble();
					valor[giro]=credito;
				}
				tec.nextLine();
				
				System.out.print("Descrição do crédito :");
				descricao[giro] = tec.nextLine();
				
				saldo = saldo + credito;
				System.out.printf("Saldo atual é R$ %.2f \n", saldo);
			}
			else
			{
				System.out.println("Você não escolheu Debito ou Crédito!!!");
			}
			
			System.out.print("Continua S/N :");
			opcaoSN = tec.next().toUpperCase().charAt(0);
			if (opcaoSN == 'N')
			{
				break;
			}
		}
		//correção monetaria
		System.out.println("Deseja fazer a correção hoje sim ou não? ");
		opcaoSN = tec.next().toUpperCase().charAt(0);
		if (opcaoSN == 'S') 
		{
			saldo += (saldo * 0.0005);
		}
		System.out.printf("SALDO FINAL DA CONTA POUPANÇA %.2f \n", saldo);
		System.out.println();
		linha(40);
		for(int x=0;x<10;x++)
		{
			
			if(descricao[x] != null) 
			{
			System.out.println("EXTRATO: "+descricao[x]+" "+valor[x]);
			}
			
		}
		linha(40);
	}
	public static void contaEspecial()
	{
		Scanner read = new Scanner(System.in);
		char opcaoDC = 's';
		char opcaoSN = 's';
		double saldo = 0.00;
		double chequeEspecial= 1000,debitoSaldo = 0,debitoChequeEspecial;
		double creditoChequeEspecial = 0;
		String descriçao[] = new String[10]; 
		double valor [] = new double [10];
		
		System.out.println("Conta XXXXX Banco G4");
		
			for (int giro=1; giro<=10; giro++)
			{
				System.out.printf("\nLançamento %d [D-DEBITO/C-CREDITO]",giro);
				opcaoDC = read.next().toUpperCase().charAt(0);
				
				if(opcaoDC == 'D')
				{
					if(saldo < 0 || saldo ==0)
					{
						System.out.println("Você não tem saudo disponivel para debitos");
					}
					else if(saldo > 0)
					{
						System.out.printf("Seu saldo é %.002f e seu credito no cheque especial é %.002f",saldo,chequeEspecial);
						System.out.println("\nDescrição da transação: ");
						descriçao[giro] = "Debito " +read.nextLine();
						read.nextLine();
						System.out.println("valor do débito");
						debitoSaldo = read.nextDouble();
						valor [giro] = debitoSaldo;
						
						if(saldo -debitoSaldo < 0)
						{
							System.out.println("Saldo insuficiente!");
						}
						saldo-=debitoSaldo;
						System.out.printf("Seu saldo é %.002f e seu credito no cheque especial é %.002f \n",saldo,chequeEspecial);
					}
					else
					{
						saldo-=debitoSaldo;
						System.out.printf("Seu saldo é %.002f e seu credito no cheque especial é %.002f",saldo,chequeEspecial);
					}
					
				}
				else if(opcaoDC == 'C')
				{
					System.out.printf("Você tem disponivel %.002f de crédito so cheque especial\nQuanto você deseja usar?",chequeEspecial);
					debitoChequeEspecial = read.nextDouble();
					
					if(chequeEspecial-debitoChequeEspecial < 0)
					{
						System.out.println("Esse valor ultrapassa o seu limite do cheque especial");
					}
					else 
					{
						chequeEspecial-=debitoChequeEspecial;
						saldo+=debitoChequeEspecial;
						System.out.printf("Seu saldo é %.002f  e seu credito no cheque especial é %.002f ",saldo,chequeEspecial);
						descriçao[giro] = "Credito pelo cheque especial";
						valor [giro] = debitoChequeEspecial;
					}
						
					
				}
				else
				{
					System.out.println("Você não escolheu uma opção válida!");
				}
				
				System.out.print("Continua S/N :");
				opcaoSN = read.next().toUpperCase().charAt(0);
				if (opcaoSN == 'N')
				{
					break;
				}
				linha(40);
			}
			for (int x = 0; x<10;x++)
			{
				if(descriçao[x] != null)
				{
					System.out.println(descriçao[x] +"no valor :" + valor[x]);	
				}
				
			}
			
			System.out.println("OBRIGADO PELA VISITA, VOLTEI SEMPRE;) ");
			System.out.println();
			linha(40);
	}
	public static void contaCorrente()
	{
		Scanner in = new Scanner(System.in);
		int lista = 0 ;
		int talao = 0 ;
		char opcao = ' ';
		double saldo = 0.00, credito=0.00, debito=0.00,valorTalao = 0.00;
		double listaCredito[]= new double [100];
		double listaDebito[]= new double [100];
		String listaDescricao[]= new String [100];
		char opcaoDC;
		char opcaoSSNN = 'S';
		char opcaoSN;
		String descricao;
		
		//linha(40);
		System.out.println("CONTA CORRENTE");
		//linha(40);
		//processos
		System.out.println("Deseja emitir um talão de cheque? ");
		opcao= in.next().toUpperCase().charAt(0);
		talao = talao + 1;
		do {
			if(opcao == 'S' ) {
				System.out.print("Digite o valor do talão de cheque :");
				valorTalao = in.nextDouble();
				if(valorTalao > 0 ) {
				talao = talao + 1;
				saldo = saldo + valorTalao ;
				}
				else {
						System.out.println("O Talao de cheque está em branco ou invalidado");
							
					}
				
				System.out.println("Deseja emitir outro talão de cheque? ");
				opcao= in.next().toUpperCase().charAt(0);
				if(opcao != 'S') {
					opcao = 'N';
				}
				else if (talao > 3) {
					System.out.println("limite de talões de cheque atingido, ação invalida");
					opcao = 'N';
				}
			}	
		}while(opcao == 'S');
		
		for ( int giro=1; giro<=10; giro++)
		{
			
			System.out.printf("Lançamento %d : [D-débito/C-crédito] :",giro);
			opcaoDC = in.next().toUpperCase().charAt(0);
			if (opcaoDC =='D')
			{
				System.out.print("\nDigite o valor para débito :");
				debito = in.nextDouble();
				listaDebito[giro] = debito;
=======
		double saldo = 0.00, credito=0.00, debito=0.00;
		char opcaoDC;
		char opcaoSN;
		String descricao;
		
		
		System.out.println("CONTA POUPANÇA");
		linha(40);
		//processos
		for (int giro=1; giro<=10; giro++)
		{
			System.out.printf("Lançamento %d : [D-débito/C-crédito] :",giro);
			opcaoDC = tec.next().toUpperCase().charAt(0);
			if (opcaoDC =='D')
			{
				System.out.print("\nDigite o valor para débito :");
				debito = tec.nextDouble();
>>>>>>> 87e89258a2c96a21ded9392484c5aee4f31886cf
				if (saldo > 0)
				{
					while (saldo < debito )
					{
						System.out.printf("Saldo indisponivel, atual %.2f, tente de novo!!!\n",saldo);
						System.out.print("Digite o valor para débito :");
<<<<<<< HEAD
						debito = in.nextDouble();
						
					}
					in.nextLine();
					System.out.print("Descrição do débito :");
					descricao = in.nextLine();
					listaDescricao[giro] = descricao;
=======
						debito = tec.nextDouble();
						
					}
					tec.nextLine();
					System.out.print("Descrição do débito :");
					descricao = tec.nextLine();
>>>>>>> 87e89258a2c96a21ded9392484c5aee4f31886cf
					saldo = saldo - debito;
					System.out.printf("Saldo atual é R$ %.2f \n", saldo);
				} 
				else if (saldo == 0) 
				{
					System.out.println("Você está sem saldo no momento, faça um crédito primeiro!!!");
				}
			}
			else if (opcaoDC == 'C')
			{
				System.out.print("\nDigite o valor do crédito: ");
<<<<<<< HEAD
				credito = in.nextDouble();
				listaCredito[giro] = credito;

=======
				credito = tec.nextDouble();
>>>>>>> 87e89258a2c96a21ded9392484c5aee4f31886cf
				while (credito <=0 )
				{
					System.out.print("Valor informado negativo ou zero, tente de novo:");
					System.out.print("Digite o valor do crédito: ");
<<<<<<< HEAD
					credito = in.nextDouble();
				}
				in.nextLine();
				System.out.print("Digite a descrição do crédito: ");
				descricao = in.nextLine();
				listaDescricao[giro] = descricao;
				saldo = saldo + credito;
				System.out.printf("Saldo atual é R$ %.2f \n", saldo);
			
=======
					credito = tec.nextDouble();
				}
				tec.nextLine();
				System.out.print("Digite a descrição do crédito: ");
				descricao = tec.nextLine();
				saldo = saldo + credito;
				System.out.printf("Saldo atual é R$ %.2f \n", saldo);
>>>>>>> 87e89258a2c96a21ded9392484c5aee4f31886cf
			}
			else
			{
				System.out.println("Você não escolheu Debito ou Crédito!!!");
			}
			
<<<<<<< HEAD
			
			System.out.print("Continua S/N :");
			opcaoSN = in.next().toUpperCase().charAt(0);
			if (opcaoSN == 'N'){ 
				while(opcaoSSNN == 'S') {
			linha(40);
				System.out.println("Deseja ver sua Lista de credito ou debito [S/N]?");
				opcaoSSNN = in.next().toUpperCase().charAt(0);
				if(opcaoSSNN == 'S') {
					System.out.println("Qual Lista, credito ou debito [1-credito/2-debito]?");
					lista = in.nextInt();
					giro = 10;
					if(lista == 1) {
						for (int gir=1; gir<=10; gir++)
						{
							if (listaCredito[gir] != 0.0) {
								System.out.println(listaCredito[gir]+" "+ listaDescricao[gir]+"\n");
							}
					
							else if(lista == 2) {
								for (int gi=1; gi<=10; gi++)
								{
									if (listaDebito[gi] != 0.0) {
										System.out.println(listaDebito[gi]+" "+listaDescricao[gi]+"\n");
							}
						}
							
					}
			
			
				
					}
				}
					System.out.print("Continua S/N :");
					opcaoSSNN = in.next().toUpperCase().charAt(0);
					
				
				}else {	
						System.out.println();
						linha(40);
						break;
						}
		
				}
			}
		}
	}
=======
			System.out.print("Continua S/N :");
			opcaoSN = tec.next().toUpperCase().charAt(0);
			if (opcaoSN == 'N')
			{
				break;
			}
		}
		//correção monetaria
		System.out.println("Deseja fazer a correção hoje sim ou não? ");
		opcaoSN = tec.next().toUpperCase().charAt(0);
		if (opcaoSN == 'S') 
		{
			saldo += (saldo * 0.0005);
		}
		System.out.printf("SALDO FINAL DA CONTA POUPANÇA %.2f \n", saldo);
		System.out.println();
		
	}
	
>>>>>>> 87e89258a2c96a21ded9392484c5aee4f31886cf
	public static void linha(int tamanho) 
	{
		for (int x=1;x<tamanho; x++)
		{
<<<<<<< HEAD
			System.out.print("-");
=======
			System.out.print("═");
>>>>>>> 87e89258a2c96a21ded9392484c5aee4f31886cf
		}
		System.out.println();
	}
}