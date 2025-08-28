package Map_collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"one");
		map.put(4,"Four");
		map.put(3,"Three");
		map.put(5,"Five");
		map.put(10,"Ten");
		map.put(6,"Six");
		map.put(null,null);
		//map.replace(10,"one");
		//System.out.println(map.remove(10));
		System.out.println(map.remove(null, null));
		System.out.println("Keyset   :"+map.keySet());
		System.out.println("Value set:"+map.values());
		
		System.out.println(map.entrySet());

	}

}
