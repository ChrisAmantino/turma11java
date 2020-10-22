package entidades;

public class ContaPoupanca extends ContaBancaria {
	private double juros = 0.02;
	private double corrMonetaria = 0.01;
	private int mesAniversario;
	
	
	
	
	public ContaPoupanca(int mesAniversario) {
		super();
		this.mesAniversario = mesAniversario;
	}
	
	public double getJuros() {
		return juros;
	}
	public void setJuros(double juros) {
		this.juros = juros;
	}
	public double getCorrMonetaria() {
		return corrMonetaria;
	}
	public void setCorrMonetaria(double corrMonetaria) {
		this.corrMonetaria = corrMonetaria;
	}
	public int getMesAniversario() {
		return mesAniversario;
	}
	public void setMesAniversario(int mesAniversario) {
		this.mesAniversario = mesAniversario;
	}
	
	public void aniversarioMes(int mes)
	{	
		
		if (mes == this.mesAniversario)
		{
			super.credite(super.getSaldo() * corrMonetaria);
		}
		
		else 
		{
			super.credite((super.getSaldo() * juros));
		}
	}
	
	
	
	

}
