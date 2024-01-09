package Assignment6_;

public class Contact {

	
	long PhoneNumber;
	String name;
	String email;
	String gender;
	
	public Contact(long PhoneNumber, String name, String email, String gender) {
		super();
		this.PhoneNumber = PhoneNumber;
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "[Number=" + PhoneNumber + ", Name=" + name + ", Email=" + email + ", Gender=" + gender + "]" + "\n";
	}
	
}


