package com.loiane.curso.java.aula20;

public class ArraysMultidimensionais {

	public static void main(String[] args) {
	/* MATRIZ
		ARRAY = LISTA DE N ELEMENTOS
		MATRIZ = TABELA DE N x M ELEMENTOS (COMO  UMA TABELA)
		MATRIZ == ARRAY DE ARRAYS
		 *
	*/
		
		// criando
									   // linhas x colunas
		double [][] notasAlunos = new double [30][4];
		
		notasAlunos[0][0] = 7;
		notasAlunos[0][1] = 2;
		notasAlunos[0][2] = 3;
		notasAlunos[0][3] = 8;
		
		notasAlunos[1][0] = 10;
		notasAlunos[1][1] = 8.5;
		notasAlunos[1][2] = 9.5;
		notasAlunos[1][3] = 10;
		
		notasAlunos[2][0] = 5;
		notasAlunos[2][1] = 4;
		notasAlunos[2][2] = 4.5;
		notasAlunos[2][3] = 5.5;
		
		notasAlunos[3][0] = 8 ;
		notasAlunos[3][1] = 7.5;
		notasAlunos[3][2] = 8.5;
		notasAlunos[3][3] = 10;
		
		for (int i = 0; i < notasAlunos.length; i++) {
		    for (int j = 0; j < notasAlunos[i].length; j++) {
		        System.out.print(notasAlunos[i][j] + " ");
		    }
		    System.out.println();
		}

	}

}
