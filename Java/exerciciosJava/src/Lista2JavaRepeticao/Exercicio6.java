package Lista2JavaRepeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/*
		 *Escrever um programa que receba v�rios n�meros inteiros no teclado. 
		 *E no final imprimir a m�dia dos n�meros m�ltiplos de 3. 
		 *Para sair digitar 0(zero)
		 */
		Scanner leia = new Scanner(System.in);
		double num, media = 0, soma = 0, contador = 0;
		
		do
		{
			System.out.print("Digite um n�mero inteiro diferente de 0: ");
			num = leia.nextDouble();
			
			if((num%3)==0 && num != 0)
			{	
				
				contador = contador+1;
				soma = soma + num;
				media = soma/contador;
			}
			
		}while (num != 0);
		System.out.printf("A m�dia dos n�meros digitados, m�ltiplos de 3 �: %.2f", media);
		
		
		leia.close();

	}

}
