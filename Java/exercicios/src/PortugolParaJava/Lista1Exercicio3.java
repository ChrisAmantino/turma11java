package PortugolParaJava;

import java.util.Scanner;

public class Lista1Exercicio3 {
	public static void main(String[] args)
	{
		/*
		 * Faça um sistema que leia o tempo de duração de um evento em uma fábrica 
		 * expressa em segundos e mostre-o expresso em 
		 * horas, minutos e segundos.
		 * 1 seg 
		 * 1 min = 60 seg
		 * 1 hora = 3600 seg
		 

		 inteiro tempoDeDuracao = 0
		 inteiro horas = 0
		 inteiro minutos = 0
		 inteiro segundos = 0

		 escreva("Digite aqui a duração do evento em segundos: ")
		 leia(tempoDeDuracao)
		 horas = (tempoDeDuracao/3600)
		 minutos = (tempoDeDuracao%3600)/60
		 segundos = (tempoDeDuracao%3600)%60
		 escreva("Seu evento durou: " + horas + " hora(s), " + minutos + " minuto(s), " + segundos + " segundo(s).")
		*/
		Scanner leia = new Scanner(System.in);
		int tempoDeDuracao = 0, horas = 0, minutos = 0, segundos = 0;
		
		System.out.print("Digite aqui a duração do evento em segundos: ");
		tempoDeDuracao = leia.nextInt();
		horas = (tempoDeDuracao/3600);
		minutos = (tempoDeDuracao%3600)/60;
		segundos = (tempoDeDuracao%3600)%60;
		System.out.print("Seu evento durou: " + horas + " hora(s), " + minutos + " minuto(s) e " + segundos + " segundo(s) ");
		
	}

}
