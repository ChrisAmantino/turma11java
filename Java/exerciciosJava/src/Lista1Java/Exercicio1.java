package Lista1Java;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		 */
		Scanner leia = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.print("Digite o valor do primeiro numero: ");
		num1 = leia.nextInt();
		System.out.print("Digite o valor do segundo numero: ");
		num2 = leia.nextInt();
		System.out.print("Digite o valor do terceiro numero: ");
		num3 = leia.nextInt();
		
		if(num1 > num2 && num1 > num3)
		{
			System.out.printf("O maior n�mero digitado �: %d",num1);
		}
		else if (num2 > num1 && num2 > num3)
		{
			System.out.printf("O maior n�mero digitado �: %d",num2);
		}
		else
		{
			System.out.printf("O maior n�mero digitado �: %d",num3);
		}
		
		
		
		
		
		
		leia.close();
	}

}
