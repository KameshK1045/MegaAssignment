package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Arith {
 
	int a;
	int b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void arithmetic() {
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException ex) {
			System.out.println("Division by zero is not allowed. Please try providing some other number");
		}
	}
	
	public void nullExce() {
		String shwetha = null;
		try {
		System.out.println(shwetha.charAt(0));
		}
		catch(NullPointerException ex) {
			System.out.println("Please instantiate the object before accessing it. Null cannot be dereferenced");
		}
		
	}
	
	public void filefound() {
		try {
			InputStream file = new FileInputStream("/Users/aarthi-4749/Documents/workspace/Sample/Two_States/Chapter_1.txt");
			char c = (char)file.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Input is invlaid");
		}
	}
	
	public void complete() {
		InputStream is = null;
		try {
			is = createFileInstance();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Input is invlaid");
		}
		
	}

	public static InputStream createFileInstance() throws FileNotFoundException{
		InputStream file=null ;
		try{
			file = new FileInputStream("/Users/aarthi-4749/Documents/workspace/Sample/Two_States/Chapter_1.txt");
		}
		catch(FileNotFoundException fe) {
			throw fe;
		}
		return file;
	}
	
	public static void readFile(InputStream is) throws IOException {
		try{
			char c = (char)is.read();
			System.out.println(c);
		}catch(IOException ioe) {
			throw ioe;
		}
	}

	public void custom(int a){
		String b = ""+a;
		if(b.length()==1) {
		try {
			System.out.println("Success");
		}
		
		catch(Exception ex) {
			System.out.println("Number invalid single digit only");
		}
		}
	}
	
	
}
