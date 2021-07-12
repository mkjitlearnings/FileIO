package p4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



import p1.Account;

public class SerializationDemo {
	
	public static void main(String[] args) throws Exception{
		
		Account a = new Account("ramesh",101, 2000);
		
		String path = "E:\\GL Bajaj\\Ser.txt";
		
		/*
		 * FileOutputStream fos = new FileOutputStream(path); ObjectOutputStream oos =
		 * new ObjectOutputStream(fos);
		 * 
		 * oos.writeObject(a);
		 */
		
		//------------------------------
		
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Account account = (Account)ois.readObject();
		System.out.println(account.getAccountNumber());
		
	}

}









