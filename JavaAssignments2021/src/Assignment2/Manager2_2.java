package Assignment2;



	
	public class Manager2_2 extends Employee2_1{
		 
	    public static final double BONUSPERCENT=0.2;
	    public Manager2_2(int employeeId, String employeeName, double salary) {
	        super(employeeId, employeeName, salary);
	    }
	    public double getSalary() {
	        return salary+salary*BONUSPERCENT;
	    }
	
}
