package Pacote;

import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		float x1,y1,x2,y2, distancia;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite x1: ");
		x1 = ler.nextFloat();
		
		System.out.print("Digite y1: ");
		y1 = ler.nextFloat();
		
		System.out.print("Digite x2: ");
		x2 = ler.nextFloat();
		
		System.out.print("Digite y2: ");
		y2 = ler.nextFloat();
		 
		distancia = (float)Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		System.out.print("Distância entre os dois pontos: " + distancia);
	}

}
