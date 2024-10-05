
public class NewThread extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is running");
	}
}
