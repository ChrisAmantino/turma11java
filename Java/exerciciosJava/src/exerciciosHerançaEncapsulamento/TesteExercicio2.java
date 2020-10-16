package exerciciosHerançaEncapsulamento;

public class TesteExercicio2 {
	public static void main(String args [])
	{
		Fornecedor principal = new Fornecedor("Maior Fornecedor", "Avenida do Estado", 18900.50, 15000.00);
		
		System.out.println("Fornecedor: " + principal.getNome());
		System.out.println("Endereço do fornecedor: " + principal.getEndereco());
		System.out.println("Crédito inicial do fornecedor: " + principal.getValorCredito());
		System.out.println("Valor da dívida do fornecedor: " + principal.getValorDivida());
		//double saldoAtual = principal.obterSaldo(); 
		System.out.println("Após pagar a dívida, o fornecedor terá R$ " + principal.obterSaldo() + " de saldo");
	}
}
