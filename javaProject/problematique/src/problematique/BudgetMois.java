package problematique;

import java.util.Scanner;

public class BudgetMois {
	static Scanner clavier = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Combien avez-vous reçu d'argent (MAD) ?");
		int montant=clavier.nextInt();
		if(montant!=0) {
			
			double cafe=10,crp=10,trame=8,part =montant/4;
			double fourniture=(montant/4)*3;
			int nCafe=(int)((part/3)/cafe);
			int nCrp=(int)((part/3)/crp);
			int nTrame=(int)((part/3)/trame);
			
			double moduleCafe=(part/3) % cafe;
			double moduleCrp=(part/3) % crp;
			double moduleTrame=(part/3) % trame;
			int bookFleur=(int)(moduleCafe+moduleCrp+moduleTrame);
			
			
			
			System.out.println("ton argent pour la fourniture est "+fourniture+" MAD/");
			System.out.println("Vous avez l'argent de "+nCafe+" cafe.");
			System.out.println("Vous avez l'argent de "+nCrp+" carte recharge prépayer.");
			System.out.println("Vous avez l'argent de "+nTrame+" Billets de trame.");
			System.out.println(" vous un montant de "+bookFleur+" MAD pour le book Fleur ");
			
			
		}
		
	}

}
