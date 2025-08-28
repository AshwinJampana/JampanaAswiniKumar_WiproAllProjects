package Collections;


import java.util.*;

public class List_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list= new ArrayList<String>();
		list.add("Apple");
		list.add(1, "Mango");
		list.add("kiwi");
		list.add("Banana");
//		list.add(67);
//		list.add(5.5);
//		list.add('a');
//		list.add(true);
		System.out.println(list.get(3));
		list.set(2, "list");
		System.out.println(list.contains("Banana"));
		System.out.println(list.equals("Banana"));
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
		System.out.println(list.indexOf("Mango"));
		System.out.println(list.isEmpty());
		list.remove(0);
		list.remove("list1");
		System.out.println(list);
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		Iterator<String> itr1=list.listIterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
//		ArrayList list1= new ArrayList();
//		list1.add(list);
//		list1.add("abc");
//		list1.add(list);
//		System.out.println(list1);
//		System.out.println(list1.indexOf(list));
		
	}

}
