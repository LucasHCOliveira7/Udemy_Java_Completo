package exercicios_estrutura_condicional;

import java.util.Scanner;

public class exercicio_5 {

	public static void main(String[] args) {
		
		// Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A 
		// seguir, calcule e mostre o valor da conta a pagar.
		/*
		 CÓDIGO   ESPECIFICAÇÃO     PREÇO
		 1        Cachorro Quente   R$ 4.00
		 2        X-Salada          R$ 4.50
		 3        X-Bacon           R$ 5.00
		 4        Torrada Simples   R$ 2.00
		 5        Refrigerante      R$ 1.50
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int codigo;
		int quantidade;
		double total;
		
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			total = quantidade * 4.00;
		}
		else if (codigo == 2) {
			total = quantidade * 4.50;
		}
		else if (codigo == 3) {
			total = quantidade * 5.00;
		}
		else if (codigo == 4) {
			total = quantidade * 2.00;
		}
		else {
			total = quantidade * 1.50;
		}
		
		System.out.printf("TOTAL = %.2f%n", total);
		
		sc.close();
		
	}

}
