package Lista1Java;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args)
	{
		/*
		 * Faça um programa que entre com três números e coloque em ordem crescente.
		 */
		Scanner leia = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.print("Digite o valor do primeiro numero: ");
		num1 = leia.nextInt();
		System.out.print("Digite o valor do segundo numero: ");
		num2 = leia.nextInt();
		System.out.print("Digite o valor do terceiro numero: ");
		num3 = leia.nextInt();
		
		if((num1 < num2) && (num1 < num3) && ( num2<num3 ))
		{
			System.out.printf("Os numeros na ordem crescente são: %d, %d e %d", num1, num2, num3);			
		}
		else if((num1 < num2) && (num1 < num3) && ( num3<num2 ))
		{
			System.out.printf("Os numeros na ordem crescente são: %d, %d e %d", num1, num3, num2);			
		}
		else if((num2 < num1) && (num2 < num3) && (num1<num3))
		{
			System.out.printf("Os numeros na ordem crescente são: %d, %d e %d", num2, num1, num3);
		}
		else if((num2 < num1) && (num2 < num3) && (num3<num1))
		{
			System.out.printf("Os numeros na ordem crescente são: %d, %d e %d", num2, num3, num1);
		}
		else if((num3 < num1) && (num3 < num2) && (num1<num2))
		{
			System.out.printf("Os numeros na ordem crescente são: %d, %d e %d", num3, num1, num2);
		}
		else
		{
			System.out.printf("Os numeros na ordem crescente são: %d, %d e %d", num3, num2, num1);
		}
		
		
		leia.close();
		}
}

