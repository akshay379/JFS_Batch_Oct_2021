package Assignment2;

public class Developer2_3 extends Employee2_1{ 
    public static final double BONUSPERCENT=0.1;
 
    public Developer2_3(int employeeId, String employeeName, double salary) {
        super(employeeId, employeeName, salary);        
    }
 
    public double getSalary() {
 
        return salary+salary*BONUSPERCENT;
    }
}
 