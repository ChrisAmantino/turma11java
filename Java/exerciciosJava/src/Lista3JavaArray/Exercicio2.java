package Lista3JavaArray;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args)
	{
		/*
		 * Fa�a um programa que receba 6 n�meros inteiros e mostre: 
			� Os n�meros pares digitados;  
			� A soma dos n�meros pares digitados; 
			� Os n�meros �mpares digitados; 
			� A quantidade de n�meros �mpares digitados.
		 */
		Scanner leia = new Scanner(System.in);
		int vetor[] = new int[6];
		int somaPar = 0, contadorImpar=0, i = 0, x = 0;
		int impar[] = new int[6];
		
		
		for(i = 0; i < vetor.length; i++)
		{
			System.out.printf("Digite um n�mero inteiro para a posi��o vetor[%d]: ", i);
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
			System.out.printf("O n�mero %d � �mpar!\n", vetor[x]);
			}
		}	
		
		System.out.printf("O resultado da soma dos n�meros pares digitados dentro do vetor �: %d\n",somaPar);
		System.out.printf("Voce digitou %d n�meros �mpares", contadorImpar);
		
		
		leia.close();
	}
}
