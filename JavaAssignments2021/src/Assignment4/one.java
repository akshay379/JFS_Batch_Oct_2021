package Assignment4;
import java.io.*;
import java.util.Scanner;
public class one {
	

		// Arithmetic ecxeption handling with try catch
		
		

	public static void main(String[] args)
	{
		int a = 5;
		int b = 0;
		try {
			System.out.println(a / b); // throw Exception
		}
		catch (ArithmeticException e) {
			// Exception handler
			System.out.println(
				"Divided by zero operation cannot possible");
		}
	}
}



