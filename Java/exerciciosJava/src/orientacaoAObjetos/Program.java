package orientacaoAObjetos;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Professores professor1 = new Professores();
		Aluno aluno1 = new Aluno();
	
		
		System.out.println("Digite o nome do professor: ");
		professor1.nome = leia.next();
		System.out.println("Digite a idade do professor: ");
		professor1.idade = leia.nextInt();
		System.out.println("Digite ea especialidade: ");
		professor1.especialidade = leia.next();
		System.out.println("Digite a cidade do professor: ");
		professor1.cidade = leia.next();
		
		System.out.println("Digite o nome do aluno: ");
		aluno1.nome = leia.next();
		System.out.println("Digite o curso do aluno: ");
		aluno1.curso = leia.next();
		System.out.println("Digite o Sexo do aluno M - Masculino, F - Feminino, O - outros ");
		aluno1.sexo = leia.next().toUpperCase().charAt(0);
		
		
		System.out.printf("O professor %s tem %d anos, é especialista em %s e mora em %s", professor1.nome, professor1.idade, professor1.especialidade, professor1.cidade);
		leia.close();
	}

}
