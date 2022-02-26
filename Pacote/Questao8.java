package Pacote;

import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) {
		float fabrica, distri, impost, consu;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Custo de fábrica do carro: ");
		fabrica = ler.nextFloat();
		
		distri = (float)(fabrica * 0.28);
		impost = (float)(fabrica * 0.45);
		
		consu = fabrica + distri + impost;
		
		System.out.print("Custo ao consumidor: " + consu);

	}

}
