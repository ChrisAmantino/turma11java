package PortugolParaJava;

import java.util.Scanner;

public class Litsa1Exercicio1 {

	public static void main(String[] args) {
		
		/*
		 * inteiro anos
		inteiro mes
		inteiro dia
		inteiro somaDias
		

		escreva("Digite os anos: ")
		leia(anos)
		escreva("Digite os meses: ")
		leia(mes)
		escreva("Digite os dias: ")
		leia(dia)
		somaDias = ( (anos * 365) + (mes * 30) + dia )
		escreva("Você tem " ,somaDias, " dias")
		 */
		Scanner leia = new Scanner(System.in);
		
		int anos = 0, mes = 0, dia = 0, somaDias = 0;
		
		System.out.print("Digite os anos: ");
		anos = leia.nextInt();
		System.out.print("Digite os meses: ");
		mes = leia.nextInt();
		System.out.print("Digite os dias: ");
		dia = leia.nextInt();
		somaDias = ( (anos * 365) + (mes * 30) + dia );
		System.out.printf("Você tem %s", somaDias + " dias");
		
	}

}
