package com.loiane.curso.java.aula18;

public class AulaBreakAndContinue {

	public static void main(String[] args) {
		
		 int num = 100;
		 
		 for (int i = 0; i < num; i++) {
			 if (i * i >= num) {
				 break; 
			 }
		
		 System.out.println("Valor de i é igual a: " + i );
		 }
	}

}
