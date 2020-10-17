package exerciciosHerançaPolimorfismo;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Cachorro spitz = new Cachorro();
		Cavalo mangalarga = new Cavalo();
		Preguica preg = new Preguica();
		
		spitz.setNome("Bolinha");
		spitz.setIdade(5);
		System.out.println("Meu cachorro chama " + spitz.getNome() + ", ele tem " + spitz.getIdade() + " anos de idade! E gosta muito de se comunicar, veja só: " + spitz.emitirSom());
		
		mangalarga.setNome("Pegasus");
		mangalarga.setIdade(7);
		System.out.println("Meu cavalo chama " + mangalarga.getNome() + ", ele tem " + mangalarga.getIdade() + " anos de idade! E gosta muito de se comunicar, veja só: " + mangalarga.emitirSom());
		
		preg.setNome("Chris");
		preg.setIdade(16);
		System.out.println("Essa é a preguiça do zoologico, o nome dela é " + preg.getNome() + ", tem " + preg.getIdade() + " anos, e faz um som muito estranho, ouçam: " + preg.emitirSom());
		
		System.out.println(spitz.movimentar() + " " + mangalarga.movimentar() + " " + preg.movimentar());
	}
	
		
		
}
