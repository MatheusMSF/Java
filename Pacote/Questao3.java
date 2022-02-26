package Pacote;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		int segTotal, seg, min, horas;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o tempo do envento em segundos: ");
		segTotal = ler.nextInt();
		
		horas = segTotal / 3600;
		
		min = segTotal % 3600 / 60;
		
		seg = segTotal % 3600 % 60;
		
		System.out.println("Tempo em:" +
						   "\nHoras: " + horas +
						   "\nMinutos: " + min +
						   "\nSegundos: " + seg);
	}	

}
