package exerciciosHeran�aEncapsulamento;

public class TesteEmpregado {

	public static void main(String[] args) {
		Empregado christian = new Empregado("Christian", 756, 1899.70);
		
		christian.setImposto(10);
		
		System.out.println("O salario do funcion�rio " + christian.getNome() + " � R$ " + christian.calcularSalario());
	}

}
