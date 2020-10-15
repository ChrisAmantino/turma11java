package aula17;

public class ListaClasseExercicio2 {
	public static void main(String[] args) {
		Aviao voo = new Aviao();
		
		voo.passageiro = 30;
		voo.litrosGasolina = 150;
		
		voo.voar();
		voo.abastecer();
	}
}
