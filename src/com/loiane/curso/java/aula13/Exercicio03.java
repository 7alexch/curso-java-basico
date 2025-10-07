package com.loiane.curso.java.aula13;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escolha o primeiro número:");
		int numero01 = scan.nextInt();
		System.out.println("Escolha o segundo número:");
		int numero02 = scan.nextInt();
		
		int resultado = numero01 + numero02;

		System.out.println("a soma dos número é igual a: " + resultado );
	}

}
