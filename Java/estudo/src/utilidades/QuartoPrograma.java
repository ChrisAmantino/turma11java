package utilidades;

import java.util.Scanner;

public class QuartoPrograma {

	public static void main(String[] args) {
		// criar um teclado dentro do programa
		Scanner tec = new Scanner(System.in); //criou o teclado
		String nome;
		int anoDeNascimento, idade = 0;
		double salario;
		
		
		System.out.print("Escreva o nome do usuario: ");
		nome = tec.next();
		System.out.print("Escreva seu ano de Nascimento: ");
		anoDeNascimento = tec.nextInt();
		System.out.print("Escreva seu salário: ");
		salario = tec.nextDouble();
		idade = 2020 - anoDeNascimento;
		System.out.printf("Olá %s, sua idade é %d anos e seu salário %.2f", nome, idade, salario);
		
		tec.close();
	}

}
