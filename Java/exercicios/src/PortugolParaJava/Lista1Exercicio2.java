package PortugolParaJava;

import java.util.Scanner;

public class Lista1Exercicio2 {

	public static void main(String[] args) {
		/*
		 * /*
		 *  Faça um sistema que leia a idade de uma pessoa 
		 *  expressa em dias e mostre-a expressa em 
		 *  anos, meses e dias. 
		 *  1 ano = 365 dias
		 *  1 mes = 30 dias
		 *  1 dia = 1 dias
		 *
			 //ingredientes-variaveis
			 inteiro idadePessoa = 0
			 inteiro anos = 0
			 inteiro meses = 0
			 inteiro dias = 0
	
			 //modo de preparo
			 escreva("Escreva sua idade em dias: ")
			 leia(idadePessoa)
			 anos = idadePessoa/365
			 escreva("\nTotal de anos: ", anos)
			 meses = (idadePessoa%365)/30
			 escreva("\nTotal de meses: ", meses)
			 dias = (idadePessoa%365)%30
			 escreva("\nTotal de dias: ", dias)
			 */
		Scanner leia = new Scanner(System.in);
		int idadePessoa =0, anos = 0, meses = 0, dias = 0;
		
		System.out.print("Escreva sua idade em dias: ");
		idadePessoa = leia.nextInt();
		anos = idadePessoa/365;
		System.out.printf("Total de anos: %s", anos + " anos.");
		System.out.println();
		meses = (idadePessoa % 365) / 30;
		System.out.printf("Total de meses: %s", meses + " meses.");
		System.out.println();
		dias = (idadePessoa % 365) % 30;
		System.out.printf("Total de dias: %s", dias + " dias.");
		System.out.println();
		
		leia.close();
		

	}

}
