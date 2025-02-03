package aula1;

import java.util.Scanner;

public class subtracao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x, y, subtracao;
		System.out.print("Digite o primeiro número: ");
		x = sc.nextDouble();
		System.out.print("Digite o segundo número: ");
		y = sc.nextDouble();
		subtracao = (x - y);
		System.out.println("O resultado da subtração é: " + subtracao);
		sc.close();
	}

}
