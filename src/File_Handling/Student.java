package File_Handling;

import java.io.Serializable;
public class Student  implements Serializable{

		int rollno;
		String name;
		Student(int rollno,String name)
		{
			this.rollno=rollno;
			this.name=name;
		}
		
		public void display() {
			// TODO Auto-generated method stub
			System.out.println(rollno+"  "+name);
		}
}

