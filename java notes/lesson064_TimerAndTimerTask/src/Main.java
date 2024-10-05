/*
 * Lesson sixty-four: Timer & TimerTask
 * Date: July 14, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

import java.util.Timer;
import java.util.TimerTask;
import java.util.Calendar;

public class Main {
	public static void main(String[] args) {
		//Timer:	a facility (設施) for threads to schedule tasks
		//			for future execution in a background thread
		//			we need import java.util.Timer;
		//declaration:	Timer timerName = new Timer();
		
		//TimerTask:	a task that can be scheduled for one-time
		//				or repeated execution by a Timer
		//				we need import java.util.TimerTask;
		//declaration:	TimerTask timerTaskName = new TimerTask(){
		//					@Override
		//					public void run(){
		//						statements;
		//					}
		//				};
		//tips of declarations:		I.	you need type a definition body
		//							II.	Don't forget add a ; after {}
		
		Timer timer = new Timer();
		TimerTask timerTask = new TimerTask() {
			@Override
			public void run() {
				System.out.println("Hello World!");
			}
		};
		
		//schedule method of a Timer object
		//is used to schedule the task for execution at the task fir execution at the given time
		//if the time given is in the past, the task is scheduled at that movement for execution
		
		//schedule
		//I.	schedule(TimerTask task, Date time)
		//			schedule the task when the time is done
		//II.	schedule(TimerTask task, long delay)
		//			schedule the task after delay milliseconds
		//III.	schedule(TimerTask task, Date firstTime, long period)
		//			schedule the task again and again in given fixed time execution
		//IV.	schedule(TimerTask task, long delay, long period)
		//			schedule the task again and again in given fixed time execution
		//timer.schedule(timerTask, 1000);
		
		//to create a date object
		//we need import java.util.Calendar;
		Calendar date  = Calendar.getInstance();
		date.set(Calendar.YEAR, 2024);
		//we can enter Calendar.MONTHNAME or number of the month - 1
		date.set(Calendar.MONTH, Calendar.JULY);
		date.set(Calendar.DAY_OF_MONTH, 14);
		//24-hour clock
		date.set(Calendar.HOUR_OF_DAY, 21);
		date.set(Calendar.MINUTE, 55);
		date.set(Calendar.SECOND, 40);
		date.set(Calendar.MILLISECOND, 0);
		
		timer.schedule(timerTask, date.getTime());
		
		//count-down
		
		TimerTask countdown = new TimerTask() {
			int count = 10;
			public void run() {
				if(--count > 0)
					System.out.println(count);
				else {
					System.out.println("Happy New Year!");
					//kill the timer
					timer.cancel();
				}
			}
		};
		
		//scheduleAtFixedRate
		//I.	scheduleAtFixedRate(TimerTask task, Date firstTime, long period)
		//			execute a count method every period milliseconds after the date
		//II.	scheduleAtFixedRate(TimerTask task, long delay, long period)
		//			execute a count method every period milliseconds after delay milliseconds
		timer.scheduleAtFixedRate(countdown, 0, 1000);
	}
}