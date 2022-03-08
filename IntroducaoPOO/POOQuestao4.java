package IntroducaoPOO;

public class POOQuestao4 {
	String nomeCompleto;
	String cpf;
	String rg;
	String funcao;
	double salario;
	int horasPorSem;
	String status;	
	
	public POOQuestao4(String nome,String cpfFunc, String rgFunc, 
			String funcaoFunc,double sal, int horas) 
	{
		this.nomeCompleto = nome;
		this.cpf = cpfFunc;
		this.rg = rgFunc;
		this.funcao = funcaoFunc;
		this.salario = sal;
		this.horasPorSem = horas;
		this.status = "Não trabalhando";
		
	}
	
	public void status(String x) 
	{
		this.status = x;
	}
	
	public void statusFunc() 
	{	
		System.out.println("Nome: " + this.nomeCompleto +
				"\nCPF: " + this.cpf + 
				"\nRg: " + this.rg +
				"\nfunção: " + this.funcao +
				"\nSalário: " + this.salario + 
				" Reais\nHoras trabalhadas por semana: " + this.horasPorSem +
				" Horas\nStatus: " + this.status);
	}
}
