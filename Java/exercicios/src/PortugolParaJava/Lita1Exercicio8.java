package portugol;

import java.util.Scanner;

public class Lita1Exercicio8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e 
			dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
			escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. 
			real total,impostos,distribuidor,custoFabrica

				escreva("digite o valor de custo: ")
				leia(custoFabrica)

				impostos = (45*custoFabrica)/100
				distribuidor = (28*custoFabrica)/100

				total =custoFabrica + impostos + distribuidor

				escreva("Seu carro terá um valor total de: "+total)
				*/
		double total, imposto, distribuidor, valorCusto;
		System.out.print("Escreva o valor de custo: ");
		valorCusto = leia.nextDouble();		
		imposto = (45 * valorCusto)/100;
		distribuidor = (28*valorCusto)/100;		
		total = valorCusto + imposto + distribuidor;
		System.out.printf("Seu carro sairá pelo valor total de: %.2f" , total);
		
			
		

	}

}
