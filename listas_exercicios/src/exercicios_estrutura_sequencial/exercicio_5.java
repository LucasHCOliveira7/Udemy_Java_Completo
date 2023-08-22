package exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_5 {

	public static void main(String[] args) {
		
		// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
		// código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int peca1;
		int peca2;
		int quant1;
		int quant2;
		double valor1;
		double valor2;
		double total;

		peca1 = sc.nextInt();
		quant1 = sc.nextInt();
		valor1 = sc.nextDouble();
		
		peca2 = sc.nextInt();
		quant2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		total = (valor1 * quant1) + (valor2 * quant2);
		
		System.out.printf("TOTAL A PAGAR = R$ %.2f%n", total);
		
		sc.close();
		
	}

}
