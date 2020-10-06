package PortugolParaJava;

import java.util.Scanner;

public class Lista1Exercicio7 {

	public static void main(String[] args) {
		/*
		 * Um sistema de equações lineares do tipo: 
		 * ax+by = c
		 * dx+ey = f , pode ser resolvido segundo mostrado abaixo :
		 * x = (ce-bf)/(ae-bd) e y = (af-cd)/(ae-bd)
		 * Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y. 
		 *	inteiro A, B, C, D, E, F, X = 0, Y = 0
		 *	escreva("Digite o valor de A: ")
			leia(A)
			escreva("Digite o valor de b: ")
			leia(B)
			escreva("Digite o valor de C: ")
			leia(C)
			escreva("Digite o valor de D: ")
			leia(D)
			escreva("Digite o valor de E: ")
			leia(E)
			escreva("Digite o valor de F: ")
			leia(F)
			 X = ( (C*E) - (B*F) ) / ( (A*E) - (B*D) )
			 Y = ( (A*F) - (C*D) ) / ( (A*E) - (B*D) )
			 escreva(X)
			 escreva("\n")
			 escreva(Y) 
			 */
			Scanner leia = new Scanner(System.in);
			int a, b, c, d, e, f;
			double x = 0, y = 0;
			
			System.out.print("Digite o valor de A: ");
			a = leia.nextInt();
			System.out.print("Digite o valor de B: ");
			b = leia.nextInt();
			System.out.print("Digite o valor de C: ");
			c = leia.nextInt();
			System.out.print("Digite o valor de D: ");
			d = leia.nextInt();
			System.out.print("Digite o valor de E: ");
			e = leia.nextInt();
			System.out.print("Digite o valor de F: ");
			f = leia.nextInt();
			x = ( (c*e) - (b*f) ) / ( (a*e) - (b*d) );
			y = ( (a*f) - (c*d) ) / ( (a*e) - (b*d) );
			System.out.printf("O valor de x é: %.2f \n", x);
			System.out.printf("O valor de y é: %.2f", y);
			
			
			
			leia.close();
	}

}
