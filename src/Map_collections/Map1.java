package Map_collections;

import java.util.HashMap;
import java.util.Map;
public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("one",1);
		map.put("Four",4);
		map.put("Three",3);
		map.put("Five",5);
		map.put("Ten",10);
		map.put(null,null);
		map.replace("one",15);
		System.out.println(map.remove("one"));
		System.out.println(map.remove(null, null));
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		System.out.println(map.entrySet());

	}

}
