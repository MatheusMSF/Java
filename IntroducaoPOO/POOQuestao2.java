package IntroducaoPOO;

public class POOQuestao2 {
	String comprimento;
	String altura;
	String cor;
	String empresa;
	int capacidadePassa;
	int qntPassa;
	int velocidadeMax;
	int velocidadeAtual;
	boolean voando;	
	
	public POOQuestao2(String compriAvi,String altAvi, String corAvi, 
			String empresaAvi,int capPassa, int velMax) 
	{
		this.comprimento = compriAvi;
		this.altura = altAvi;
		this.cor = corAvi;
		this.empresa = empresaAvi;
		this.capacidadePassa = capPassa;
		this.qntPassa = 0;
		this.velocidadeMax = velMax;
		this.velocidadeAtual = 0;
		this.voando = false;
	}
	
	public void aumentarVel(int x) 
	{
		this.velocidadeAtual +=  x;
	}
	public void diminuirVel(int x) 
	{
		this.velocidadeAtual -= x;
	}
	
	public void voando(int passageiros) 
	{
		this.voando = true;
		this.qntPassa = passageiros;
	}
	
	public void chao() 
	{
		this.voando = false;
	}
	
	public void estado() 
	{	
		
		System.out.println("Empresa: " + this.empresa +
				"\nEm voo: " + this.voando + 
				"\nComprimento: " + this.comprimento +
				"\nAltura: " + this.altura +
				"\nCor: " + this.cor +
				"\nQuantidade de passageiros: " + this.qntPassa +
				"\nCapacidade m?xima de passageiros: " + this.capacidadePassa +
				"\nVelocidade Atual: " + this.velocidadeAtual + 
				" km/h\nVelocidade m?xima: " + this.velocidadeMax + " km/h");
	}

}
