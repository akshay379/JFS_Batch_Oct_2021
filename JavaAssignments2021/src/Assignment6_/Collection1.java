package Assignment6_;
import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;
public class Collection1 {

	
	
	public static void main(String[] args) {
		 
		Contact obj1 = new Contact( 9876543210L, "Rahul" , "RK@gmail.com" , "Male");
		Contact obj2 = new Contact( 9133330405L, "Verma" , "V1@gmail.com" , "Male");
		Contact obj3 = new Contact( 6688443212L, "Prince" , "Prgmail.com" , "Male");

		Map<Long, Contact> data = new TreeMap<Long, Contact>(Collections.reverseOrder());
			
		data.put(1084L, obj1);
		data.put(12942198L, obj2);
		data.put(1425764L, obj3);
	 	 
		 System.out.println("Keys : "+data.keySet() + "\n");
		 System.out.println("Values : " + data.values() + "\n");
		 System.out.println(data + "\n");
		 
	}

}






