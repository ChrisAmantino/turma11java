package exerciciosHeran�aPolimorfismo;

public class Preguica extends Animal {
		
	@Override
	public String movimentar()
	{
		return (super.movimentar() + "subindo na �rvore");
	}
	
	public String emitirSom()
	{
		return (super.emitirSom() + " de pregui�a");
	}
}
