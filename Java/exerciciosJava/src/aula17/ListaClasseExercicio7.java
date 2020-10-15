package aula17;

public class ListaClasseExercicio7 {

	public static void main(String[] args) {
		Paciente primeiro = new Paciente();
		
		primeiro.nome = "Christian";
		primeiro.sobrenome = "Amantino";
		primeiro.sintoma = true;
		primeiro.tosse = false;
		
		primeiro.nomeCompleto();
		primeiro.tratar();
		primeiro.covid();
		

	}

}
