package portugol;

import java.util.Scanner;

public class ListaRevis�oExerc�cioParImpar {

	public static void main(String[] args) {
		/*
		 * Recebe um valor inteiro
		Verificar se o valor � maior que 0 ou 0
		Ela n�o faz em numero negativo
		se par mande mensagem
		se impar mande mensagem
		se zero avise que usu�rio digitou zero

		 */
		Scanner leia = new Scanner(System.in);
		int numero;
		
		System.out.print("Escreva um n�mero interio positivo: ");
		numero = leia.nextInt();
		
		if (numero > 0)
		{
			if (numero%2 == 0)
			{
				System.out.println("Seu n�mero � par e positivo!");
			}
			else 
			{
				System.out.println("Seu n�mero � �mpar e positivo!");
			}
		}
		else if (numero == 0)
		{
			System.out.println("Seu numero � neutro!");
		}
		else 
		{
			System.out.println("Seu n�mero � negativo!");
		}
			
		

	}

}
