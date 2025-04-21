public class Student {
	protected int ID;
	protected String firstName;
	protected String lastName;
	
	Student(){
		this.ID = 0;
		this.firstName = "Unknown";
		this.lastName = "Unknown";
	}
	
	Student(int ID, String firstName, String lastName){
		this.ID = ID;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String toString() {
		return this.ID + "\t" + this.firstName + " " + this.lastName;
	}
}