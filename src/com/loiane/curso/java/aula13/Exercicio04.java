package com.loiane.curso.java.aula13;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual foi a nota do primeiro bimestre?");
		byte notabim01 = scan.nextByte();
		System.out.println("Qual foi a nota do segundo bimestre?");
		byte notabim02 = scan.nextByte();
		System.out.println("Qual foi a nota do terceiro bimestre?");
		byte notabim03 = scan.nextByte();
		System.out.println("Qual foi a nota do quarto bimestre?");
		byte notabim04 = scan.nextByte();
		
		int mediaAnual = (notabim01 + notabim02 + notabim03 + notabim04) / 4; 
		
		System.out.println("Sua média anual foi: " + mediaAnual);		
	}

}
