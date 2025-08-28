package Collections;

import java.util.TreeSet;

//Tree hash set follows alphabetical order in increasing manner
//No duplicate element allowed
//cannot Store null
//elements stored on the basis of hash code value
public class Tree_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> set=new TreeSet<String>();
		set.add("Maggi");
		set.add("Pasta");
		set.add("Salt");
		set.add("Chocolate");
		set.add("Water");
		set.add("Water");
		set.add("Yippi");
		System.out.println(set);
		System.out.println(set.clone());
		System.out.println(set.contains("Pasta"));
		//set.remove("Water");
		System.out.println(set);
		System.out.println(set.ceiling("Waters"));
		System.out.println(set.floor("Waters"));
		System.out.println(set.higher("Salt"));
		System.out.println(set.lower("Salt"));
		set.pollFirst();
		System.out.println(set);
		set.pollLast();
		System.out.println(set);
		System.out.println(set.descendingSet());
		
		
	}

}
