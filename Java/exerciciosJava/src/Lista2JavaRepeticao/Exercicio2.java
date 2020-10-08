package Lista2JavaRepeticao;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args)
	{
		// Ler 10 números e imprimir quantos são pares e quantos são ímpares.
		 
		Scanner tec = new Scanner(System.in);
		int num, somaPar=0, somaImpar=0, somaZero=0;
		
		for(int i = 1; i<=10; i++)
		{
			System.out.print("Digite um número inteiro: ");
			num = tec.nextInt();
			
			if((num%2)==0 && num != 0)
			{
				somaPar = somaPar+1;
			}
			else if ((num%2) != 0 && num != 0)
			{
				somaImpar = somaImpar+1;
			}
			else
			{
				somaZero = somaZero+1;
			}
			
		}
		System.out.printf("Você digitou %d números pares e %d números ímpares", somaPar, somaImpar);
		if (somaZero >=1)
		{
			System.out.printf(" e %d números zero, que é um número neutro, portanto não é contabilizado nem como par, nem como ímpar!", somaZero);
			
		}
		tec.close();
	}
}
