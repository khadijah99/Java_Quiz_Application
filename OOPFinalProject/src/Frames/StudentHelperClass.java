package Frames;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class StudentHelperClass {

	public static ArrayList<Student>  readAllData ()
		    {
		      //  ArrayList initialized with size 0
		ArrayList<Student> students = new ArrayList<Student>(0);
		// Input stream
		ObjectInputStream inputStream = null;
		try
		{
		// open file for reading
		inputStream = new ObjectInputStream(new FileInputStream("E:\\Students.ser"));
		// End Of File flag
		boolean EOF = false;
		// Keep reading file until file ends
		while(!EOF) {
		try {
		// read object and type cast into CarDetails object
		Student myObj = (Student) inputStream.readObject();
		// add object into ArrayList
		students.add(myObj);
		//System.out.println("Read: " + myObj.getName());
		} catch (ClassNotFoundException e) {
		//System.out.println("Class not found");
		} catch (EOFException end) {
		// EOFException is raised when file ends
		// set End Of File flag to true so that loop exits
		EOF = true;
		}
		    }
		}
		catch(FileNotFoundException e) {
		//System.out.println("Cannot find file");
		} catch (IOException e) {
		//System.out.println("IO Exception while opening stream");
		//e.printStackTrace();
		} finally { // cleanup code to close stream if it was opened
		try {
		if(inputStream != null)
		inputStream.close( );
		} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("IO Exception while closing file");
		}
		}
		
		// returns ArrayList
		return students;
		}
	
	public static void writeToFile(ArrayList<Student> list) {
		try {
			ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream("E:\\Students.ser"));
			for(int i = 0 ; i < list.size() ; i++) {
				write.writeObject(list.get(i));
			}
			write.close();
			
		}catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
}

