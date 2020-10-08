package Lista2JavaRepeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/*
		 *Escrever um programa que receba vários números inteiros no teclado. 
		 *E no final imprimir a média dos números múltiplos de 3. 
		 *Para sair digitar 0(zero)
		 */
		Scanner leia = new Scanner(System.in);
		double num, media = 0, soma = 0, contador = 0;
		
		do
		{
			System.out.print("Digite um número inteiro diferente de 0: ");
			num = leia.nextDouble();
			
			if((num%3)==0 && num != 0)
			{	
				
				contador = contador+1;
				soma = soma + num;
				media = soma/contador;
			}
			
		}while (num != 0);
		System.out.printf("A média dos números digitados, múltiplos de 3 é: %.2f", media);
		
		
		leia.close();

	}

}
