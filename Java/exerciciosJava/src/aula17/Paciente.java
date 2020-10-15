package aula17;

public class Paciente {
	public String nome;
	public String sobrenome;
	public boolean sintoma;
	public boolean tosse;
	
	
	public void nomeCompleto()
	{
		System.out.println("Nome do Paciente: " + this.nome + " " + this.sobrenome);
	}
	public void tratar()
	{
		if(this.sintoma == true)
		{
			System.out.println("O paciente precisa de tratamento");
		} else {
			System.out.println("O paciente precisa de repouso");
		}
	}
	public void covid()
	{
	if (this.tosse == true)
	{
		System.out.println("O paciente tem sintomas de Covid! Isole-o imediatamente!");
	} else {
		System.out.println("Os sintomas não indicam Covid, porém o paciente deve ficar em observação!");
	}
	}
}

