package Assignment3;




	import java.util.Scanner;

	public class Buffer {
	    
	    public static void main(String[] args) {
	        System.out.println("1: Append the String");
	        System.out.println("2: Insert the text");
	        System.out.println("3: Reverse the string");
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Make your choice: ");
	        int ch = sc.nextInt();
	        switch(ch) {
	        case 1:
	            StringBuffer sb = new StringBuffer("StringBuffer");
	            sb.append("is a peer class of string");
	            sb.append("that provides much of ");
	            sb.append("the functionality of strings ");
	            System.out.println(sb);
	            break;
	        case 2:
	            StringBuffer sb3 = new StringBuffer("It is used to at the specific index position ");
	            sb3.insert(13, " insert text");
	            System.out.println(sb3);
	            break;
	        case 3:
	            StringBuffer sc2 = new StringBuffer("This method returns the reversed object on which it was called");
	            sc2.reverse();
	            System.out.println(sc2);
	            break;
	        case 4:
	            System.exit(0);
	        default:
	            System.out.println("Invalid choice!!! Please make a valid choice. \n\n");
	        }

	    }
	}



