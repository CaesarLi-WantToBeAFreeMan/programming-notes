/*
 * Lesson sixty-five: Thread
 * Date: July 15, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

public class Main {
	public static void main(String[] args) {
		//thread:	a thread of execution in a program (kind of like a virtual CPU)
		//			the JVM (Java Virtual Machine) allows an application to have multiple threads running concurrently (同時)
		//			each thread can execute parts of you code in parallel with (平行於) the main thread
		//			each thread has a priority
		//			threads with higher priority to execute in preference compared to threads with a lower priority
		
		//the JVM (Java Virtual Machine) continues to execute threads until either of the following occurs
		//I.	the exit method of class Runtime has been called
		//II.	all user threads have died
		
		//when a JVM (Java Virtual Machine) starts up, there is a thread which calls the main method
		//this thread is called "main"
		
		//daemon (守護) thread is a low priority thread that runs in background to perform tasks such as garbage collection
		//JVM (Java Virtual Machine) terminates (終止) itself when all user threads (non-daemon threads) finish their executions
		
		//methods
		//I.	Thread.activeCount()
		//			returns how many threads are running
		//			at least, it's one, the main thread
		
		//II.	Thread.currentThread().getName()
		//			returns a name of the current thread
		//III.	Thread.currentThread().setName(String name)
		//			renames the current thread
		
		//IV.	Thread.currentThread().getPriority()
		//			returns an integer number between 1 and 10
		//			the default priority of a thread is 5
		//			the higher the number, the higher the priority
		//V.	Thread.currentThread().setPriority(int priority)
		//			resets the priority of the current thread
		
		//VI.	Thread.currentThread().isAlive()
		//			checks if the current thread is alive
		
		//VII.	Thread.sleep(int milliseconds)
		//			sleeps for milliseconds milliseconds
		
		//VIII.	run()
		//			executes the thread but not invoke the thread
		//			so, this method cann't change the current thread
		
		//IX.	start()
		//			invokes and executes the thread
		//			so, this method can change the current thread
		
		//X.	isDaemon()
		//			checks if the thread is a daemon thread
		
		//XI.	setDaemon(boolean b)
		//			sets the thread to be a daemon thread or not
		
		System.out.println("active thread count:\t" + Thread.activeCount());
		
		Thread.currentThread().setName("Caesar's First Main Thread");
		System.out.println("current active thread name:\t" + Thread.currentThread().getName());
		
		Thread.currentThread().setPriority(10);
		System.out.println("current active thread priority:\t" + Thread.currentThread().getPriority());
		
		System.out.println("Is the current thread is alive:\t" + Thread.currentThread().isAlive());
		
		for(int i = 10; i > 0; i--) {
			System.out.println(i + (i == 1 ? " second" : " seconds"));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Happy New Year!");
		
		NewThread newThread = new NewThread();
		newThread.run();
		System.out.println("After run method, isAlive:\t" + newThread.isAlive());
		newThread.start();
		System.out.println("After start method, isAlive:\t" + newThread.isAlive());
		
		//newThread.setDaemon(true);
		System.out.println("is the thread a daemon thread:\t" + newThread.isDaemon());
	}
}