package apps;


import java.util.Random;
import java.util.Scanner;

import entidades.*;

public class Banco {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Random aleatorio = new Random();
		int opc;
		char credita = 'S';
		int mes;
		
		
		System.out.print("$$$$$$$$$ SEJA BEM VINDO AO DUBANK $$$$$$$$$");
		System.out.println("\nDigite qual operação você deseja realizar: \n 1 - Abrir Conta Conta Poupança \n 2 - Abrir Conta Corrente \n 3 - Abrir Conta Empresarial \n 4 - Sair");
		int conta = leia.nextInt();
		
		if (conta == 1)
		{
			ContaPoupanca cp = new ContaPoupanca(9);
			System.out.print("Digite o numero da sua conta: ");
			cp.setNumero(leia.nextInt());
			
			do {
				mes = aleatorio.nextInt(12)+1;
				cp.aniversarioMes(mes);
				System.out.println(" 1 - Visualizar Saldo Atual \n 2 - Creditar em minha conta \n 3 - Debitar da minha conta \n 4 - Sair");
				opc = leia.nextInt();
				
				if (opc == 1)
				{ 
				//credita = 'S';
					if (cp.getSaldo() == 0)
					{
						System.out.println("Você não tem saldo em sua conta, deseja creditar?");
						credita = leia.next().toUpperCase().charAt(0);
						if(credita == 'S')
						{	
							double credito;
							System.out.print("Digite o valor a ser creditado em sua conta:");
							credito = leia.nextDouble();
							cp.credite(credito);
						}
					}
					cp.emiteExtrato();
					
				}
				else if (opc == 2)
				{	
					double credito;
					System.out.print("Digite o valor a ser creditado em sua conta:");
					credito = leia.nextDouble();
					cp.credite(credito);
				}
				else if (opc == 3)
				{
					double debito;
					System.out.print("Digite o valor a ser debitado da sua conta: ");
					debito = leia.nextDouble();
					cp.debite(debito);
				}
				else if (opc == 4)
				{
					break;
				}
				} while (opc >= 1 || opc <= 5);
		}
		if (conta == 2)
		{	
			System.out.println("Qual seu saldo inicial?");
			double saldo = leia.nextDouble();
			if (saldo >= 3000)
			{	
				ContaEspecial cc = new ContaEspecial();
				cc.credite(saldo);
				System.out.print("Digite o numero da sua conta: ");
				cc.setNumero(leia.nextInt());			
				do {
					cc.calculaJuros();
					System.out.println(" 1 - Visualizar Saldo Atual \n 2 - Creditar em minha conta \n 3 - Debitar da minha conta \n 4 - Emitir Talonário \n 5 - Sair");
					opc = leia.nextInt();
					
					if (opc == 1)
					{
						/*if (cc.getSaldo() == 0)
						{
							System.out.println("Você não tem saldo em sua conta, deseja creditar?");
							credita = leia.next().toUpperCase().charAt(0);
							if(credita == 'S')
							{	
								double credito;
								System.out.print("Digite o valor a ser creditado em sua conta:");
								credito = leia.nextDouble();
								cc.credite(credito);
								
							} else {
								cc.emiteExtrato();
							}*/
					
						cc.emiteExtrato();
					}
					else if (opc == 2)
					{	
						double credito;
						System.out.print("Digite o valor a ser creditado em sua conta:");
						credito = leia.nextDouble();
						cc.credite(credito);
					}
					else if (opc == 3)
					{
						double debito;
						System.out.print("Digite o valor a ser debitado da sua conta: ");
						debito = leia.nextDouble();
						cc.debite(debito);
					}
					else if (opc == 4)
					{
						cc.emiteTalonario();
					}
					else if (opc == 5)
					{
						break;
					}
					} while (opc >= 1 || opc <= 5);
				
			}

			else 
			{	
				ContaCorrente cc = new ContaCorrente();
				cc.credite(saldo);
				System.out.print("Digite o numero da sua conta: ");
				cc.setNumero(leia.nextInt());
				do {
					System.out.println(" 1 - Visualizar Saldo Atual \n 2 - Creditar em minha conta \n 3 - Debitar da minha conta \n 4 - Emitir Talonário \n 5 - Sair");
					opc = leia.nextInt();
					
					if (opc == 1)
					{
						if (cc.getSaldo() == 0)
						{
							System.out.println("Você não tem saldo em sua conta, deseja creditar?");
							credita = leia.next().toUpperCase().charAt(0);
							if(credita == 'S')
							{	
								double credito;
								System.out.print("Digite o valor a ser creditado em sua conta:");
								credito = leia.nextDouble();
								cc.credite(credito);
								
							} else {
								cc.emiteExtrato();
							}
						}
						cc.emiteExtrato();
					}
					else if (opc == 2)
					{	
						double credito;
						System.out.print("Digite o valor a ser creditado em sua conta:");
						credito = leia.nextDouble();
						cc.credite(credito);
					}
					else if (opc == 3)
					{
						double debito;
						System.out.print("Digite o valor a ser debitado da sua conta: ");
						debito = leia.nextDouble();
						cc.debite(debito);
					}
					else if (opc == 4)
					{
						cc.emiteTalonario();
					}
					else if (opc == 5)
					{
						break;
					}
					} while (opc >= 1 || opc <= 5);
			}
		}
		
		
		
		leia.close();
	}

}
