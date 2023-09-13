package exercicios_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_7 {

	public static void main(String[] args) {
		
		// Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas 
		// de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o 
		// ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
		
		// Se o ponto estiver na origem, escreva a mensagem “Origem”.
		
		// Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a 
		// situação.

		Locale.setDefault(Locale.US);
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		double x = leitura.nextDouble();
		
		System.out.print("Digite o segundo valor: ");
		double y = leitura.nextDouble();
		
		if (x == 0.0 && y == 0.0) {
			System.out.println("A coordenada se encontra na origem!");
		} else if (x == 0) {
			System.out.println("A coordenada está sobre o eixo Y");
		} else if (y == 0) {
			System.out.println("A coordenada está sobre o eixo X");
		} else if (x > 0.0 && y > 0.0) {
			System.out.println("A coordenada se encontra no Q1 (Quadrante 1)");
		} else if (x < 0.0 && y > 0.0) {
			System.out.println("A coordenada se encontra no Q2 (Quadrante 2)");
		} else if (x < 0.0 && y < 0.0) {
			System.out.println("A coordenada se encontra no Q3 (Quadrante 3)");
		} else {
			System.out.println("A coordenada se encontra no Q4 (Quadrante 4)");
		}
	}

}
