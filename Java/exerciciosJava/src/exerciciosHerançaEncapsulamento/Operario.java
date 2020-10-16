package exerciciosHerançaEncapsulamento;

public class Operario extends Pessoa {
	/*
	 * Implemente a classe Operario como subclasse da classe Pessoa. Um determinado operário 
	 * tem como atributos da classe Pessoa e também os atributos próprios como valorProducao 
	 * (que corresponde ao valor monetário dos artigos efetivamente produzidos pelo operário) 
	 * e comissao (que corresponde à porcentagem do valorProducao que será adicionado ao vencimento base do operário). 
	 */
	private double valorProducao;
	private int comissao;
	public Operario(String nome, double valorProducao, int comissao) {
		super(nome);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	public double getValorProducao() {
		return valorProducao;
	}
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}
	public int getComissao() {
		return comissao;
	}
	public void setComissao(int comissao) {
		this.comissao = comissao;
	}
	
	

}
