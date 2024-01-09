package Assignment1;
import java.util.*;
// program to find the simple and the compound interest
public class SimpleCompoundIntertes {


		/**
		 * @param args
		 */
		public static void main(String[] argu) {
			double pr,rate,time,simpleinterest,compoundinterest;
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the principle amount");
			pr=sc.nextDouble();
			System.out.println("Enter the time period");
			time=sc.nextDouble();
			System.out.println("Enter the rate of interest");
			rate=sc.nextDouble();
			simpleinterest=(pr*time*rate)/100;
			compoundinterest=pr * Math.pow(1.0+rate/100.0,time) - pr;
			System.out.println("Simple Interest"+simpleinterest);
			System.out.println("Compound Interest"+compoundinterest);
			
			

		}

	}
