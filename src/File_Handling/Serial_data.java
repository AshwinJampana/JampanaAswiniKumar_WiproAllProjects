package File_Handling;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;


public class Serial_data {

	public static void main(String[] args) {
		Employee emp=new Employee(101,"Minisha Shah");
		Employee emp2=new Employee(102,"Shah");
//		try 
		
//		{
//			FileWriter fw=new FileWriter("employee.");
//			ObjectOutputStream oos=new ObjectOutputStream(fos);
//			oos.writeObject(emp);
//			oos.close();
//			fos.close();
//			System.out.println("Done");
//		}
		try 
		{
			FileWriter fw=new FileWriter("employee.txt");
			BufferedWriter bf=new BufferedWriter(fw);
			bf.write("ID\tName\n");
			bf.write(emp.toString());
			bf.newLine();
			bf.write(emp2.toString());
			bf.newLine();
			bf.close();
			fw.close();
			System.out.println("Done");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
