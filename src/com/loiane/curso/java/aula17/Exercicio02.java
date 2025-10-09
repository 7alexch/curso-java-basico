package com.loiane.curso.java.aula17;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean infoLogin = false;
		
		do {
			System.out.println("Digite o login: ");
			String login = scan.nextLine();
			
			System.out.println("Digite a sua senha: ");
			String senha = scan.nextLine();
			
			if(login.equalsIgnoreCase(senha)) {
				infoLogin = false;
				System.out.println("Login e senha idênticos. Tente novamente:");
			}
			else {
				infoLogin = true;
				System.out.println("Bem-vindo ao sistema");
			}
		}
		while(!infoLogin);
			

	}

}
