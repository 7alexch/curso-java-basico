 package com.loiane.curso.java.aula16;

public class LoopFor {

	public static void main(String[] args) {
	
	// inicialização / expressão booleana / atualização  | vai contar 5 vezes a partir de 0, exceto se eu por "<="
		for (int i = 0; i < 5; i++) {
			
			System.out.println("O valor de i é: " + i);
			
		}
		for (int i = 5; i > 0; i--) {
			
			System.out.println("O valor de i é: " + i);
			
		} 
		
		for (int i = 0, j = 10; i < j ; i++, j--) {
			
			System.out.println("i: " + i + "; j:" + j);
			
		}
		
		
		int i = 0;
		
		for (; i <= 5;) {
			System.out.println("O valor de i é igual a: " + i);
			i++;
		
		}
		
		int count = 0;
		
		for ( ; count < 1000; ) {
			System.out.println("O valor de count é igual a: " + count);
			count += 2;
		}
		
		System.out.println("O valor de count é: " + count);
		
		
		
		/* vai fazer soma começar do zero e i com 1, adicionar + 1 em i,
		 e adicionar o valor de i em soma enquanto i for menor que 5 */
		int soma = 0;
		for (int j = 1; j < 5 ; soma += j++) {
			System.out.println("O valor da soma é " + soma);
			System.out.println("O valor de i é " + j);
		}
	
	}
}

