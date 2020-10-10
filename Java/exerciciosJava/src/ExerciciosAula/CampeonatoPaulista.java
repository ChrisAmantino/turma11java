package ExerciciosAula;

import java.util.Scanner;

public class CampeonatoPaulista {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		String[] times = {"Corinthians", "Palmeiras", "SPFC", "Santos"};
		int[] pontos = new int[4]; // isso é a mesma coisa que int[] pontos = {0,0,0,0};
		int i = 0, contador = 0;
		char continua, resposta;
		
		
		do {
			contador = contador + 1;
			System.out.printf("Rodada %d\n", contador);
		for (i = 0; i < times.length ; i++)
		{
			System.out.printf("O %s Ganhou, Empatou ou Perdeu? ", times[i]);
			resposta = leia.next().toUpperCase().charAt(0);
			
			if (resposta == 'G')
			{
				pontos[i] = pontos[i] + 3;
			}
			
			else if (resposta == 'E')
			{
				pontos[i] =pontos[i] + 1;
			}
			else if (resposta == 'P')
			{
				pontos[i] = pontos[i];
			}
		}
		
		for(i = 0; i < 4; i++)
		{
			System.out.printf("\nO %s tem %d pontos", times[i], pontos[i]);
		}
		
		System.out.print("\nQuer passar para a proxima rodada?\n");
		continua = leia.next().toUpperCase().charAt(0);
		
		} while (continua == 'S');

		leia.close();

	}

}
