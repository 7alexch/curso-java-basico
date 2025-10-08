package com.loiane.curso.java.aula15;

import java.util.Scanner;

public class usandoSwitchCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana de 1 a 7: ");
		int dia = scan.nextInt();
		
		if (dia == 1) {
			System.out.println("É um Domingo.");
		}
		else if (dia == 2) {
			System.out.println("É uma Segunda-feira");
			
		}
		else if (dia == 3) {
			System.out.println("É uma Terça-feira");
			
		}
		else if (dia == 4) {
			System.out.println("É uma Quarta-feira");
			
		}
		else if (dia == 5) {
			System.out.println("É uma Quinta-feira");
			
		}
		else if (dia == 6) {
			System.out.println("É uma Sexta-feira");
			
		}
		else if(dia == 7) {
			System.out.println("É um Sábado");
			
		}
		else {
			System.out.println("não é um dia da semana.");
			
		}
		
		/*funciona como fosse um if else, if seria "switch", else if seria "case", e else seria "default", ou seja
		 caso não seja nenhuma daquelas, é default.
		 
		*/
		switch(dia){
			case 1: System.out.println("É um Domingo."); break; // break serve para parar se for o caso escolhido
			case 2: System.out.println("É uma Segunda."); break;
			case 3: System.out.println("É uma Terça."); break;
			case 4: System.out.println("É uma Quarta."); break;
			case 5: System.out.println("É uma Quinta."); break;
			case 6: System.out.println("É uma Sexta."); break;
			case 7: System.out.println("É um Sábado."); break;
			default: System.out.println("Não é um dia da semana.");
		}
		
		

	}

}
