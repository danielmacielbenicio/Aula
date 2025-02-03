package aula1;

import java.util.Scanner;

public class soma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x, y, soma;
		System.out.print("Digite o primeiro número: ");
		x = sc.nextDouble();
		System.out.print("Digite o segundo número: ");
		y = sc.nextDouble();
		soma = (x + y);
		System.out.println("O resultado da soma é:" + soma);
		sc.close();
	}

}
