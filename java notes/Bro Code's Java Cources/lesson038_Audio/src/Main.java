/*
 * Lesson thirty-eight: Audio
 * Date: July 2, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

import java.io.File;
import javax.sound.sampled.*;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
		//steps
		//1. loading the file using File class
		File music = new File("audio/(G)I-DLE Allergy.wav");
		
		//2. creating an AudioInputStream object to control the music
		//we should surrounded the object by try-catsh block or using throws keyword
		
		//I. try-catch block
		/*
		try{
			AudioInputStream musicStream = AudioSystem.getAudioInputStream(music);
		}catch(UnsupportedAudioFileException e){
			System.out.println("Sorry, we can't support this type audio");
		}catch(IOException e) {
			System.out.println("Sorry, we cann't read the file");
		}
		*/
		
		//II. throws keyword
		//1.	adding throws UnsupportAudioFileException, IOException
		//		after public static void main(String[] args)
		
		//2.	creating AudioInputStream object
		AudioInputStream musicStream = AudioSystem.getAudioInputStream(music);
		
		//3.	creating Clip object to control the music
		Clip clip = AudioSystem.getClip();
		//throwing an exception: LineUnavailableException
		clip.open(musicStream);
		
		//4.	controlling the music
		//actually, this code plays the music in a background thread
		//but the terminal cann't wait for the thread
		//so we should use scanner to pause the process
		Scanner scanner = new Scanner(System.in);
		String command = "";
		long microsecond = 0;
		do{
			System.out.println("Please enter p for play\ts for stop\tr for restart\ta for pause\te for replay\tq for quit");
			command = scanner.next();
			switch(command) {
				case "p":
				case "P":
					clip.start();
					break;
				
				case "s":
				case "S":
					clip.stop();
					break;
					
				case "r":
				case "R":
					//using setMicrosecondPosition(Microsecond) to set the restart position
					clip.setMicrosecondPosition(0);
					
					//there's no way to pause the music easily
					//we should create a long variable to store the microsecond,
					//then we can stop or (setMicrosecondPosition and start)
				case "a":
				case "A":
					microsecond = clip.getMicrosecondPosition();
					clip.stop();
					break;
					
				case "e":
				case "E":
					clip.setMicrosecondPosition(microsecond);
					clip.start();
					break;
					
				case "q":
				case "Q":
					//don't forget close the object
					clip.close();
					break;
					
				default:
					System.out.println("!!!INVALID INPUT!!!");
			}
		}while(!command.equalsIgnoreCase("q"));
		
	}
}