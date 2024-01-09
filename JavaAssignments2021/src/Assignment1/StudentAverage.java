package Assignment1;

import java.util.Scanner;
public class StudentAverage {
	


		public static void main(String args[])
		{
		     float eng1, phy1, chem1,eng2,phy2,chem2,eng3,phy3,chem3; 
		     double Grandtotal,total1,total2,total3, Grandaverage,average1,average2,average3, percentage;
		    Scanner op=new Scanner(System.in);
		    /* Input marks of all five subjects */
		    System.out.println("Enter marks of Three subjects for student 1:");
		    System.out.print("Enter marks of English subjects:");
		    eng1=op.nextFloat();
		    System.out.print("Enter marks of physics subjects:");
		    phy1=op.nextFloat();
		    System.out.print("Enter marks of chemistry subjects:");
		    chem1=op.nextFloat();
		    /* Calculate total, average and percentage */
		    total1 = eng1 + phy1 + chem1;
		    average1 = (total1 / 3.0);
		   
		    
		    System.out.println("Enter marks of Three subjects for student 2:");
		    System.out.print("Enter marks of English subjects:");
		    eng2=op.nextFloat();
		    System.out.print("Enter marks of physics subjects:");
		    phy2=op.nextFloat();
		    System.out.print("Enter marks of chemistry subjects:");
		    chem2=op.nextFloat();
		    /* Calculate total, average and percentage */
		    total2 = eng2 + phy2 + chem2;
		    average2 = (total2 / 3.0);
		  
		    
		    System.out.println("Enter marks of Three subjects for student 3:");
		    System.out.print("Enter marks of English subjects:");
		    eng3=op.nextFloat();
		    System.out.print("Enter marks of physics subjects:");
		    phy3=op.nextFloat();
		    System.out.print("Enter marks of chemistry subjects:");
		    chem3=op.nextFloat();
		    
		    /* Calculate total, average and percentage */
		    total3 = eng3 + phy3 + chem3;
		    average3 = (total3 / 3.0);
		    

		    /* Print all results */
		    System.out.println("Total marks of student 1 ="+total1);
		    System.out.println("Average marks of student 1= "+average1);
		    System.out.println("Total marks of student 2 ="+total2);
		    System.out.println("Average marks of student 2 = "+average2);
		    System.out.println("Total marks of student 3 ="+total3);
		    System.out.println("Average marks of student 3= "+average3);
		    Grandtotal=total1+total2+total3;
		    Grandaverage=average1+average2+average3/3;
		    System.out.println("Grand Total marks of all the students="+Grandtotal);
		    System.out.println("Grand Average marks of all the students= "+Grandaverage);
		    

		   }
		
}
