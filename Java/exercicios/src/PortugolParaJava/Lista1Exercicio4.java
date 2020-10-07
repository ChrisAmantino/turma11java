package portugol;

import java.util.Scanner;

public class Lista1Exercicio4 {
	public static void main(String[] args)
	{
		/*
		 * /*
		 * Escreva  um sistema que leia três números inteiros e positivos 
		 * (A, B, C) e calcule a seguinte expressão
		 * D = (R + S)/2, onde R = (A+B)² e S=(B+C)²
		 *
			 inteiro a = 0
			 inteiro b = 0
			 inteiro c = 0
			 inteiro r = 0
			 inteiro s = 0
			 inteiro d = 0
	
			escreva("Digite o valor de a: ")
			leia(a)
			escreva("Digite o valor de b: ")
			leia(b)
			escreva("Digite o valor de c: ")
			leia(c)
			r = mat.potencia((a+b), 2)
			s = mat.potencia((b+c),2)
			d = (r+s)/2
			escreva("O resultado é: ", d)
		 */
		Scanner leia = new Scanner(System.in);
		int a = 0, b = 0, c = 0, r = 0, s = 0, d = 0;
		System.out.print("Digite o valor de a: ");
		a = leia.nextInt();
		System.out.print("Digite o valor de b: ");
		b = leia.nextInt();
		System.out.print("Digite o valor de c: ");
		c = leia.nextInt();
		r = (int) Math.pow((a + b), 2);
		s = (int) Math.pow((b + c), 2);
		d = (r+s)/2;
		System.out.println("O resultado é: " + d);
		
		
	}

}
