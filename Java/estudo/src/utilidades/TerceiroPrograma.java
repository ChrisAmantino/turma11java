package utilidades;

public class TerceiroPrograma {

	public static void main(String[] args) {
		int valor = 10; // //%d inteiro
		String nome = "Aula de Java"; //%s cadeia
		char opcao = 'X'; // caracter
		double salario = 100.01; //%f real
		
		
		System.out.print("Exemplo de print\n");
		System.out.println("Nome do usuario: " + nome + " Salário: " + salario);
		System.out.printf("Nome do usuario %s e salario %.2f com acrescimo de 10%%", nome, salario);

	}

}
