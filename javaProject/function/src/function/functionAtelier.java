package function;

public class functionAtelier {
	static boolean firstQuestion() {
		return true;
	}

	static String chaineCar(String name) {
		System.out.println(name);
		return name;
	}

	static String Question3(String firstname, String lastname) {
		String fullname = firstname + " " + lastname;
		System.out.println(fullname);
		return (fullname);
	}

	static void question4(int n1, int n2) {
		if (n1 < n2) {
			System.out.println("Le premier nombre est plus petit si le premier nombre est plus petit que le deuxième");
		} else if (n1 > n2) {
			System.out.println("Le premier nombre est plus grand si le premier nombre est plus grand que le deuxième");
		} else {
			System.out.println("Les deux nombres sont identiques si les deux nombres sont égaux");
		}
	}
	static void question7(int age ,String gender) {
		if(age>18 && gender!="H") {
			System.out.println("Vous êtes une femme et vous êtes majeur");
		}
		if(age<18 && gender!="H") {
			System.out.println("Vous êtes une femme et vous êtes mineur");
		}
		if(age>18 && gender!="F") {
			System.out.println("Vous êtes une femme et vous êtes majeur");
		}
		if(age<18 && gender!="F") {
			System.out.println("Vous êtes une femme et vous êtes majeur");
		}
	}
	
	static void question5(String chaine, int number) {
		System.out.println(chaine + number);
	}

	public static void question6(String nom, String prenom, int age) {
		System.out.println("Bonjour " + nom + " " + prenom + ", tu as " + age + "ans");

	}

	static int sum(int n1, int n2, int n3) {
		return (n1 + n2 + n3);
	}

	static int sum(int n1, int n2) {
		return sum(n1, n2, 10);
	}

	static int sum(int n1) {
		return sum(n1, 10);
	}

	static int sum() {
		return sum(2);
	}

	public static void main(String[] args) {

		// System.out.println(firstQuestion());
		// chaineCar("java");
		// Question3("bruce","lee");
		// new functionAtelier(). question4(8,8);
		// new functionAtelier(). question5("concaténation ",8);
		// new functionAtelier(). question6("KK","LL",99);
		// System.out.println(sum(6));
		new functionAtelier(). question7(12,"H");
		
	}
}
