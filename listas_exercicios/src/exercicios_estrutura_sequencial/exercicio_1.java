package exercicios_estrutura_sequencial;

import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {
		
		// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
		// mensagem explicativa.
		
		Scanner sc = new Scanner(System.in);
		
		int A;
		int B;
		int SOMA;
		
		A = sc.nextInt();
		B = sc.nextInt();
		SOMA = A + B;
		
		System.out.println("SOMA = " + SOMA);
		
		sc.close();

	}

}
