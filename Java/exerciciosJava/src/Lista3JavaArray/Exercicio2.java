package Lista3JavaArray;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args)
	{
		/*
		 * Faça um programa que receba 6 números inteiros e mostre: 
			• Os números pares digitados;  
			• A soma dos números pares digitados; 
			• Os números ímpares digitados; 
			• A quantidade de números ímpares digitados.
		 */
		Scanner leia = new Scanner(System.in);
		int vetor[] = new int[6];
		int somaPar = 0, contadorImpar=0, i = 0, x = 0;
		int impar[] = new int[6];
		
		
		for(i = 0; i < vetor.length; i++)
		{
			System.out.printf("Digite um número inteiro para a posição vetor[%d]: ", i);
			vetor[i] = leia.nextInt();
			
			if(vetor[i]%2==0)
			{
				somaPar = somaPar + vetor[i];
			}
			else if(vetor[i]%2 != 0)
			{
				contadorImpar= contadorImpar + 1;
				impar[x] = vetor[i];
				x++;
			}
			
		}
		
		for(x = 0; x<impar.length; x++)
		{
			if(vetor[x]%2 != 0)
			{
			System.out.printf("O número %d é ímpar!\n", vetor[x]);
			}
		}	
		
		System.out.printf("O resultado da soma dos números pares digitados dentro do vetor é: %d\n",somaPar);
		System.out.printf("Voce digitou %d números ímpares", contadorImpar);
		
		
		leia.close();
	}
}
