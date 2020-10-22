package classes;

import java.util.List;

public class Instrumentos extends Produto 
{
	private String tipo;

	public Instrumentos(String nome, int quantidade, double preco, String tipo) {
		super(nome, quantidade, preco);
		this.tipo = tipo;
	}
	
	
	
	
	public String getTipo() {
		return tipo;
	}




	public void setTipo(String tipo) {
		this.tipo = tipo;
	}




	public void disponivel()
	{
		if(super.getQuantidade() > 0)
		{
			System.out.println("INSTRUMENTO DISPONÍVEL!");;
		}
		else
		{
			System.out.println("ESTAMOS SEM ESTE INSTRUMENTO NO ESTOQUE!");
		}
	}
	
	public void listar( List<Instrumentos> lista)
	{
		for (Instrumentos obj : lista)
		{
			System.out.println("[ Instrumento: " + obj.getNome() + " ] [ Quantidade: " + obj.getQuantidade() + " ] [ Valor: R$ " + obj.getPreco() + " ] [Tipo do Instrumento: " + obj.getTipo() + "] [ Index: " + lista.indexOf(obj) + " ]");
		}
	}

}
