package Pacote;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		int dia, mes, ano, diasTotal = 0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite quantos anos de vida: ");
		ano = ler.nextInt();
		
		System.out.print("\nDigite quantos meses de vida: ");
		mes = ler.nextInt();
		
		System.out.print("\nDigite quantos dias de vida: ");
		dia = ler.nextInt();
		
		diasTotal = dia + mes * 30 + ano * 365;
		
		System.out.println("\nTotal de dias vividos: " + diasTotal);
	}

}
