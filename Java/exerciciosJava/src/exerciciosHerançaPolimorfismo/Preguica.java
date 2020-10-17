package exerciciosHerançaPolimorfismo;

public class Preguica extends Animal {
		
	@Override
	public String movimentar()
	{
		return (super.movimentar() + "subindo na árvore");
	}
	
	public String emitirSom()
	{
		return (super.emitirSom() + " de preguiça");
	}
}
