package com.loiane.curso.java.aula13;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos metros você quer converter em centímetros? ");
		double metros = scan.nextDouble();
		double centimetros = metros * 100;
		
		System.out.println( metros + " em centímetros é igual a: " + centimetros );

	}

}
