package Lista1Java;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
			n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
			�mpar exiba o n�mero elevado ao quadrado.
		 */
		Scanner leia = new Scanner(System.in);
		int numero, potencia;
		double raiz = 0;
		
		
		System.out.print("Escreva um numero: ");
		numero = leia.nextInt();
		if ((numero%2)==0 && numero >= 0)
		{
			raiz = Math.sqrt(numero);
			System.out.printf("O n�mero %d � par, e sua raiz quadrada �: %.2f", numero, raiz);
		}
		else if ((numero%2) != 0 && numero > 0)
		{
			potencia = (int) Math.pow(numero, 2);
			System.out.printf("O numero %d � impar, e seu resultado elevado ao quadrado �: %d ", numero, potencia);
		}
		
		else if (numero < 0)
		{
			System.out.println("Voc� digitou um n�mero inv�lido!");
		}
				
		leia.close();

	}

}
