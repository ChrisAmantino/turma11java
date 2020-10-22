package entidades;

public class ContaEmpresa extends ContaBancaria {
	private double limiteEmpresa;
	private double limiteUsado;
	
	public ContaEmpresa(double limiteUsado)
	{
		this.limiteUsado = limiteUsado;
	}
	
	public void emprestimoEmpresarial()
	{
		if (this.limiteUsado <= (this.limiteEmpresa*0.5))
		{
			super.credite(limiteEmpresa*2);
		}
	}
	
	

}
