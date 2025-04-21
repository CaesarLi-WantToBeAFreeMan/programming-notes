public class CCircle {
	//attributes
	private String name = "None";
	private double radius = 0.0;
	private double area = 0.0;
	private double circumference = 0.0;
	protected final double PI = 3.1415926;
	
	//overloaded constructors
	public CCircle(String name) {
		this.name = name;
		this.radius = 0;
	}
	
	public CCircle(String name, double radius) {
		this.name = name;
		this.radius = radius;
	}
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//getters
	public String getName() {
		return this.name;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public double getArea() {
		this.area = PI * Math.pow(this.radius, 2);
		return this.area;
	}
	
	public double getCircumference() {
		this.circumference = PI * 2 * this.radius;
		return this.circumference;
	}
}