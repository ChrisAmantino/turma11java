package aula17;

public class Aviao {
	public int passageiro;
	public int litrosGasolina;
	
	public void voar()
	{
		if (this.passageiro > 150)
		{
			System.out.println("O avi�o atingiu o n�mero m�nimo de passageiros, podemos decolar!");
		} else {
			System.out.println("O avi�o ainda n�o atingiu o n�mero m�nimo de passageiros, devemos aguardar");
		}
	}
	
	public void abastecer()
	{
		if (this.litrosGasolina > 200)
		{
			System.out.println("O tanque est� cheio, apertem os cintos!");
		} else {
			System.out.println("Senhor piloto, abaste�a o avi�o antes de decolar!");
		}
	}

}
