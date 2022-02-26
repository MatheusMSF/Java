package Pacote;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		int a,b,c,d,r,s;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Escreva 3 números inteiros e positivos\nPrimeiro Número: ");
		a = ler.nextInt();
		
		System.out.print("Segundo Número: ");
		b = ler.nextInt();
		
		System.out.print("Terceiro Número: ");
		c = ler.nextInt();
		
		if(a > 0 && b > 0 && c > 0) 
		{
			r = (int)Math.pow((a + b), 2);
			
			s = (int)Math.pow((b + c), 2);
			
			d = (r + s) / 2;
			
			System.out.print("Resultado da equação: " + d);
		}
		else 
		{
			System.out.print("Tem que ser números inteiros e positivos :/");
		}
		
		
	}

}
