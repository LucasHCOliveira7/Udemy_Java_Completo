package exercicios_estrutura_sequencial;

import java.util.Scanner;

public class exercicio_3 {

	public static void main(String[] args) {
		
		// Fazer um programa para ler quatro valores inteiros A, B, C e D.
		// A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D
		// segundo a fórmula: DIFERENCA = (A * B - C * D).

		Scanner sc = new Scanner(System.in);
		
		int A;
		int B;
		int C;
		int D;
		int Dif;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		Dif = (A * B - C * D);
		
		System.out.println("DIFERENÇA = " + Dif);
		
		sc.close();
		
	}

}
