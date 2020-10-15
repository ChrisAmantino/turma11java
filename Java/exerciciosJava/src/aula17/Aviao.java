package aula17;

public class Aviao {
	public int passageiro;
	public int litrosGasolina;
	
	public void voar()
	{
		if (this.passageiro > 150)
		{
			System.out.println("O avião atingiu o número mínimo de passageiros, podemos decolar!");
		} else {
			System.out.println("O avião ainda não atingiu o número mínimo de passageiros, devemos aguardar");
		}
	}
	
	public void abastecer()
	{
		if (this.litrosGasolina > 200)
		{
			System.out.println("O tanque está cheio, apertem os cintos!");
		} else {
			System.out.println("Senhor piloto, abasteça o avião antes de decolar!");
		}
	}

}
