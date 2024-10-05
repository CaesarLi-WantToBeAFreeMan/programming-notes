public class Circle extends Shape {
	private double radius;
	private double diameter;
	private final double PI = 3.1415926;
	
	Circle(double radius) {
		this.radius = radius;
		this.diameter = 2 * radius;
		this.area = PI * radius * radius;
		this.circumference = PI * 2 * radius;
	}
	
	@Override
	public double getArea() {
		return area;
	}
	
	@Override
	public double getCircumference() {
		return circumference;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getDiameter() {
		return diameter;
	}
	
	@Override
	public String toString() {
		return "Circle\n\tradius:\t" + radius + "\ndiameter:\t" + diameter + "\n"
				+ super.toString();
	}
}