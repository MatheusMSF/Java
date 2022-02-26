package Pacote;

import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
		int a,b,c,d,e,f,x,y;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite os valores do sistema: "
				+ "\nax + by = c"
				+ "\ndx + ey = f"
				+ "\na: ");
		
		a = ler.nextInt();
		
		System.out.print("b: ");
		b = ler.nextInt();
		
		System.out.print("c: ");
		c = ler.nextInt();
		
		System.out.print("d: ");
		d = ler.nextInt();
		
		System.out.print("e: ");
		e = ler.nextInt();
		
		System.out.print("f: ");
		f = ler.nextInt();
		
		x = (c * e - b * f) / (a * e - b * d);
		y = (a * f - c * d) / (a * e - b * d);
		
		System.out.print("X: " + x + "\nY: " + y);
	}

}
