package Assignment8;

import java.util.ArrayList;
import java.util.List;

public class Lambda4 {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<String> str = new ArrayList<>();
			
			str.add("rahul");
			str.add("verma");
			str.add("vikram");
			str.add("Yash");
			
			str.removeIf(l -> l.length()%2 !=0);
			
			System.out.println(str);
			
	}




}