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
		
		
		int count = 1000;
		
		System.out.println("O valor de count é: " + count);
		
		do {
			System.out.println("Contando de 1000 até 0: " + count);
			count--;
		}
		
		while(count > 0);
		
		System.out.println(count);
		
	}

}
