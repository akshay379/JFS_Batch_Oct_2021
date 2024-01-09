package Assignment3;
import java.util.Scanner;
public class Builder {
	
	    public static void main(String[] args) {
	        System.out.println("1: Append the String for builder");
	        System.out.println("2: Insert the text for builder ");
	        System.out.println("3: Reverse the string for builder");
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Make your choice: ");
	        int ch = sc.nextInt();
	        switch(ch) {
	        case 1:
	            StringBuilder stringBuilder = new StringBuilder("String Builder ");
	            StringBuffer sb = new StringBuffer("is a peeer class of string");
	            StringBuffer sb2 = new StringBuffer(" that provides much of ");
	            StringBuffer sb3 = new StringBuffer("The functionality of strings  ");
	            stringBuilder.append(sb);
	            stringBuilder.append(sb2);
	            stringBuilder.append(sb3);
	            System.out.println("after append = " + stringBuilder);
	            break;
	        case 2:
	            StringBuilder sb1 = new StringBuilder("It is used to  at a specific index position");
	            sb1.insert(14, "insert text");
	            System.out.println("after insert = " + sb1);
	            break;
	        case 3:
	            StringBuilder sb11 = new StringBuilder("This method returns the reversed object on which it is called ");
	            System.out.println("reverse = " + sb11.reverse());
	            break;
	        case 4:
	            System.exit(0);
	        default:
	            System.out.println("Invalid choice!!! Please make a valid choice. \n\n");
	        }

	    }
	}




