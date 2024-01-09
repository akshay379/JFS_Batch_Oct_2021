package Assignment3;
import java.util.Scanner;
public class StringMenuDriven {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("1: Convert the string into the lower case");
	        System.out.println("2: Convert the string into the upper case");
	        System.out.println("3: String Comparison with equal method");
	        System.out.println("4: Replacing a character of String s");
	        System.out.println("5: Search for a word in a string");
	        System.out.println("6: String Comparison with compareto method");
	        System.out.println("7: exit");
	        System.out.print("Make your choice: ");
	        int ch = sc.nextInt();
	        String str;
	        String str1;
	        switch(ch) {
	        case 1:
	            sc.nextLine();
	            System.out.println("Enter string: ");
	            str = sc.nextLine();
	            System.out.println("String converted to the lower case is :" + str.toLowerCase());
	            break;
	        case 2:
	            sc.nextLine();
	            System.out.println("Enter string: ");
	            str = sc.nextLine();
	            System.out.println("String converted to the Upper case is :" + str.toUpperCase());
	            break;
	        case 3:
	            sc.nextLine();
	            System.out.println("Enter First string: ");
	            str = sc.nextLine();
	            System.out.println("Enter Second string: ");
	            str1 = sc.nextLine();
	            boolean str3 = str.equals(str1);
	            System.out.println("First String: " + str);
	            System.out.println("Second String: " + str1);
	            System.out.println("\nComparison Of String: " + str3);
	            break;
	        case 4:
	            sc.nextLine();
	            System.out.println("Enter string: ");
	            str = sc.nextLine();
	            str = str.replace('a', '$');
	            System.out.println(str);
	            break;
	        case 5:
	            System.out.println("Enter string: ");
	            str = sc.nextLine();
	            System.out.println("Contains sequence 'collection': " + str.contains("collection"));
	            break;
	        case 6:
	            sc.nextLine();
	            System.out.println("Enter First string: ");
	            str = sc.nextLine();
	            System.out.println("Enter Second string: ");
	            str1 = sc.nextLine();
	            str.equals(str1);
	            System.out.println("First String: " + str);
	            System.out.println("Second String: " + str1);
	            System.out.println(str.compareTo(str1));
	            break;
	        case 7:
	            System.exit(0);
	        default:
	            System.out.println("Invalid choice!!! Please make a valid choice. \n\n");
	        }

	    }
	}




