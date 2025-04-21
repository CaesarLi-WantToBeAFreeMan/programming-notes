public class Outside {
	String x = "Hello ";
	
	public class Inside {
		String y = "World!";
		
		public void HelloWorld() {
			System.out.println(x + y);
		}
	}
}