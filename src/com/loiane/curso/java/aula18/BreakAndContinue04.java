package com.loiane.curso.java.aula18;

import java.util.Scanner;

public class BreakAndContinue04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int num01 = scan.nextInt();
		
		System.out.println("Digite um limite:");
		int limit01 = scan.nextInt();
		
		for (int i = num01 ; i <= limit01 ; i++) {
			
			if (i % 7 == 0) {
				continue; // vai ignorar todos os múltiplos de 7.
			}
		
			System.out.println("O valor de I é igual a: " + i );
		}

	}

}