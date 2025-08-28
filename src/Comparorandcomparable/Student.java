package Comparorandcomparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.*;

public class Student implements Comparable<Student> {
	int id;
	String name;
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
//	public int compareTo(Student s) {
//		 return id-s.id;
//	}
	public int compareTo(Student s)
	{
		return this.name.compareTo(s.name);
	}
	public String toString() {
		return id+ " "+name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Student> list =Arrays.asList(
//				new Student(9,"Amit"),
//				new Student(0,"Rahul"),
//				new Student(2,"Kiran"));
		List<Student> list =new ArrayList<>();
		list.add(new Student(9,"Amit"));
		list.add(new Student(0,"Rahul"));
		list.add(new Student(2,"Kiran"));
		
		Collections.sort(list);
		list.forEach(System.out::println);
	}

}
