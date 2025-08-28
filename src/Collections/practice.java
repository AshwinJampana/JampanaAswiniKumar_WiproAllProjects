package Collections;
import java.util.LinkedList;
import java.util.ArrayList;
public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LinkedList<Integer> list=new LinkedList<Integer>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
//		Object list1=new LinkedList<Integer>();
//		list1=list.clone();
//		System.out.println("Original List"+list);
//		System.out.println("Clonable List"+list.clone());
		
		LinkedList<String> list2=new LinkedList<String>();
		list2.add("One");
		list2.add("Two");
		list2.add("Three");
		list2.add("Four");
		
		System.out.println("Linked List :"+list2);
		ArrayList<String> list3=new ArrayList<String>(list2);
		System.out.println("Array List  :"+list3);
		
		
		
	}

}
