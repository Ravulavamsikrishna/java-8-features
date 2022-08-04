package packager.corejava.task27.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Employee {
	public static void create() throws IOException {
		File f=new File("D:\\abc.txt");
		f.createNewFile();
	}
	public static void write() throws IOException {
		File f=new File("D:\\abc.txt");
		FileWriter fw=new FileWriter(f,true);
		fw.write(97);
		fw.close();
	}

public static void read() throws FileNotFoundException {
	File f=new File("D:\\abc.txt");
	Scanner reader=new Scanner(f);
	while (reader.hasNextLine()) {
        String data = reader.nextLine();
    	  
        System.out.println(data);
	
	
}

}






}




