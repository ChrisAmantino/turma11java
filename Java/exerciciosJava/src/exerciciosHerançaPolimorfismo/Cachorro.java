package exerciciosHerançaPolimorfismo;

public class Cachorro extends Animal{
	
	@Override
	public String movimentar()
	{
		return (super.movimentar()+ "correndo..");
	}
	
	
	
	public String emitirSom()
	{
		return (super.emitirSom() + " " + "Au Au Au...");
	}
}
