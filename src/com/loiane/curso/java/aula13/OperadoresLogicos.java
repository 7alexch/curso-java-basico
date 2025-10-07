package com.loiane.curso.java.aula13;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		int valor1 = 1;
		int valor2 = 2;
		
		// valor1 é 1 E valor2 é 2. = true, os dois estão corretos.
		boolean resultado1 = (valor1 == 1) && (valor2 == 2);
		
		System.out.println("valor1 é 1 AND valor2 é 2 - resultado" + resultado1);
		
		// valor1 é 1 OU valor2 é 2. = true, pelo menos um dos dois tinham que estar com os valor corretos.
		
		boolean resultado2 = (valor1 == 1) || (valor2 == 2);
		
		System.out.println("valor1 é 1 OR valor2 é 2 - resultado" + resultado2);
		
		// brincando com operadores logicos
		
		boolean verdadeiro = true;
		boolean falso = false;
		
		System.out.println(verdadeiro & falso); // falso, pois os dois valores teriam que ser verdadeiros
		System.out.println(verdadeiro || falso); // true, pois pelo menos um dos dois tem que ser verdadeiro
		System.out.println(verdadeiro ^ falso); // true, pois a unica forma de dar falso seria os dois valores iguais
		System.out.println(verdadeiro && falso);// falso pois os dois deveriam ser verdadeiros
		
	}

}
