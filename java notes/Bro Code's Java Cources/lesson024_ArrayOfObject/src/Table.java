public class Table {
	private int row;
	private int column;
	private String name;
	private String content;
	
	public Table() {
		this.row = 0;
		this.column = 0;
		this.name = null;
		this.content = null;
	}
	
	public Table(int row, int column, String name, String content) {
		this.row = row;
		this.column = column;
		this.name = name;
		this.content = content;
	}
	
	public void setRow(int row) {
		this.row = row;
	}
	
	public void setColumn(int column) {
		this.column = column;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public int getRow() {
		return this.row;
	}
	
	public int getColumn() {
		return this.column;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public String toString() {
		String text = "";
		text += "Table:\n";
		text += "\trow:\t" + this.getRow() + "\n";
		text += "\tcolumn:\t" + this.getColumn() + "\n";
		text += "\tname:\t" + this.getName() + "\n";
		text += "\tcontent:\t" + this.getContent() + "\n";
		return text;
	}
}