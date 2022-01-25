package vetores;

import java.util.Scanner;

public class VetoresPrimitivos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor para entrar de n: ");
		int n = sc.nextInt();

		Double[] vect = new Double[n];
		Double sum = 0.0;

		for (int i = 0; i < n; i++) {
			System.out.println("Digite o valor da altura para entrar no vetor: ");
			vect[i] = sc.nextDouble();
			sum += vect[i];

		}

		Double avg = sum / n;
		System.out.printf("Media de altura: %.2f%n: ", avg);

		sc.close();
	}
}
//{}