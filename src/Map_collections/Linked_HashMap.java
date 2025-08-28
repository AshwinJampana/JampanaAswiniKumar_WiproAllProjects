package Map_collections;
import java.util.Map;
import java.util.LinkedHashMap;
public class Linked_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> lmap=new LinkedHashMap<String,String>();
		lmap.put("one", "orange");
		lmap.put("Four", "Mango");
		lmap.put("Three", "Banana");
		lmap.put("Five", "Watermelon");
		lmap.put("Ten","MuskMelon");
		lmap.put("Two", "Kiwi");
		lmap.put("Nine", "Kiwi");
		lmap.put(null, "Nothing");
		lmap.put(null,null);
		lmap.put("Nine", "CustardApple");
		System.out.println(lmap);
	}

}
