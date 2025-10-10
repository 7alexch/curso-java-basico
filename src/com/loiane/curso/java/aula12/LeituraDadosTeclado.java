package com.loiane.curso.java.aula12;

//importando scanner para leitura de dados

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		
		// criando um scanner com nome scan

		Scanner scan = new Scanner(System.in);

		// criando uma leitura de dados scanner sobre o primeiro nome
	
		System.out.println("Digite seu nome: ");
		
		String nomePrimeiro = scan.nextLine();
		
		// criando uma leitura de dados scanner sobre o sobrenome
		
		System.out.println("Digite seu sobrenome: ");
		
		String sobreNome = scan.nextLine();
		
		// criando uma leitura de dados scanner sobre a idade, tipo int
		
		System.out.println("Olá, " + nomePrimeiro + "! seja bem-vindo ao sistema." );
		
		System.out.println("Digite a sua idade: ");
		
		int idade = scan.nextInt();
		
		System.out.println("Sua idade é: " + idade );
		
		// criando uma leitura de diversos dados na mesma linha 
		
		System.out.println("Qual seu nome? Qual a sua idade? Quantidade de filhos? Qual a sua altura? Tem pets? ");
		
		String nome = scan.next();
		int idade01 = scan.nextInt();
		int qtdFilhos = scan.nextInt();
		float altura = scan.nextFloat();
		boolean temPets = scan.nextBoolean();
		
		System.out.println("Qual o seu nome completo? " + nome);
		System.out.println("Qual a sua idade? " + idade01);
		System.out.println("Quantos filhos você tem? " + qtdFilhos);
		System.out.println("Qual a sua altura? " + altura);
		System.out.println("Tem pets?" + temPets);
		
	}

}
