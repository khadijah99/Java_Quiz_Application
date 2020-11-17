package Frames;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class AdminHelperClass {

	public static ArrayList<Admin>  readAllData ()
		    {
		      //  ArrayList initialized with size 0
		ArrayList<Admin> admin = new ArrayList<Admin>(0);
		// Input stream
		ObjectInputStream inputStream = null;
		try
		{
		// open file for reading
		inputStream = new ObjectInputStream(new FileInputStream("E:\\Admin.ser"));
		// End Of File flag
		boolean EOF = false;
		// Keep reading file until file ends
		while(!EOF) {
		try {
		// read object and type cast into CarDetails object
		Admin myObj = (Admin) inputStream.readObject();
		// add object into ArrayList
		admin.add(myObj);
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
		return admin;
		}
	
	public static void writeToFile(ArrayList<Admin> list) {
		try {
			ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream("E:\\Admin.ser"));
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


