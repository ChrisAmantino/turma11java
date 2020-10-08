package Lista2JavaRepeticao;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args)
	{
		/*
		 * Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
		 * No final, mostre a soma dos números digitados.
		 */
		Scanner leia = new Scanner(System.in);
		
		int num, soma=0;
		
		do 
		{
			System.out.print("Digite qualquer número inteiro diferente de 0: ");
			num = leia.nextInt();
			soma = soma + num;		
		} while (num != 0);
		
		System.out.printf("O resultado da soma dos números digitados é: %d" , soma);
		
		
		leia.close();
	}

}
