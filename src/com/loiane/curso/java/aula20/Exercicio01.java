package com.loiane.curso.java.aula20;

import java.util.Random;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int[][] numerosAleatorios = new int[4][4];
		
		Random numeroRandom = new Random();
		
		for(int i = 0;i<numerosAleatorios.length;i++) {
			for(int j = 0; j<numerosAleatorios[i].length;j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt(100);
			}
		}
		
		int maior = 0;
		int linha = 0;
		int col = 0;
		for(int i = 0;i<numerosAleatorios.length;i++) {
			for(int j = 0; j<numerosAleatorios[i].length;j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt(100);
				if (numerosAleatorios[i][j] > maior) {
					maior = numerosAleatorios[i][j];
					linha = i;
					col = j;
				}
			}
		}
		System.out.println("O maior valor da Matriz é: " + maior);
		System.out.println("Linha: " + linha);
		System.out.println("Coluna: " + col);
		
	}

}
