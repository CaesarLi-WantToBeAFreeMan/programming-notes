public class Person {
	private String firstName;
	private String lastName;
	private String biologicalGender;
	private int age;
	
	Person(String firstName, String lastName, String biologicalGender, int age) {
		setFirstName(firstName);
		setLastName(lastName);
		setBiologicalGender(biologicalGender);
		setAge(age);
	}
	
	//copy constructor
	Person(Person person){
		copy(person);
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setBiologicalGender(String biologicalGender) {
		this.biologicalGender = biologicalGender;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getBiologicalGender() {
		return biologicalGender;
	}
	
	public int getAge() {
		return age;
	}
	
	public String show() {
		return firstName + " " + lastName + ", " + age + ", " + biologicalGender; 
	}
	
	//copy method
	public void copy(Person person) {
		setFirstName(person.getFirstName());
		setLastName(person.getLastName());
		setBiologicalGender(person.getBiologicalGender());
		setAge(person.getAge());
	}
}






