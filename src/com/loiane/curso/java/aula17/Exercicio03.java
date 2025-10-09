package com.loiane.curso.java.aula17;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean infoValidas = false;
		String nome, sexo, estadoCivil;
		int idade;
		double salario;
		
		do {
			System.out.println("Digite seu nome: ");
			nome = scan.nextLine();
			
				if (nome.length() > 3) {
					infoValidas = true;
				}
				else {
					System.out.println("Digite novamente seu nome: ");
				}
			
		}
		while(!infoValidas);
		
		infoValidas = false;
		
		do {
			System.out.println("Digite sua idade:");
			idade = scan.nextInt();
			
				if (idade > 0 && idade < 150) {
					infoValidas = true;
				}
				else {
					System.out.println("Digite uma idade válida: ");
				}
				
		}
		
		while(!infoValidas);
		
		infoValidas = false;
		
		do {	
			System.out.println("Digite seu salário:");
			salario = scan.nextDouble();
					
						if (salario > 0) {
							infoValidas = true;
						}
						else {
							System.out.println("Digite um salário válido: ");
						}
						
		}
		
		while(!infoValidas);
		
		infoValidas = false;
		
		scan.nextLine(); // limpa o buffer antes de ler sexo
		
		do {
			System.out.println("Digite seu sexo: ");
			sexo = scan.nextLine();
			
						if (sexo.equalsIgnoreCase("m") ||
								sexo.equalsIgnoreCase("f"))
							{
							infoValidas = true;
							}
						else {
							infoValidas = false;
							System.out.println("Digite um sexo válido: ");
						}
		}
		
		while(!infoValidas);
		
		infoValidas = false;
		
		do {
			System.out.println("Qual seu estado civil? ");
			estadoCivil = scan.next();
						if (estadoCivil.equalsIgnoreCase("s") ||
								estadoCivil.equalsIgnoreCase("c") ||
									estadoCivil.equalsIgnoreCase("v") ||
										estadoCivil.equalsIgnoreCase("d")) 
							{
							infoValidas = true;
							}
						else {
							infoValidas = false;
							System.out.println("Digite um estado civil válido: ");
						}
				
		} while(!infoValidas);
		
		System.out.println("Os dados coletados foram: ");
		System.out.println("Nome: " + nome);
	    System.out.println("Idade: " + idade);
	    System.out.println("Salário: " + salario);
	    System.out.println("Sexo: " + sexo);
	    System.out.println("Estado civil: " + estadoCivil);

	        scan.close();
		
	}

}
