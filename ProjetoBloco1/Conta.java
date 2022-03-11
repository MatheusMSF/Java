package ProjetoBloco1;

public class Conta {
	
	private String cartao;
	private String nome;
	private String senha;
	private String cpf;
	private double saldo = 100.00;
	
	
		
	public String getCartao() {
		return cartao;
	}
	
	public void setCartao(String cartao) {
		this.cartao = cartao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		
			this.senha = senha;
		
	}
	
	public boolean validarSenha()
	{
		if(senha.length() != 4) 
		{
			System.out.println("Senha inv�lida, digite uma senha de 4 d�gitos!");
			return false;
		}else 
		{
			return true;
		}
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		if(cpf.length() == 11) {
			this.cpf = cpf;
		}else {
			System.out.println("CPF inv�lido, digite um CPF de 11 d�gitos!");
		}
		
	}
	public double consultarSaldo() {
		return saldo;
	}
	
	public void adicionarSaldo(double entradaDeDinheiro) {
		this.saldo =  this.saldo+entradaDeDinheiro;
	}
	
	public void debitarSaldo(double saidaDeDinheiro) {
		this.saldo =  this.saldo-saidaDeDinheiro;
	}

	public void verificarCredito() {
		if(saldo>15000) {
			System.out.println("Voc� possui cr�tido dispon�vel, "
					+"contate seu gerente para mais informa��es!");
		}
		
	}
	
	public void cadastrar() 
	{
		
		
	}
	

}