public class Rectangle extends Shape{
	private double length = 0.0;
	private double width = 0.0;
	
	public void setLength(double length) {
		this.length = length;
		this.area = length * width;
		this.circumference = 2 * (length + width);
	}
	
	public void setWidth(double width) {
		this.width = width;
		this.area = length * width;
		this.circumference = 2 * (length + width);
	}
	
	Rectangle(double side, String name){
		this.setLength(side);
		this.setWidth(side);
		this.setName(name);
	}
	
	Rectangle(double length, double width, String name){
		this.setLength(length);
		this.setWidth(width);
		this.setName(name);
	}
	
	public double getLength() {
		return this.length;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public String toString() {
		String text = "";
		text += this.name + "\n";
		text += "\tlength:\t" + this.length + "\n";
		text += "\twidth:\t" + this.width + "\n";
		text += "\tarea:\t" + this.area + "\n";
		text += "\tcircumference:\t" + this.circumference + "\n";
		return text;
	}
}
