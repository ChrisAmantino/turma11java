package exerciciosHerançaPolimorfismo;

public class Cavalo extends Animal {
	
	
	@Override
	
	public String movimentar()
	{
		return (super.movimentar() + "galopando...");
	}
	
	public String emitirSom()
	{
		return (super.emitirSom() + " " + "Relinchando...");
	}
}
