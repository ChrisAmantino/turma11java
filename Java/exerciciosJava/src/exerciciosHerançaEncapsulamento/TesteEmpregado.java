package exerciciosHerançaEncapsulamento;

public class TesteEmpregado {

	public static void main(String[] args) {
		Empregado christian = new Empregado("Christian", 756, 1899.70);
		
		christian.setImposto(10);
		
		System.out.println("O salario do funcionário " + christian.getNome() + " é R$ " + christian.calcularSalario());
	}

}
