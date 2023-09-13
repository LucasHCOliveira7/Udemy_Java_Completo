package exercicios_estrutura_condicional;

import java.util.Scanner;

public class exercicio_6 {

	public static void main(String[] args) {
		
		// Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos 
		// seguintes intervalos ([0,25], [26,50], [50,75], [75,100]) este valor se encontra. Obviamente se o valor não estiver em 
	    // nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Digite um valor qualquer: ");
		int valor = leitura.nextInt();

		if (valor >= 0 && valor <= 25 ) {
			System.out.println("O valor digitado se encontra no intervalor [0, 25]");
		} else if (valor >= 26 && valor <= 50) {
			System.out.println("O valor digitado se encontra no intervalo [26, 50]");
		} else if (valor >= 51 && valor <= 75) {
			System.out.println("O valor digitado se encontra no intervalo [51, 75]");
		} else if (valor >= 76 && valor <= 100) {
			System.out.println("O valor digitado se encongtra no intervalo [76, 100]");
		} else {
			System.out.println("Fora de intervalo!");
		}
	}
}
