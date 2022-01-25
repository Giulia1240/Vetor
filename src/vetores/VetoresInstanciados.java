package vetores;

import java.util.Locale;
import java.util.Scanner;

import vetores.entities.Product;

public class VetoresInstanciados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);
		System.out.println("Digite o valor para N: ");
		int n = sc.nextInt();
		Product[] vect = new Product[n];

		Double sum = 0.0;

		for (int i = 0; i < vect.length; i++) {

			System.out.println("Digite o valor o nome  para entrar no vetor: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.println("Digite o valor o preço  para entrar no vetor: ");
			Double price = sc.nextDouble();

			vect[i] = new Product(name, price);
			sum += vect[i].getPrice();

		}

		Double avg = sum / vect.length;
		System.out.printf("Media valor preço: %.2f%n: ", avg);

		sc.close();
	}
}
