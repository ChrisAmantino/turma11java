package ExerciciosAula;

import java.util.Scanner;

public class EscolhaUsuario {
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		int contador = 0;
		char continua;
		
		do
		{	
			contador++;
			System.out.println(contador);
			System.out.print("Você quer continuar o programa? s - sim n - não: ");
			continua = leia.next().toUpperCase().charAt(0);
			
		} while (continua == 'S');
		System.out.println("FIM DO PROGRAMA!");

		leia.close();
	}
	
}
