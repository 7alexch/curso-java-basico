package com.loiane.curso.java.aula18;

import java.util.Scanner;

public class BreankAndContinue02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int num01 = scan.nextInt();
		
		System.out.println("Digite um limite:");
		int limit01 = scan.nextInt();
		
		for (int i = num01 ; i <= limit01 ; i++) {
			
			System.out.println(i);
			
			if (i % 7 == 0) {
				System.out.println("O valor de i é: " + i);
				break; // vai parar quando achar algum múltiplo de 7.
			}
			scan.close();
		}

	}

}
