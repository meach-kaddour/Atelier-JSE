package variable;

import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Entrer votre nom:");
		String name = input.nextLine();
		if (name != "") {
			System.out.println("Bonjour," + name + "!");

		}
		System.out.println("FIN ! ");

	}

}
