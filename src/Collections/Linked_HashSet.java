package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

//linked hash set follows  insertion order
//No duplicate element allowed
//Store null(only one null allowed)
//elements stored on the basis of hash code value


public class Linked_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		
		System.out.println(set);
		
		System.out.println(set.clone());
		System.out.println(set.contains("Two"));
		System.out.println(set.isEmpty());
		set.remove("One");
		System.out.println(set);
		
		
		set.add("Two");
		set.add(null);
		set.add(null);
		//System.out.println(set.getFirst());
//		set.clear();
//		System.out.println(set);
//		System.out.println(set.isEmpty());
		System.out.println(set);
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
