package vetores;

import java.util.Locale;

public class Foreach {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		System.out.println("Lista festa 2022 : ");

		String[] vect = new String[] { "Maria, Joao, Jose" };

		for (String obj : vect) {
			System.out.println(obj);
		}
	}
}
