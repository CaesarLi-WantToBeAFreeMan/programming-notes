/*
 * Lesson sixty-six: Multithreadings
 * Date: July 15, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

public class Main {
	public static void main(String[] args) {
		//multithreading:	process of executing multiple threads simultaneously (同時)
		//					helps maximum utilization of CPU
		//					threads are independent, they don't affect the execution of other threads
		//					an exception in one thread will not interrupt other threads
		//					useful for serving multiple clients, multiplayer games, or other mutually (相互) independent tasks
		
		//we can create a thread class with extends Thread or implements Runnable
		//but we cann't start a thread that created by implementing Runnable, we should cast it to a Thread object to run it
		
		//in Java, you cann't extends more than one class, but you can implements more than one class
		
		ThreadInheritance thread0 = new ThreadInheritance();
		
		ThreadInterface thread1 = new ThreadInterface();
		Thread thread1Runnable = new Thread(thread1);
		
		//start two threads, those threads are execute together
		//thread0.start();
		//thread1Runnable.start();
		
		thread0.start();
		try {
			//join()	joins the thread to the current thread and executes the rest part after finish the thread
			//join(long milliseconds)	joins the thread to the current thread and executes the rest part milliseconds later
			
			thread0.join(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread1Runnable.start();
		
	}
}