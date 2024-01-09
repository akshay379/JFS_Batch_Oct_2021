package Assignment2;

public class six_main{
public static void main(String[] args)
{
	 Persistence obj1=new FilePersistence();
	 Persistence obj2=new DatabasePersistence();
	 
	 obj1.persist();
	 obj2.persist();
}
}
