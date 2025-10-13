package com.loiane.curso.java.aula20;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int [][] numerosAleatorios = new int[4][4];
		
		random numeroRandom = new random ();
		
		for (int i = 0; i< numerosAleatorios.length; i++) {
			for(int j=0;j<numerosAleatorios[i].length; j++) {
			
				numerosAleatorios[i][j] = numeroRandom.nextInt();
	
			}
		}

	}

}
