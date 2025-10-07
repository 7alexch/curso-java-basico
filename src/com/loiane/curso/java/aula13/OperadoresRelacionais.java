package com.loiane.curso.java.aula13;

public class OperadoresRelacionais {

	public static void main(String[] args) {
	
		
		
		
		int var1 = 2;
		int var2 = 2;
		
		/* "==" quer saber se var1 e var2 tem o mesmo valor, por exemplo: 10 == 2 * 5 (10) | 2 == 2 | 4 == 2 * 2
		 */
		
		System.out.println(var1 == var2);
		
		int var3 = 2;
		int var4 = 4;
		
		/* "!=" quer saber se o var3 tem mesmo valor que var4, se for valor diferente vair printar TRUE, 
		caso seja igual, FALSE */
		
		System.out.println(var3 != var4);
		
		/* ">", também conhecido como "maior que", quer saber se var3 é maior que var4, se for maior = true,
		 caso não for= false
		 */
		System.out.println(var3 > var3);
		
		
		/* "<", tambem conhecido como "menor que", quer saber se var3 é menor que var4, se for = true,
		 caso não for = false
		 */
		
		System.out.println(var3 < var4);
	}
}
