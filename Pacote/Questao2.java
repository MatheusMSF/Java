package Pacote;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		int diasTotal, dias, meses, anos;
			
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite sua idade em dias: ");
		diasTotal = ler.nextInt();
		
		anos = diasTotal / 365;
		
		meses = diasTotal % 365 / 30;
				
		dias = diasTotal % 365 - meses * 30;
		
		System.out.println("\nAnos: " + anos +
						   "\nMeses: " + meses +
						   "\nDias: " + dias);
	}

}
