package base;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello World");
		
		String izena;
		
		System.out.println("Zein da zure izena");
		izena=sc.next();
		System.out.println(izena);
		sc.close();
		
	}

}
