package entidades;

import java.util.Scanner;

public class ContaBancaria {
	private int numero;
	private double saldo;
	Scanner leia = new Scanner(System.in);
	
	
	public ContaBancaria()
	{
		
	}
	
	public ContaBancaria(int numero)
	{
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	/*public void setSaldo(double saldo) {
		this.saldo = saldo;
	}*/
	
	public void emiteExtrato()
	{
		System.out.println("Numero da conta: " + this.numero);
		System.out.println("Seu saldo é: R$ " + this.saldo);
		linha();
	}
	
	public double credite(double credito)
	{
		saldo = saldo + credito;
		return this.saldo;
		
	}
	
	public double debite(double debito)
	{
		saldo = saldo - debito;
		return this.saldo;
	}
	
	void linha()
	{
		for(int i = 1; i <=40; i++)
		{
			System.out.print("-");
		}
		System.out.println();
	}
	
	
	
	

}
