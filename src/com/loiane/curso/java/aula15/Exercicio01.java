package com.loiane.curso.java.aula15;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual número é o maior? digite o primeiro número:");
		int num01 = scan.nextInt();
		
		System.out.println("Digite o segundo número:");
		int num02 = scan.nextInt();
		
		if (num01 > num02) {
			System.out.println(num01 + " é maior que " + num02);
		}
		else if (num01 < num02) {
			System.out.println(num02 + " é maior que " + num01);
		}
		else if (num01 == num02) {
			System.out.println("Ambos possuem o mesmo valor.");
		}
		
		else {
			System.out.println("Não foi possível fazer a operação.");
		}

	}

}
