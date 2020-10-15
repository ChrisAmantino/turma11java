package aula17;

public class ContaBancaria {
	public String titular;
	public int saldo;
	

	public void sacar(int quantidade)
	{
		int novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
		System.out.println("Saldo atual: " + this.saldo);
	}
	public void depositar(int salario)
	{
		int novoSaldo = this.saldo + salario;
		this.saldo = novoSaldo;
		System.out.println("Saldo atual: "+this.saldo);
	}
	
}
