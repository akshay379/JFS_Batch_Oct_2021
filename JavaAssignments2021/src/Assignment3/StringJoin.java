package Assignment3;

import java.util.Scanner;
public class StringJoin {
    public StringJoin() {
    }

    public static void main(String[] input) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the First String: ");
        String a = scan.nextLine();
        System.out.print("Enter the Second String: ");
        String b = scan.nextLine();
        a = a.concat(b);
        System.out.println("\nFirst string after concatenation: " + a);
    }
}

