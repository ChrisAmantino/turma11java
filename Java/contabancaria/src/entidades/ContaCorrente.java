package entidades;

public class ContaCorrente extends ContaBancaria {
	private int talonario;

	public int getTalonario() {
		return talonario;
	}

	public void setTalonario(int talonario) {
		this.talonario = talonario;
	}
	
	
	public void emiteTalonario()
	{	
		char opc ='S';
		do {
		System.out.println("Deseja emitir um novo Talonário?");
		opc = leia.next().toUpperCase().charAt(0);
		if (opc == 'S')
		{
		int numTalonario = this.talonario;
		this.talonario = numTalonario + 1;
		System.out.println("Novo talonário N° " + numTalonario);
		linha();
		}
		} while (opc == 'S');
	}
	
}
