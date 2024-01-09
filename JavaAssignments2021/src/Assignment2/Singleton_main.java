package Assignment2;

public class Singleton_main {

	public static void main(String [] args) {


        String name;
	}

		private static Singleton_main s;

		private Singleton_main() {

		String name = "hello";

		}

		static Singleton_main getInstance() {

		if (s == null)

		s = new Singleton_main();

		return s;

		}
}
		

//Inheritence is an OOP concept where the inheriting class (i.e. child class) inherits all the properties i.e. state and behaviour of the parent class. It demonstrates IS-A relationship where the child class IS-A type of parent class.

//For example:

//class Animal{

//}

//class Dog extends Animal{

//}

//Dog d = new Dog();

//In this type of relationship where the child class extends the parent class, on creating an object of the child class an object of the parent class is also created internally as a child object inherits the properties of the parent object.

//In case of a parent class designed with a Singleton design pattern, the instance of the parent class cannot be (internally) as all its constructors are private which are only visible within the scope of the parent class in which they are defined.

//The java compiler restricts the compilation of such a class by throwing a compilation error indicating that the super class constructor is not defined.


