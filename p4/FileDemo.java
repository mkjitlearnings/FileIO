package p4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo {
	
	public static void main(String[] args) {
		
		String path = "E:\\GL Bajaj\\Core Java\\Day2Onwards\\ObjectClassDemo\\src\\p3\\Demo.java";
		BufferedReader br = null;
		try {
		

			File f = new File(path);
			FileReader fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			String line = "";
			
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
			}
			
			
			
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		 catch (IOException e) {
				// TODO: handle exception
				System.out.println(e);
			}
		finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
			
		
		
	}//end main
}//end class