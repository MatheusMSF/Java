package IntroducaoPOO;

public class POOQuestao6 {
	String nome;
	String senha;
	String cpf;
	String rg;
	double saldo;
	
	
	public POOQuestao6(String nomeCli, String senhaCli,
			String cpfCli, String rgCli) 
	{
		this.nome = nomeCli;
		this.senha = senhaCli;
		this.cpf = cpfCli;
		this.rg = rgCli;

	}
	
	public void depositar(int x) 
	{
		this.saldo +=  x;
		
		System.out.println("Salto atual: " + saldo);
	}
	public void sacar(int x) 
	{	
		if(saldo < x) 
		{
			System.out.println("Sem saldo suficiente!!!");
		}
		else 
		{	
			this.saldo -= x;
			System.out.println("Saldo atual: " + saldo);
		}
			
	}
	
	public void saldo() 
	{
		System.out.println("Seu saldo: " + saldo);
	}
	
	public void info() 
	{	
		
		System.out.println("Nome: " + this.nome +
				"\nSenha: " + this.senha + 
				"\nCPF: " + this.cpf +
				"\nRg: " + this.rg +
				"\nSaldo: " + this.saldo);
	}

}
