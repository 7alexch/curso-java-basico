package com.loiane.curso.java.aula13;

public class Operadores {

	public static void main(String[] args) {
		
		
		// Operações 
		
		// variável com soma 
		
		int resultado = 1 + 2;
		
		System.out.println(resultado);
		
		// diminuindo 1 do resultado da variavel resultado = 3 - 1
		resultado = resultado - 1;
		System.out.println(resultado);
		
		// multiplicando o valor da variável 2 x 2 
		resultado = resultado * 2;
		System.out.println(resultado);
		
		// dividindo o valor da variável 4/2
		resultado = resultado / 2;
		System.out.println(resultado);
		
		// somando o valor da variável 2 + 8
		resultado = resultado + 8;
		System.out.println(resultado);
		
		// resto da divisão da variável 10/7
		resultado = resultado % 7;
		System.out.println(resultado);
		
		//adiciona 1 no valor da variável 3 + 1 = 4
		resultado++;
		System.out.println(resultado);
		
		//subtrai 1 no valor da variável 4 - 1 = 3
		resultado--;
		System.out.println(resultado); 
		
		//Adiciona um antes do resultado, ou seja, 1 + resultado (pré inc)
		System.out.println(++resultado); // retorna valor 4
		
		//Adiciona um após o resultado, ou seja, resultado + 1 (pós inc)
		System.out.println(resultado++); //determina que adiciona + 1, porém só depois que printar novamente 4 + 1
		
		
		System.out.println(resultado); // retorna o valor da operação acima: 4 + 1
		//Mesma coisa
		//System.out.println(resultado);
		//resultado = resultado + 1;
		//resultado += 1; */
		
		//Concatenação de Strings
		
		String primeiroNome = "Esta é";
		String segundoNome = " uma concatenação de strings.";
		String terceiroNome = primeiroNome + segundoNome;
		
		System.out.println(terceiroNome);
	}

}
