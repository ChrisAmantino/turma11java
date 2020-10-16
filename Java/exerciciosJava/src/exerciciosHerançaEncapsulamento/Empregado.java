package exerciciosHeran�aEncapsulamento;

public class Empregado extends Pessoa{
	/*
	 * Considere, como subclasse da classe Pessoa, a classe Empregado. 
	 * Considere que cada inst�ncia da classe Empregado tem, para al�m 
	 * dos atributos que caracterizam a classe Pessoa, os atributos 
	 * codigoSetor (inteiro), salarioBase (vencimento base) e imposto (porcentagem retida dos impostos). 
	 * Implemente a classe Empregado com m�todos seletores e modificadores e um m�todo calcularSalario. 
	 * Escreva um programa de teste adequado para a classe Empregado. 
	 */
	
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	public Empregado(String nome, int codigoSetor, double salarioBase) {
		super(nome);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
	}
	public double calcularSalario()
	{
		double desconto = this.salarioBase * (this.imposto/100);
		return this.salarioBase - desconto;
	}
	
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	
	

}
