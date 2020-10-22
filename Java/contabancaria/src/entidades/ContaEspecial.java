package entidades;

public class ContaEspecial extends ContaCorrente {
	
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void calculaJuros()
	{
		double juros = 0.02;
		super.credite(super.getSaldo()*juros);
	}
	
}
