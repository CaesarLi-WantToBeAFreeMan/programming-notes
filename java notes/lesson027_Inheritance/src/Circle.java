//subclass Circle is inheriting all public and protected properties from superclass Shape
public class Circle extends Shape{
	private double radius = 0.0;
	private double diameter = 0.0;
	private final double PI = 3.1415926;
	
	public void setRadius(double radius) {
		this.radius = radius;
		this.diameter = 2 * radius;
		this.area = PI * radius * radius;
		this.circumference = PI * 2 * radius;
	}
	
	Circle(double radius, String name){
		this.setRadius(radius);
		this.setName(name);
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public double getDiameter() {
		return this.diameter;
	}
	
	public double getPI() {
		return this.PI;
	}
	
	//method overriding
	//@Override is an annotation to tell the compiler that the method is an override method
	//it's not necessary but a good habit
	@Override
	public double getArea() {
		return this.area;
	}
	
	public String toString() {
		String text = "";
		text += this.name + "\n";
		text += "\tradius:\t" + this.radius + "\n";
		text += "\tdiameter:\t" + this.diameter + "\n";
		text += "\tarea:\t" + this.area + "\n";
		text += "\tcircumference:\t" + this.circumference + "\n";
		text += "\tPI:\t" + this.PI + "\n";
		return text;
	}
}