package com.loiane.curso.java.aula16;

public class LoopWhile {

	public static void main(String[] args) {
		
		int i = 1;
		
		int max = 10;
		
		System.out.println("Contando até " + max);
		
		while (i <= max) {
			System.out.println("Valor de i: " + i);
			++i; // mesma coisa que i = i + 1; ou i =+ 1;
		}
		
		System.out.println(i); // i agora é 11
		
		do {
			i++;
			System.out.println("O valor de i é igual a: " + i);
		} while (i < 11);  // faz parar em 15
		
		System.out.println(i);
	}

}
