package exerciciosHeran�aEncapsulamento;

public class TesteExercicio2 {
	public static void main(String args [])
	{
		Fornecedor principal = new Fornecedor("Maior Fornecedor", "Avenida do Estado", 18900.50, 15000.00);
		
		System.out.println("Fornecedor: " + principal.getNome());
		System.out.println("Endere�o do fornecedor: " + principal.getEndereco());
		System.out.println("Cr�dito inicial do fornecedor: " + principal.getValorCredito());
		System.out.println("Valor da d�vida do fornecedor: " + principal.getValorDivida());
		//double saldoAtual = principal.obterSaldo(); 
		System.out.println("Ap�s pagar a d�vida, o fornecedor ter� R$ " + principal.obterSaldo() + " de saldo");
	}
}
