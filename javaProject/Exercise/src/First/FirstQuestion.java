package First;

import java.util.Scanner;


public class FirstQuestion {
	
	static Scanner clavier = new Scanner(System.in);
	public static void main(String[] args) {
		//ONE
		 /*String nombre1="120";
		 int nombre2=Integer.parseInt(nombre1);
		 System.out.println(nombre1);*/
		//TOW
		/*
		String message1="Une chaine ",message2="de caractere";
		String result=message1.concat(message2);
		System.out.println(result);*/
		
		//TREE
		/*int nombre1=16,nombre2=30,result =nombre1+nombre2;
		System.out.println(result);*/
		//FOUR
		/*System.out.println("entree un nombre");
		int test =clavier.nextInt();
		if(test<0) {
			System.out.println("nombre negatif");
		}else {
			System.out.println("nombre positif");
		}
		int pair =test % 2;
		if(pair!=0) {
			System.out.println("le nombre est  impair");
		}else {
			System.out.println("le nombre  est pair");
		}*/
		
		
		//SIX
		
		/*int test1=20,test2=14,test3=24;
		if( test1 > test2 && test1 <= test3) {
			System.out.println("la condition 1 est verifier ");
		}
		elseif(test1 < test2 && test1 >= test3) {
			System.out.println("la condition 2 est verifier ");
		}else {
			System.out.println("Aucune condition est vérifiée");
		}*/
		
		/*int n1=10,n2=10,result1,result2;
		n1=++n1;	
		result1=n1;
		result2=n2++;

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(n2);*/
		/*System.out.println("Ecriver ton age");
		int age =clavier.nextInt();
		int currentYear=2020;
		int birthYear=currentYear-age;
		System.out.println("votre annés de naissance : "+birthYear);*/
		
		/*System.out.println("Enter Your gender");
		String gender=clavier.nextLine();
		System.out.println("enter Your Age");
		int age=clavier.nextInt();
		if(age >20 && gender!="femme" || age<18 && age>35 && gender!="homme") {
			System.out.println("vous avez besoin de payer l'impot");
		}else {
			System.out.println("pas d'impot");
		}*/
		for (int i = 1; i <= 30; i++){
			   for (int j = 1; j <= 100; j++){
			      System.out.print(i * j + " ");
			   }
			   System.out.println();
			}
		
		
		
		
		
		
		 

	}

}
