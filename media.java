package aula1;

import java.util.Scanner;

//é importante que o scanner seja importado antes

public class media{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// O Scanner faz uma entrada de dados

		double x, y, media;
		System.out.print("Digite o primeiro numero: ");
		x = sc.nextDouble();
		System.out.print("Digite o segundo numero: ");
		y = sc.nextDouble();
		media = (x + y) / 2.0;
		System.out.println("O resultado da média é: " + media);
		sc.close();
	}

}