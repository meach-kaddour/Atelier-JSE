package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Collection {
	public static void main(String[] args) {
		/*ArrayList<String> Mois = new ArrayList<String>();
		Mois.add("janvier");
		Mois.add("février");
		Mois.add("mars");
		Mois.add("avril");
		Mois.add("mai");
		Mois.add("juin");
		Mois.add("juillet");
		Mois.add("aout");
		Mois.add("septembre");
		Mois.add("october");
		Mois.add("novembre");
		Mois.add("décembre");
		// Question1
		// System.out.println(Mois);

		// Question2
		// System.out.println(Mois.get(2));

		// Question3
		// System.out.println(Mois.get(5));

		// Question4
		// for(int i = 0; i < Mois.size(); i++)
		// {
		// System.out.println(Mois.get(i));
		// }

		// Question5
		// int index = Mois.indexOf("aout");
		// Mois.set(index, "aoùt");
		// System.out.println(Mois);

		// Question 6

		// Mois.add(0,"ramadon");
		// System.out.println(Mois);

		// Question7
		// Mois.remove(2);
		// System.out.println(Mois);

		// Question 8
		// System.out.println(Mois.contains("mai"));

		// Question 9
		// Collections.sort(Mois);
		// System.out.println("Arraylist par ordre alphabitique");
		// for(String mois: Mois) {
		// System.out.println(mois);
		// }

		// Question 10
		// ArrayList<String> copie = (ArrayList<String>) Mois.clone();

		// System.out.println(copie);

		// Question 12
		// System.out.println(Mois.isEmpty());
		HashSet<String> mois = new HashSet<String>();
		mois.add("janvier");
		mois.add("février");
		mois.add("mars");
		mois.add("mai");
		mois.add("avril");
		mois.add("juin");
		mois.add("juillet");
		mois.add("aout");
		mois.add("septembre");
		mois.add("october");
		mois.add("novembre");
		mois.add("décembre");*/
		// Question 13
		// System.out.println(mois);

		// Question 15
		// mois.forEach(System.out::println);

		// Question 16
		//System.out.println(mois.size());
		
		//Question 17
		//mois.removeAll(mois);
		//System.out.println(mois);
		
		//Question 18 
		//System.out.println(mois.isEmpty());
		
		//Question 19 
		HashMap<String, String> map = new HashMap<>();
        
        map.put("key1",  "A");
        map.put("key2",  "B");
        map.put("key3",  "C");
         
        /*System.out.println(map);*/
		
		//Question 20
       // System.out.println(map.size());
        
        //Question 21
        Object cloneMap=map.clone();
		System.out.println(cloneMap);
		
		//Question 22
		map.remove("key2");
		System.out.println(map);
		System.out.println(cloneMap);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
