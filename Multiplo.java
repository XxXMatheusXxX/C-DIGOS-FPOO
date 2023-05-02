package fu;

import java.util.Scanner;

public class Multiplo {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double multi;

		System.out.print("Informe um valor: ");
		multi = ler.nextDouble();

		if (multi % 5 == 0) {
			System.out.println("O número " + multi + " é múltiplo de 5");
			System.exit(0);

		}System.out.println("O número " + multi + " não é múltiplo de 5");

		ler.close();


	}

}
