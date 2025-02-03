package aula1;

import java.util.Scanner;

public class multiplicacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x, y, multiplicacao;
		System.out.print("Digite o primeiro número: ");
		x = sc.nextDouble();
		System.out.print("Digite o segundo número: ");
		y = sc.nextDouble();
		multiplicacao = (x * y);
		System.out.println("O resultado da multiplicação é: " + multiplicacao);
		sc.close();
	}

}
