package portugol;

import java.util.Scanner;

public class ListaRevisãoExercícioParImpar {

	public static void main(String[] args) {
		/*
		 * Recebe um valor inteiro
		Verificar se o valor é maior que 0 ou 0
		Ela não faz em numero negativo
		se par mande mensagem
		se impar mande mensagem
		se zero avise que usuário digitou zero

		 */
		Scanner leia = new Scanner(System.in);
		int numero;
		
		System.out.print("Escreva um número interio positivo: ");
		numero = leia.nextInt();
		
		if (numero > 0)
		{
			if (numero%2 == 0)
			{
				System.out.println("Seu número é par e positivo!");
			}
			else 
			{
				System.out.println("Seu número é ímpar e positivo!");
			}
		}
		else if (numero == 0)
		{
			System.out.println("Seu numero é neutro!");
		}
		else 
		{
			System.out.println("Seu número é negativo!");
		}
			
		

	}

}
