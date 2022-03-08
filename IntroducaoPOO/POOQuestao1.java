package IntroducaoPOO;

public class POOQuestao1 {
	String nomeCompleto;
	String cpf;
	double pontos;
	double gastoTotal;
	String estadoAtual;
	
	public POOQuestao1(String nome, String cpfPessoa) 
	{
		this.nomeCompleto = nome;
		this.cpf = cpfPessoa;
		this.pontos = 0;
		this.gastoTotal = 0;
		this.estadoAtual = "Fora da loja";
	}
	
	public void entrar() 
	{
		this.estadoAtual = "Dentro da loja";
	}
	public void sair() 
	{
		this.estadoAtual = "Fora da loja";
	}
	
	public void comprando() 
	{
		if(this.estadoAtual == "Dentro da loja") 
		{
			System.out.println("Comprando...");
		}
		else 
		{
			System.out.println("O cliente não está dentro da loja.");
		}
	}
	
	public void pagar(double x) 
	{
		this.gastoTotal = gastoTotal + x;
		this.pontos = pontos + x / 1000;
	}
	
	
	
}
