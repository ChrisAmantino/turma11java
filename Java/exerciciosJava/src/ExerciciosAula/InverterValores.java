package ExerciciosAula;

import java.util.Scanner;

public class InverterValores {

public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a=0,b=0;
		
		System.out.print("LEIA A:");
		a = leia.nextInt();
		System.out.print("LEIA B:");
		b = leia.nextInt();
		System.out.printf("VALORES ANTES DA INVERSÃO A: %d B: %d",a,b);
		
		a = a + b; // 3 + 2 = 5
		b = a - b; // 5 - 2 = 3
		a = a - b; // 5 - 3 = 2
		System.out.println();
		System.out.printf("VALORES APÓS A INVERSÃO A: %d B: %d",a,b);
		leia.close();

	}


}




