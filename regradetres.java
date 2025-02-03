package aula1; 

import java.util.Scanner;

public class regradetres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double y, z, c, regradetres;
		System.out.print("Adicione o primeiro número: ");
		c = sc.nextDouble();
		System.out.print("Adicione o segundo número: ");
		y = sc.nextDouble();
		System.out.print("Adicione o terceiro número: ");
		z = sc.nextDouble();
		regradetres = (c * z / y);
		System.out.println("O resultado da regra de três é: " + regradetres);
		sc.close();
		
	}

}

