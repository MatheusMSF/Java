package Polimorfismo;

public class Animal implements TodoAnimal{
	private String nome;
	private int idade;
	
	public Animal(String nome, int idade) 
	{
		this.nome = nome;
		this.idade = idade;
	}
	
	public String som()
	{
		return "Som indefinido";
	}
	public String acao() 
	{
		return "A��o indefinida";
	}
	
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}	
}
