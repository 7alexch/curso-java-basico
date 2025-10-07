package com.loiane.curso.java.aula14;

import java.util.Scanner;

public class ifIdade {

	public static void main(String[] arg) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual a sua idade?");
		
		int idade = scan.nextInt();
		
		if (idade >= 18) {
			System.out.println("É maior de idade.");
		}
			
		else {
			System.out.println("É menor de idade.");
		}
	}
}
