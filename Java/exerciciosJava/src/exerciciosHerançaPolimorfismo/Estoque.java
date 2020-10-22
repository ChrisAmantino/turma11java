package exerciciosHeran�aPolimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Estoque {
	public static void main (String args[])
	{
		Locale.setDefault(Locale.US);
		//Armazenando dados na lista
		List <Produtos> lista = new ArrayList<>();
		lista.add(new Produtos("Bola", 29.90, 10));
		lista.add(new Produtos("Garrafa T�rmica", 40.99, 15));
		lista.add(new Produtos("Lumin�ria", 35.00, 20));
		lista.add(new Produtos("Ursinho de Pel�cia", 25.90, 25));
		
		
		for (Produtos x : lista)
		{
			System.out.printf("Produto: %s Pre�o: %.2f Quantidade: %d index %d \n", x.getNome(), x.getPreco(), x.getQuantidade(), lista.indexOf(x));
		}
		System.out.println();
		
		//Removendo dados da lista
		
		lista.remove(3); // removendo atrav�s do index
		System.out.println("Removendo produto:");
	
		for (Produtos x : lista)
		{
			System.out.printf("Produto: %s Pre�o: %.2f Quantidade: %d index %d \n", x.getNome(), x.getPreco(), x.getQuantidade(), lista.indexOf(x));
		}
		System.out.println();
		
		//Atulizando dados da lista
		lista.get(0).setQuantidade(7);
		lista.get(2).setPreco(25.00);
		
		for (Produtos x : lista)
		{
			System.out.printf("Produto: %s Pre�o: %.2f Quantidade: %d index %d \n", x.getNome(), x.getPreco(), x.getQuantidade(), lista.indexOf(x));
		}
	}

}
