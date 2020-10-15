package app;

import java.util.Scanner;

import classes.AlunoGeneration;

public class Boletim {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		AlunoGeneration primeiro = new AlunoGeneration();
		
		System.out.print("Digite o nome: ");
		primeiro.nomeAluno = leia.next();
		System.out.print("Digite o sexo do aluno: ");
		primeiro.sexo = leia.next().toUpperCase().charAt(0);
		System.out.print("Qual o curso do aluno? ");
		primeiro.nomeCurso = leia.next();
		System.out.print("Qual a nota 1 do aluno? ");
		primeiro.nota1 = leia.nextInt();
		System.out.println("Qual a nota 2 do aluno? ");
		primeiro.nota2 = leia.nextInt();
		
		
		
		System.out.printf("Aluno: %s", primeiro.nomeAluno);
		System.out.printf("\nO sexo do aluno é: %s", (primeiro.sexo=='F')? "Feminino" : (primeiro.sexo == 'M')? "Masculino" : "Outros");
		System.out.printf("\nCurso: %s", primeiro.nomeCurso);
		System.out.printf("\nNota1: %d", primeiro.nota1);
		System.out.printf("\nNota2: %d", primeiro.nota2);
	}

}

