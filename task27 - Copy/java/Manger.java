package packager.corejava.task27.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Manger extends Employee {
	public static void create() throws IOException {
		File g=new File("D:\\abc.txt");
		g.createNewFile();
	}
	public static void write() throws IOException {
		File g=new File("D:\\abc.txt");
		FileWriter fw=new FileWriter(g,true);
		fw.write("\n vamsikrishna,hi,hello");
		fw.close();
	}

public static void read() throws FileNotFoundException {
	File g=new File("D:\\abc.txt");
	Scanner reader=new Scanner(g);
	while (reader.hasNextLine()) {
        String data = reader.nextLine();
    	  
        System.out.println(data);
	
	
}

}
}
