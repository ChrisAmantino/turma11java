package Lista2JavaRepeticao;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args)
	{
		/*
		 * Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
		 * No final, mostre a soma dos n�meros digitados.
		 */
		Scanner leia = new Scanner(System.in);
		
		int num, soma=0;
		
		do 
		{
			System.out.print("Digite qualquer n�mero inteiro diferente de 0: ");
			num = leia.nextInt();
			soma = soma + num;		
		} while (num != 0);
		
		System.out.printf("O resultado da soma dos n�meros digitados �: %d" , soma);
		
		
		leia.close();
	}

}
