package Collections;

import java.util.PriorityQueue;
import java.util.Queue;


public class Queue_practice {

	public static void main(String[] args) {
	Queue<String> q=new PriorityQueue<String>();
	q.add("Apple");
	q.add("Mango");
	q.add("Waatermelon");
	q.add("Kiwi");
	
	q.add("CustardApple");
	System.out.println(q);
	System.out.println(q.element());
	q.offer("Banana");
	System.out.println(q);
	System.out.println(q.peek());
	q.poll();
	System.out.println(q);
	q.remove("CustardApple");
	System.out.println(q);
	}

}
