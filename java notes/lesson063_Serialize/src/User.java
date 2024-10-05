import java.io.Serializable;
import java.awt.Color;

public class User implements Serializable{
	private String name;
	private Color background;
	private Color foreground;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBackground(Color background) {
		this.background = background;
	}
	
	public void setForeground(Color foreground) {
		this.foreground = foreground;
	}
	
	
	public String getName() {
		return this.name;
	}
	
	public Color getBackground() {
		return this.background;
	}
	
	public Color getForeground() {
		return this.foreground;
	}
}