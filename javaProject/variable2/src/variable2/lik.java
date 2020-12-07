package variable2;
import java.util.Scanner;
public class lik {
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.println("le prix de produit (dh):");
		double HT = reader.nextDouble();
		double tva = 0.2;
		if(HT >= 200){
			System.out.println("demande de remise oui ou yes");
			String acRremise = reader.next();
			
			if(acRremise.equals("oui") || acRremise.equals("yes")){
				System.out.println("pourcentage de remise : ");
				double remise = reader.nextDouble();
				
				if(remise >= 1){
					double porRemise = remise / 100;
					double ttc = HT + (HT * tva) - (porRemise*HT);
					System.out.println("TTC =" +ttc );
				}else{
					double ttc = HT + (HT * tva) - (remise*HT);
					System.out.println("TTC =" +ttc );
				}
			}else{
				double ttc = HT + (HT * tva);
				System.out.println("TTC =" +ttc );
			}
		}else{
			double ttc = HT + (HT * tva);
			System.out.println("TTC =" +ttc );
		}
}
}
