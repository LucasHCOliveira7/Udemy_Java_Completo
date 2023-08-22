package exercicios_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_4 {

	public static void main(String[] args) {
		
		// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
		// hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
		// decimais.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero_func;
		int horas_trab;
		double salario_hora;
		double salario_func;
		
		numero_func = sc.nextInt();
		horas_trab = sc.nextInt();
		salario_hora = sc.nextDouble();
		
		salario_func = horas_trab * salario_hora;
		
		System.out.println("NUMBER = " + numero_func);
		System.out.printf("SALARY = U$ %.2f%n", salario_func);
		
		sc.close();
		
	}

}
