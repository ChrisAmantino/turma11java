package Lista1Java;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Faça um programa em que permita a entrada de um número qualquer e exiba se este
			número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
			ímpar exiba o número elevado ao quadrado.
		 */
		Scanner leia = new Scanner(System.in);
		int numero, potencia;
		double raiz = 0;
		
		
		System.out.print("Escreva um numero: ");
		numero = leia.nextInt();
		if ((numero%2)==0 && numero >= 0)
		{
			raiz = Math.sqrt(numero);
			System.out.printf("O número %d é par, e sua raiz quadrada é: %.2f", numero, raiz);
		}
		else if ((numero%2) != 0 && numero > 0)
		{
			potencia = (int) Math.pow(numero, 2);
			System.out.printf("O numero %d é impar, e seu resultado elevado ao quadrado é: %d ", numero, potencia);
		}
		
		else if (numero < 0)
		{
			System.out.println("Você digitou um número inválido!");
		}
				
		leia.close();

	}

}
