package aula17;

public class Cliente
{
	// eu imagino meu cliente, meus atributos é tudo o que eu imagino que meu objeto tem de informação, no caso, o cliente.
	// metodos é tudo o que o cliente faz ou deveria fazer.
	// método nesse caso é o que eu vou fazer pro cliente.
	// primeiro devo pensar no que é o cliente.
	
	//atributos
	public String nome;
	public char sexo;
	public int anoNascimento;
	public char tipo; //P - premium, N - normal, V - visitante(vem de vez em quando).
	
	//construtores - têm o mesmo nome da classe.
	public Cliente(String nome)
	{
		this.nome = nome; // isso vai obrigar quando eu criar o objeto Cliente deverá passar o nome no ();
	}
	
	public Cliente(String nome, char sexo)
	{
		this.nome = nome;
		this.sexo = sexo;
	}
	
	 public Cliente(String nome, char sexo, int anoNascimento)
	{
		 this.nome = nome;
		 this.sexo = sexo; 
		 this.anoNascimento = anoNascimento;
	}
	 
	 //Metodos
	public int calcIdade()
	{
		return 2020 - anoNascimento;
	}
}
