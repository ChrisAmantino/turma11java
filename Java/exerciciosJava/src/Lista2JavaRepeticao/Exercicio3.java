package Lista2JavaRepeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Solicitar a idade de várias pessoas e imprimir: 
		 * Total de pessoas com menos de 21 anos.
		 * Total de pessoas com mais de 50 anos. 
		 * O programa termina quando idade for =-99.
		 */
		Scanner leia = new Scanner(System.in);
		int idade, soma21 = 0, soma50 = 0, idadeInvalida = 0;
		
		System.out.print("Digite a idade: ");
		idade = leia.nextInt();
		
		while(idade != -99)
		{
			if (idade > 50)
			{
				soma50 = soma50 +1;
			}
			else if (idade >= 0 && idade < 21)
			{
				soma21 = soma21+1;
			}
			else if (idade < 0 && idade != -99)
			{
				idadeInvalida = idadeInvalida+1;
			}
		System.out.print("Digite a idade: ");
		idade = leia.nextInt();
		}
		System.out.printf("O número de pessoas menores que 21 anos é %d e maiores que 50 é %d,", soma21, soma50);
		leia.close();
		if(idadeInvalida > 0)
		{
			System.out.printf(" foi digitado %d idade(s) negativa(s), que são inválidas!", idadeInvalida);
		}
	}

}
