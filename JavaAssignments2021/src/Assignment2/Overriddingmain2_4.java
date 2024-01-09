package Assignment2;

public class Overriddingmain2_4 {

	
		
	    public static void main(String[] args) {
	        Developer2_3 d1=new Developer2_3(1,"Amit" ,20000);
	        Developer2_3 d2=new Developer2_3(2,"Johnny" ,15000);
	        Manager2_2 m1=new Manager2_2(1,"Arvind" ,30000);
	        Manager2_2 m2=new Manager2_2(2,"Ashi" ,50000);
	 
	        System.out.println("Name of Employee:" +d1.getEmployeeName()+"---"+"Salary:"+d1.getSalary());
	        System.out.println("Name of Employee:" +d2.getEmployeeName()+"---"+"Salary:"+d2.getSalary());
	        System.out.println("Name of Employee:" +m1.getEmployeeName()+"---"+"Salary:"+m1.getSalary());
	        System.out.println("Name of Employee:" +m2.getEmployeeName()+"---"+"Salary:"+m2.getSalary());
	    }
	}
	 



