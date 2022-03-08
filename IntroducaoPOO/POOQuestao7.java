package IntroducaoPOO;

public class POOQuestao7 {
	String nomeCompleto;
	String cpf;
	String sintomas;
	String diagnostico;
	boolean internacao;
	
	public POOQuestao7(String nome, String cpfPessoa) 
	{
		this.nomeCompleto = nome;
		this.cpf = cpfPessoa;
		this.sintomas = "";
		this.diagnostico = "";
		this.internacao = false;
	}
	
	public void sintomas(String sint) 
	{
		this.sintomas = sint;
	}
	public void diagnostico(String diag) 
	{
		this.diagnostico = diag;
	}
	
	public void internacao(boolean inter) 
	{
		this.internacao = inter;
	}
	
	public void statusPac() 
	{
		System.out.println("Nome do paciente: " + this.nomeCompleto +
				"\nCPF: " + this.cpf + 
				"\nSintomas: " + this.sintomas +
				"\nDiagnostico: " + this.diagnostico +
				"\nInternação: " + this.internacao);
	}
}
