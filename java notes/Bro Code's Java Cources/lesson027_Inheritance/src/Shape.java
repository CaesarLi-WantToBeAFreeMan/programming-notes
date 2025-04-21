public class Shape {
	protected double area = 0.0;
	protected double circumference = 0.0;
	protected String name = "Unknewn";
	
	public double getArea() {
		return this.area;
	}
	
	public double getCircumference() {
		return this.circumference;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
