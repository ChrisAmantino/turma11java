package aula17;

import java.util.Scanner;

public class ListaClasseExercicio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Cliente cliente1 = new Cliente("Christian");
		Cliente cliente2 = new Cliente("Ed",'M');
		Cliente cliente3 = new Cliente("Zaine", 'F', 1991);
		
		System.out.println("Digite o nome do cliente 1: ");
		cliente1.nome = leia.next();
		System.out.println("Nome do cliente1: " + cliente1.nome);
		System.out.println("Digite seu ano de Nascimento do cliente 1: ");
		cliente1.anoNascimento = leia.nextInt();
		System.out.println(cliente1.anoNascimento);
		leia.close();
		System.out.println(cliente3.nome + " " + cliente3.anoNascimento + " " + cliente3.sexo);
		System.out.println("Idade do cliente 1: " + cliente1.calcIdade());
		System.out.println("Idade do cliente 3: " + cliente3.calcIdade());
		
	}

}
