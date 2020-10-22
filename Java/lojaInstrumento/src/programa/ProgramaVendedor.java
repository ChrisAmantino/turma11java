package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.Instrumentos;

public class ProgramaVendedor {
	static String nome = "";
	static String tipo = "";
	static double preco = 0.0;
	static int quantidade = 0;

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		
		List<Instrumentos> catalogo = new ArrayList<>();
		catalogo.add(new Instrumentos("Guitarra",10, 380.90, "Instrumento de Corda"));
		catalogo.add(new Instrumentos("Bateria", 4, 2800.00, "Instrumento de Percurssão"));
		catalogo.add(new Instrumentos("Flauta", 20, 180.99, "Instrumento de Sopro"));
		catalogo.add(new Instrumentos("Piano", 2, 3500.00, "Instrumento de Corda"));
		Instrumentos inst = new Instrumentos(nome, quantidade, preco, tipo);
		
		do {
			linha();
			System.out.println("O que você deseja fazer? ");
			System.out.print("1 - Ver catálogo completo\n");
			System.out.print("2 - Verificar se o produto está disponível\n");
			System.out.print("3 - Dar baixa em produtos\n");
			System.out.print("4 - Sair\n");
			linha();
			System.out.print("Digite: ");
			System.out.println();
			int opc = leia.nextInt();
		
					if (opc == 1)
					{
					linhaCatalogo(150);
					inst.listar(catalogo);
					linhaCatalogo(150);
					}
					
					else if (opc == 2)
					{
						System.out.println("Qual produto você deseja verificar?");
						System.out.println("1 - Guitarra;");
						System.out.println("2- Bateria;");
						System.out.println("3 - Flauta");
						System.out.println("4 - Piano");
						int verificar = leia.nextInt();
						catalogo.get(verificar-1).disponivel();
						
					}
					else if (opc == 3) 
					{	
						linhaCatalogo(150);
						inst.listar(catalogo);
						linhaCatalogo(150);
						System.out.print("Qual produto foi vendido? Digite o Index: ");
						int index = leia.nextInt();
						System.out.print("\nQuantos produtos foram vendidos? ");
						int x = leia.nextInt();
						catalogo.get(index).setQuantidade(catalogo.get(index).getQuantidade()-x);
						if (x > inst.getQuantidade())
						{
							System.out.println("\nVocê digitou um número inválido! Tente Novamente!\n");
							
						}
					}
					
					else if (opc == 4)
					{
						break;
					}
		}while(true);
		
		leia.close();	

	}
	
	public static void linha()
	{
		System.out.println("=====================================================");
	}
	
	public static void linhaCatalogo(int num)
	{
		for (int i = 1; i <= num; i++)
		{
			System.out.print("+");
		}
		System.out.println();
	}

}
