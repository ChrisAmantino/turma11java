package portugol;

import java.util.Scanner;

public class Lista1Exercicio5 {

	public static void main(String[] args) {

		/*
		 * Fa�a um sistema que leia as 3 notas de um aluno 
		 * e calcule a m�dia final deste aluno. Considerar que a 
		 * m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente. 
			 real notaA = 0
			 real notaB = 0
			 real notaC = 0
			 real mediaFinal
	
			 escreva("Digite sua nota A: ")
			 leia(notaA)
			 escreva("Digite sua nota B: ")
			 leia(notaB)
			 escreva("Digite sua nota C: ")
			 leia(notaC)
			 mediaFinal = ( ((notaA*2) + (notaB*3) + (notaC*5))/10
			 )
			 escreva("Sua m�dia final �: ",mediaFinal)
		*/
		Scanner leia = new Scanner(System.in);
		double notaA = 0, notaB = 0, notaC = 0, mediaFinal = 0;
		System.out.print("Digite sua nota A: ");
		notaA = leia.nextDouble();
		System.out.print("Digite sua nota B: ");
		notaB = leia.nextDouble();
		System.out.print("Digite sua nota C: ");
		notaC = leia.nextDouble();
		 mediaFinal = ( ((notaA*2) + (notaB*3) + (notaC*5))/10 );
		 System.out.print("Sua nota m�dia final �: " + mediaFinal);
		 
		
	}

}
