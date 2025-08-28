package Collections;

import java.util.HashSet;
import java.util.Iterator;


//Unordered
//No duplicate element allowed
//Store null(only one null allowed)
//elements stored on the basis of hash code value


public class Hash_Set {

	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet<String>();
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
		System.out.println(set);
//		set.clear();
//		System.out.println(set);
//		System.out.println(set.isEmpty());
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
