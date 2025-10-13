package com.loiane.curso.java.aula19;

public class Exercicios01 {

	public static void main(String[] args) {
		
		int[] A = new int[5];
		
		A[0] = 1;
		A[1] = 2;
		A[2] = 3;
		A[3] = 4;
		A[4] = 5;
		
		int[] B = A.clone(); // cria um vetor B com os mesmos moldes de A.

		
		
		System.out.println("O último índice de A é: " + A[4] + " e o terceiro índice de B é: " + B[2]);
		// criando um loop para mostra o número o indice desde zero (i + 1) e dobrando os valores por 2.S
		for(int i = 0; i < A.length; i++) {
			A[i] *= 2;// multiplica os valores dos indices por 2
			System.out.println("O valor do índice " + (i+1) + " é igual a: " + A[i]);
		}

	}
	
}
