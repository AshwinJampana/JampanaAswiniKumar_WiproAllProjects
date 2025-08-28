package Collections;
import java.util.*;

public class VECTOR_PRACTICE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> v=new Vector<String>();
		v.add("Orange");
		v.add("Blue");
		v.add("white");
		v.add("Black");
		v.add(4,"Grey");
		v.add(null);
		v.add("Black");
		System.out.println(v);
		System.out.println(v.indexOf("black"));
		System.out.println(v.remove(0));
		System.out.println(v.subList(0, 3));
	}

}
