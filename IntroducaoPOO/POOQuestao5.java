package IntroducaoPOO;

public class POOQuestao5 {
	String cor;
	String altura;
	String comprimento;
	int pesoSuportado;
	int velocidadeAtual;
	boolean eletrico;
	
	public POOQuestao5(String corPat,String altPat, String comPat, 
			int pesoPat, boolean elePat) 
	{
		this.cor = corPat;
		this.altura = altPat;
		this.comprimento = comPat;
		this.pesoSuportado = pesoPat;
		this.velocidadeAtual = 0;
		this.eletrico = elePat;
	}
	
	public void aumentarVel(int x) 
	{
		this.velocidadeAtual +=  x;
	}
	public void diminuirVel(int x) 
	{
		this.velocidadeAtual -= x;
	}
	
	public void status() 
	{	
		
		System.out.println("Cor: " + this.cor +
				"\nAltura: " + this.altura + 
				"\nComprimento: " + this.comprimento +
				"\nSuporta até: " + this.pesoSuportado +
				" quilos\nVelocidade atual: " + this.velocidadeAtual +
				" km/h\nPatinete elétrico: " + this.eletrico);
	}
}
