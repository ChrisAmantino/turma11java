package portugol;

import java.util.Scanner;

public class Lista1Exercicio6 {
	public static void main(String[] args)
	{
		/*
		 * Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), 
		 * escreva a dist�ncia entre eles. A f�rmula que efetua tal c�lculo �:
		 * d = mat.raiz(mat.potencia((x2-x1),2) + mat.potencia((y2-y1),2), 2)
		 *
			 real x1,x2,y1,y2,d
			 escreva("Digite um valor para X1: ")
			 leia(x1)
			 escreva("Digite um valor para X2: ")
			 leia(x2)
			 escreva("Digite um valor para Y1: ")
			 leia(y1)
			 escreva("Digite um valor para Y2: ")
			 leia(y2)
	
			 d= mat.raiz(mat.potencia((x2-x1),2) + mat.potencia((y2-y1),2),2)
			 escreva("O valor de d �: ", d)
			 */
		Scanner leia = new Scanner(System.in);
		double x1, x2, y1, y2, potencia, d;
		System.out.print("Digite um valor para X1: ");
		x1 = leia.nextDouble();
		System.out.print("Digite um valor para X2: ");
		x2 = leia.nextDouble();
		System.out.print("Digite um valor para Y1: ");
		y1 = leia.nextDouble();
		System.out.print("Digite um valor para Y1: ");
		y2 = leia.nextDouble();
		potencia = Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2);
		d = Math.sqrt(potencia);
		
		System.out.printf("O valor de d �: %.2f",d);

	}

}
