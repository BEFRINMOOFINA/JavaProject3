package FileEx;

import java.io.File;
import java.io.IOException;
public class FileCreate {


	public static void main(String[] args) throws IOException {
		//File newFile = new File("C:/Users/befi/eclipse-workspace/JavaProject/src/fileex/one.txt"); 
		//File newFile=new File("C:/Users/befi/eclipse-workspace/JavaProject/src/fileex/d=befii.txt");
		
		File newFile=new File("befii.txt") ;
		if(newFile.createNewFile())	{
			System.out.println("File created.");
		} else {
		System.out.println("File exists.");


	}
	}
}