package aula1;

import java.util.Scanner;

public class porcentagem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x, y, porcentagem;
		System.out.print("Digite o número desejado: ");
		x = sc.nextDouble();
		System.out.print("Digite a sua porcentagem: ");
		y = sc.nextDouble();
		porcentagem = (x / 100 * y);
		System.out.println("O resultado da subtração é: " + porcentagem);
		sc.close();
	}

}
