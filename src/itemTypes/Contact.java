package itemTypes;

public class Contact implements iSyncable{
	private String name, mobile, email;
	//No-arg constructor. lets you create a “blank” object first, then fill in its fields later.
	//don’t know the values at creation time
	public Contact() {}
	//create and initialise the object, know the values already.
	public Contact(String name, String mobile, String email) {
		this.name = name;
		this.mobile = mobile;
		this.email = email;
	}
	
	//implements isyncable interface to say who is the class
	public String getCode() {
		return "C";
	}
	//returns data inside this class
	public String encode() {
		return String.format("%s|%s|%s", name, mobile, email);
	}
	
	public void decode(String str) {
		String[]parts = str.split("\\|");
		
		name = parts[0];
		mobile = parts[1];
		email = parts[2];
		System.out.println("Contact decoded successfully");
	}
}
