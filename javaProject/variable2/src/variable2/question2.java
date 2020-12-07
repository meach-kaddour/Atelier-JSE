package variable2;

import java.util.Scanner;

public class question2 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		double TTC, Remise, TVA;
	
		System.out.println("Tapez le prix HT");
		int HT = input.nextInt();

		if (HT >= 200) {
			System.out.println("vous voulez du remise");
			 String reponse = input.next();

			if (reponse.equalsIgnoreCase("oui")) {

				Remise = (int)(HT * 0.1);
				TVA = (int)((HT - Remise) * 0.2);
				TTC = (int)((HT - Remise) + TVA);
				System.out.println("le montant de remise est " + Remise + " MAD");
				System.out.println("le montantant de TVA " + TVA + " MAD");
				System.out.println("le montant TTC avec Remise " + TTC + " MAD");
			}
			if (reponse.equalsIgnoreCase("non")) {
				TVA = HT * 0.2;
				TTC = HT + TVA;

				System.out.println("le montantant de TVA " + TVA + " MAD");
				System.out.println("le montant TTC est " + TTC + " MAD");

			}
		}

	}
}
