package Pacote;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		float n1,n2,n3,media;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite as 3 notas.\nNota 1: ");
		n1 = ler.nextFloat() * 2;
		
		System.out.print("Nota 2: ");
		n2 = ler.nextFloat() * 3;
		
		System.out.print("Nota 3: ");
		n3 = ler.nextFloat() * 5;
		
		media =  (n1 + n2 + n3) / (2 + 3 + 5);
		
		System.out.println("\nMédia: " + media);
	}

}
