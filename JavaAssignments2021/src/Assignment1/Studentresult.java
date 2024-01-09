package Assignment1;
import java.util.*;

//  program to find the result of student whether he is promoted,passed or fail
public class Studentresult {
		public static void main(String[] args)
		{
			

	  //Create an instance of the Scanner class
			Scanner Sc=new Scanner (System.in);

			int M1,M2,M3;

			double avg=0.0;

			System.out.println("Enter 3 sub marks");

			M1=Sc.nextInt();

			M2=Sc.nextInt();

			M3=Sc.nextInt();

			avg=(M1+M2+M3)/3;

			System.out.println("The Resultis "+avg);
			
			if(avg==60)
			{
				System.out.println("Passed");
			}
			else if(avg>60)
			{
				System.out.println("Promoted");
			}
			else if(avg<60)
			{
				System.out.println("Failed");
				
			}
			else
			{
			System.out.println("Invalid");
			}
			}

			}

