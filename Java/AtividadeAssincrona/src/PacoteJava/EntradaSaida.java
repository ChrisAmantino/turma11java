package PacoteJava;

import java.util.Scanner;

public class EntradaSaida {
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int a,b,soma;
		
		System.out.print("Digite um valor para a: ");
		a = ler.nextInt();
		System.out.print("DIgite um valor para b: ");
		b = ler.nextInt();
		soma = a + b;
		System.out.printf("A soma do número %d + %d é igual a %d", a, b, soma);
	
	}

}
