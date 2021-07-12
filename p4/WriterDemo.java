package p4;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class WriterDemo {

	public static void main(String[] args) {
		
		try {
			File f = new File("E:\\GL Bajaj\\MyFile.txt");
			FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fw);
			pw.write("test");
			System.out.println("---- done---");
			pw.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
