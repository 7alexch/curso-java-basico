package com.loiane.curso.java.aula14;

import java.util.Scanner;

public class ifComprasMercado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// valor <= 10 = barato 
		// 10 < valor < 15 = pedir desconto
		// valor >= 15 = caro
		
		System.out.println("Digite o valor do produto:");
		double valor = scan.nextDouble();
		
		if (valor <= 10) {
			System.out.println("Está barato.");
		}
		else if (valor == 11) {
			System.out.println("Está no preço");
		}
		
		else if (valor > 12 && valor < 15 ) {
			System.out.println("Peça desconto.");
		}
		
		else if (valor > 15) {
			System.out.println("Muito caro.");
		}
	}

}
