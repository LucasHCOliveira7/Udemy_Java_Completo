package exercicios_estrutura_condicional;

import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {
		
		// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

		Scanner sc = new Scanner(System.in);
		
		int num;
		
		num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NÃO NEGATIVO");
		}
			
		sc.close();
		
	}

}
