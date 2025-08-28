package File_Handling;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Se_data {

	public static void main(String[] args) throws IOException ,ClassNotFoundException{
		// TODO Auto-generated method stub
		FileInputStream fos=new FileInputStream("employee.txt");
		ObjectInputStream oos=new ObjectInputStream(fos);
		Student s1=(Student)oos.readObject();
		s1.display();
		oos.close();
		fos.close();
		System.out.println("Deserialization done successfully");

	}

}
