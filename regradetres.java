package aula1; 

import java.util.Scanner;

public class regradetres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("[1] para Regra de três diretamente proporcional ( multiplicação cruzada )");
		System.out.println("[2] para Regra de três inversamente proporcional ( multiplicação paralela )");
		double a, b, c, regradetres;
		int calc;
		calc = sc.nextInt();
		if (calc ==1) {
		System.out.print("Adicione o primeiro número: ");
		a = sc.nextDouble();
		System.out.print("Adicione o segundo número: ");
		b = sc.nextDouble();
		System.out.print("Adicione o terceiro número: ");
		c = sc.nextDouble();
		regradetres = (a * c / b);
		System.out.println("O resultado da regra de três é: " + regradetres);
		sc.close();
}
		if (calc ==2) {
		System.out.print("Adicione o primeiro número: ");
		a = sc.nextDouble();
		System.out.print("Adicione o segundo número: ");
		b = sc.nextDouble();
		System.out.print("Adicione o terceiro número: ");
		c = sc.nextDouble();
		regradetres = (b * c / a);
		System.out.println("O resultado da regra de três é: " + regradetres);
		sc.close();
		}
	}
}