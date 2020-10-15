package aula17;

public class ListaClasseExercicio6 {

	public static void main(String[] args) {
		ContaBancaria minhaconta = new ContaBancaria();
		
		minhaconta.titular = "Christian";
		minhaconta.saldo = 1200;
		
		System.out.println("Titular da conta: " + minhaconta.titular);
		minhaconta.sacar(500);
		
		minhaconta.depositar(1200);

	}

}
