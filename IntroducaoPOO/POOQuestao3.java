package IntroducaoPOO;

public class POOQuestao3 {
	String distancia;
	String cor;
	String tipo;
	String equipamento;
	int volumeMax;
	int volumeAtual;
	boolean conectado;	
	
	public POOQuestao3(String equi,String corEqui, String tipoEqui, 
			String distEqui,int volMax) 
	{
		this.equipamento = equi;
		this.cor = corEqui;
		this.tipo = tipoEqui;
		this.distancia = distEqui;
		this.volumeMax = volMax;
		this.volumeAtual = 0;
		this.conectado = false;
		
	}
	
	public void conectado() 
	{
		this.conectado = true;
	}
	
	public void desconectado() 
	{
		this.conectado = false;
	}
	
	public void aumentarVol(int x) 
	{
		this.volumeAtual +=  x;
	}
	public void diminuirVol(int x) 
	{
		this.volumeAtual -= x;
	}
	
	public void status() 
	{	
		
		System.out.println("Equipamento: " + this.equipamento +
				"\nConectado: " + this.conectado + 
				"\nTipo: " + this.tipo +
				"\nCor: " + this.cor +
				"\nDistância com sinal: " + this.distancia +
				"\nVolume máximo: " + this.volumeMax +
				"\nVolume atual: " + this.volumeAtual);
	}
}
