public class Circle {
	private final double PI = 3.1415926;
	private double radius;
	private double diameter;
	private double area;
	private double circumference;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	void setRadius(double radius) {
		this.radius = radius;
	}
	
	double getPI() {
		return this.PI;
	}
	
	double getRadius() {
		return this.radius;
	}
	
	double getDiameter() {
		this.diameter = 2 * this.radius;
		return this.diameter;
	}
	
	double getArea() {
		this.area = Math.pow(this.radius, 2) * PI;
		return this.area;
	}
	
	double getCircumference() {
		this.circumference = 2 * this.radius * PI;
		return this.circumference;
	}
	
	//overwrite toString method
	public String toString() {
		String text = "";
		text += "Circle:\n";
		text += "\tradius:\t" + this.getRadius() + "\n";
		text += "\tdiameter:\t" + this.getDiameter() + "\n";
		text += "\tarea:\t" + this.getArea() + "\n";
		text += "\tcircumference:\t" + this.getCircumference() + "\n";
		return text;
	}
}