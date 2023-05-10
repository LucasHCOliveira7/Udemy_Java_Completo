package variaveis;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Variável do tipo básico");
		int y = 32;
		System.out.println("Y = " + y);
		
		// println vazio é usado para deixar linha em branco no console
		System.out.println("");
		
		System.out.println("Variável do tipo ponto flutuante");
		double x = 10.35784;
		System.out.println("X = " + x);
		System.out.printf("X = %.2f%n", x);
		
		// Locale é usado para configurar a localidade do programa
		Locale.setDefault(Locale.US);
		System.out.printf("X = %.2f%n", x);
		
		System.out.println("");
		
		System.out.println("Contatenar vários elementos");
		System.out.println("Resultado = " + x + " metros");
		
		System.out.println("");
		
		System.out.println("Contatenar vários elementos (regra para 'printf')");
		System.out.printf("Resultado = %.2f metros%n", x);
		
		System.out.println("");
		
		/*
		%f = ponto flutuante
		%d = inteiro
		%s = texto
		%n = quebra de linha
		*/
		
		String nome = "Lucas";
		int idade = 21;
		double renda = 2000.0;
		System.out.printf("%s tem %d ano de idade e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
