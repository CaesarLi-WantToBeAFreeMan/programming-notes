public abstract class Shape {
	protected double area;
	protected double circumference;
	
	public abstract double getArea();
	public abstract double getCircumference();
	public String toString() {
		return "area:\t" + area + "\ncircumference:\t" + circumference + "\n";
	}
}