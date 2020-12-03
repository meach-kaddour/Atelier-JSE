package variable2;

import java.util.Scanner;

public class question2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double TTC, Remise = 0, TVA = 0;
		System.out.println("Tapez le prix HT");
		int HT = input.nextInt();
		
		if (HT>1000) {
			Remise = HT * 0.1;
			TVA = (HT - Remise) * 0.2;
			TTC = (HT - Remise) + TVA;
			System.out.println("le montant de remise est "+Remise+" MAD");
			System.out.println("le montantant de TVA "+TVA+" MAD");
			System.out.println("le montant TTC avec Remise "+TTC+" MAD");
		}
		else {
			TVA = HT * 0.2;
			TTC = HT+ TVA;
			System.out.println("Désoli vous n'avez pas le remise");
			System.out.println("le montantant de TVA "+TVA+" MAD");
			System.out.println("le montant TTC est "+TTC+" MAD");
			
		}

	}
}
