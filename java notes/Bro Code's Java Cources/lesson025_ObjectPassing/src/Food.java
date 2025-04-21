public class Food {
	private String name;
	
	public Food(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return this.name;
	}
	
	//sending an object into a parameter list
	public boolean equal(Food food) {
		if(this.name.equals(food.name))
			return true;
		else
			return false;
	}
}