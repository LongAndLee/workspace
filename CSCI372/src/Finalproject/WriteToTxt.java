package Finalproject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class WriteToTxt {

	public static void writeToText(LinkedList<student> students) {
		try {
		      FileWriter myWriter = new FileWriter("studentlog.txt");
		      
		 
		      for(int i = 0; i < students.size(); ++i) {
		    	  myWriter.write("Time: " + students.get(i).printInfo() + "\n");
		      }
		      
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		      
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	
}
