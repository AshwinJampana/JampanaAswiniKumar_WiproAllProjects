package Map_collections;

import java.util.Map;
import java.util.TreeMap;

public class Tree_Map {

	public static void main(String[] args) {
		Map<String,String> tmap=new TreeMap<String,String>();
		tmap.put("One", "orange");
		tmap.put("Four", "Mango");
		tmap.put("Three", "Banana");
		tmap.put("Five", "Watermelon");
		tmap.put("Ten","MuskMelon");
		tmap.put("Two", "Kiwi");
		tmap.put("Nine", "Kiwi");
		
		tmap.put("Nine", "CustardApple");
		System.out.println(tmap);
		System.out.println(tmap.keySet());
		System.out.println(tmap.values());
		System.out.println(tmap.entrySet());
		//System.out.println(tmap.ceilingKey("Nines"));
		//System.out.println(tmap.floorKey("Nines"));
		//System.out.println(tmap.higherKey("Nines"));
		//System.out.println(tmap.lowerKey("Nines"));
		
		System.out.println(tmap);
		
	}

}
