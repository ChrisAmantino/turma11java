package exerciciosHerançaEncapsulamento;

public class Pessoa {
	/*
	 * Cria uma Classe Pessoa, contendo os atributos encapsulados, 
	 * com seus respectivos seletores (getters) e modificadores (setters), 
	 * e ainda o construtor padrão e pelo menos mais duas opções de construtores 
	 * conforme sua percepção. Atributos: String nome; String endereço; String telefone; 
	 */
	
	private String nome;
	private String endereco;
	private String telefone;
	
	public Pessoa() //construtor Padrão
	{
		
	}
	
	public Pessoa(String nome)
	{
		this.nome = nome;
	}
	
	public Pessoa(String nome, String endereco)
	{
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
