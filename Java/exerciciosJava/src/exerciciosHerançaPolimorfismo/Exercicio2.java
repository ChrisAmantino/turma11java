package exerciciosHeran�aPolimorfismo;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Cachorro spitz = new Cachorro();
		Cavalo mangalarga = new Cavalo();
		Preguica preg = new Preguica();
		
		spitz.setNome("Bolinha");
		spitz.setIdade(5);
		System.out.println("Meu cachorro chama " + spitz.getNome() + ", ele tem " + spitz.getIdade() + " anos de idade! E gosta muito de se comunicar, veja s�: " + spitz.emitirSom());
		
		mangalarga.setNome("Pegasus");
		mangalarga.setIdade(7);
		System.out.println("Meu cavalo chama " + mangalarga.getNome() + ", ele tem " + mangalarga.getIdade() + " anos de idade! E gosta muito de se comunicar, veja s�: " + mangalarga.emitirSom());
		
		preg.setNome("Chris");
		preg.setIdade(16);
		System.out.println("Essa � a pregui�a do zoologico, o nome dela � " + preg.getNome() + ", tem " + preg.getIdade() + " anos, e faz um som muito estranho, ou�am: " + preg.emitirSom());
		
		System.out.println(spitz.movimentar() + " " + mangalarga.movimentar() + " " + preg.movimentar());
	}
	
		
		
}
