package Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Iterator;
public class Linkedlistpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<String>();
		list.add(0,"apple");
		list.add(1,"Mango");
		list.add(2,"kiwi");
		list.add(3,"Banana");
		list.add(4,"Banana");
		
		System.out.println(list.get(3));
		list.set(2, "orange");
		System.out.println(list);
		list.set(3, "kiwi");
		System.out.println(list);
		System.out.println(list.contains("Banana"));
		System.out.println(list.equals("Banana"));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.indexOf("kiwi"));
		System.out.println(list.isEmpty());
		list.remove(0);
		System.out.println(list);
		list.remove("kiwi");
		System.out.println(list);
		//System.out.println(list.reversed());
		
		for(String ch:list)
		{
			System.out.println(ch);
		}
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
