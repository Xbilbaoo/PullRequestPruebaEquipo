package base;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		// Aldagaiak
		
		Scanner sc = new Scanner(System.in);
		String izena;
		
		
		
		
		// Programa
		
		System.out.println("Hello World");
		
		System.out.println("Javier Vilvado");
		
		System.out.println("Zein da zure izena?");
		izena=sc.next();
		
		System.out.println(izena);
		sc.close();
	}

}
