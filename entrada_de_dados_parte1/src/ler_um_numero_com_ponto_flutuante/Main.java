package ler_um_numero_com_ponto_flutuante;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x;
		x = sc.nextDouble();
		System.out.printf("Você digitou: %.2f%n", x);
		
		sc.close();

	}

}
