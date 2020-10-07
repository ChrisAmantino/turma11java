package Lista1Java;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que receba a idade de uma pessoa e 
		 * mostre na saída em qual categoria ela se encontra:
			10-14 infantil
			15-17 juvenil
			18-25 adulto
		 */
		Scanner leia = new Scanner(System.in);
		int idade;
		
		System.out.print("Digite sua idade em anos: ");
		idade = leia.nextInt();
		
		if (idade >= 10 && idade <=14)
		{
			System.out.printf("Voce tem %d anos, e se encontra na categoria Infantil!", idade);
		}
		else if (idade >=15 && idade <= 17)
		{
			System.out.printf("Voce tem %d anos, e se encontra na categoria Juvenil!", idade);
		}
		else if (idade >= 18 && idade <=25)
		{
			System.out.printf("Voce tem %d anos, e se encontra na categoria Adulto!", idade);
		}
		else
		{
			System.out.println("Você digitou uma idade inválida!");
		}
		}

}
