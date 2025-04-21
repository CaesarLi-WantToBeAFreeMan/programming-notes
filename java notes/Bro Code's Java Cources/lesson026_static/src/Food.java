public class Food {
	static String name = "hotdog";
	double price = 1.99;
	
	static void showName() {
		//you cann't type this.name to access a static variable
		System.out.println("the name is:\t" + name);
	}
	
	void showPrice() {
		System.out.println("the price is:\t" + this.price + "$");
	}
	
	//you only can create a static class within a class
	//you cann't create a static class of top level
	static class StaticFood{
		String name = "burger";
		double price = 2.99;
		
		//we cann't create a static property within a static class
		void showName() {
			System.out.println("the static name is:\t" + name);
		}
		
		void showPrice() {
			System.out.println("the static price is:\t" + price);
		}
	}
}