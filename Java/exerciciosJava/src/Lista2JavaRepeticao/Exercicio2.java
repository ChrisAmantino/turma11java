package Lista2JavaRepeticao;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args)
	{
		// Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
		 
		Scanner tec = new Scanner(System.in);
		int num, somaPar=0, somaImpar=0, somaZero=0;
		
		for(int i = 1; i<=10; i++)
		{
			System.out.print("Digite um n�mero inteiro: ");
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
		System.out.printf("Voc� digitou %d n�meros pares e %d n�meros �mpares", somaPar, somaImpar);
		if (somaZero >=1)
		{
			System.out.printf(" e %d n�meros zero, que � um n�mero neutro, portanto n�o � contabilizado nem como par, nem como �mpar!", somaZero);
			
		}
		tec.close();
	}
}
