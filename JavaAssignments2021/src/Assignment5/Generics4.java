package Assignment5;

public class Generics4 {


	public static void main(String[] args) {
		 
		Pair<String, String> obj1 = new Pair<String, String>("1", "Hello");
		Pair<String, java.util.Date> obj2 = new Pair<>("Today is :", new java.util.Date());

		System.out.println(obj1.showData());
		System.out.println(obj2.showData());
		
	}

}
