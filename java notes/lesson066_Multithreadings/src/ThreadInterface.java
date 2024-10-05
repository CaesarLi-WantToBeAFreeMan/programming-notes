public class ThreadInterface implements Runnable{
	@Override
	public void run() {
		for(int i = 10; i > 0; i--) {
			System.out.println("Thread (implements Runnable):\t" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread (implements Runnable) finished");
	}
}
