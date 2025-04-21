public class Caesar extends Student{
	private String ability = "Programming";
	
	Caesar(int ID, String firstName, String lastName, String ability){
		//using super(ID, firstNane, lastName) to represent
		//this.ID = ID;
		//this.firstName = firstName;
		//this.lastName = lastName;
		super(ID, firstName, lastName);
		this.ability = ability;
	}
	
	public String toString() {
		//using super.toString() to call the parent.toString() method first,
		//then append "\t" and this.ability at the end
		return super.toString() + "\t" + this.ability;
	}
}