package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list =new ArrayList<>(List.of(50,60,70,80,20));
		Collections.sort(list);
		System.out.println(list);
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Element to be searched ");
		Integer searchelement=sc.nextInt();
		System.out.println(list.contains(searchelement)?"Element Found at index "+list.indexOf(searchelement):"Element Not Found");
		
		
		
		//ArrayList to Array
		 int[] array1 = new int[list.size()]; 
	        for (int i = 0; i < list.size(); i++) {
	            array1[i] = list.get(i);
	        }

	        System.out.print("[");
	        for (int j = 0; j < array1.length; j++) {
	            System.out.print(array1[j]);
	            if (j < array1.length - 1) {
	                System.out.print(", "); 
	            }
	        }
	        System.out.println("]");
	        
	        //System.out.println(list.toString());
	        //can also use tostring() method
		
		//Mergining
		ArrayList<Integer> list1 =new ArrayList<>(List.of(50,60,70,80,20,40,90,1,2,3,4));
		
		for(Integer ch:list)
		{
			if(!list1.contains(ch)) {
				list1.add(ch);
			}	
		}
		System.out.println("Merged list without duplicates "+list1);
		
	
		
		
		
	}

}
