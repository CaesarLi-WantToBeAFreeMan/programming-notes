/*
 * Lesson thirty-seven: File Class
 * Date: July 1, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		//file:		an abstract representation of file and directory pathnames
		//to do that, we should import java.io.File

		//there's three ways to select the file
		//1. just type the file name when it exits within the project
		File file = new File("secret.txt");
		
		//2. type the whole path using \\
		//File file = new File("D:\\ProgramData\\Eclipse\\java's workspace\\lesson037_FileClass\\secret.txt");
		
		//3. type the whole path using /
		//File file = new File("D:/ProgramData/Eclipse/java's workspace/lesson037_FileClass/secret.txt");
		
		//delete method is delete the file
		file.delete();
		
		//createNewFile method returns a boolean value
		//true:		file is created successfully
		//false:	file already exists
		
		try {
			if(file.createNewFile())
				System.out.println("This file is created!");
			else
				System.out.println("This file already exists!");
		}catch(IOException e) {
			System.out.println("Something went wrong!");
		}
		
		//check whether the file exists
		
		if(file.exists()) {
			System.out.println("This file exists!");
			
			//getPath method just gets the path what you typed in the constructor
			System.out.println(file.getPath());
			
			//getAbsolutePath method gets the absolute path of the file in the computer
			System.out.println(file.getAbsolutePath());
			
			//isFile method returns a boolean value whether the object is a file or a directory
			System.out.println(file.isFile());
			
			//file writer
			//to write something into a file, we need a FileWriter object
			//but we must type it into a try-catch block in case the file doesn't exist
			
			try {
				FileWriter writer = new FileWriter("secret.txt");
				
				//write(String) method is write the String into the file over the original content
				writer.write("Fight Bugs                      |     |\r\n"
						+ "                                \\\\_V_//\r\n"
						+ "                                \\/=|=\\/\r\n"
						+ "                                 [=v=]\r\n"
						+ "                               __\\___/_____\r\n"
						+ "                              /..[  _____  ]\r\n"
						+ "                             /_  [ [  M /] ]\r\n"
						+ "                            /../.[ [ M /@] ]\r\n"
						+ "                           <-->[_[ [M /@/] ]\r\n"
						+ "                          /../ [.[ [ /@/ ] ]\r\n"
						+ "     _________________]\\ /__/  [_[ [/@/ C] ]\r\n"
						+ "    <_________________>>0---]  [=\\ \\@/ C / /\r\n"
						+ "       ___      ___   ]/000o   /__\\ \\ C / /\r\n"
						+ "          \\    /              /....\\ \\_/ /\r\n"
						+ "       ....\\||/....           [___/=\\___/\r\n"
						+ "      .    .  .    .          [...] [...]\r\n"
						+ "     .      ..      .         [___/ \\___]\r\n"
						+ "     .    0 .. 0    .         <---> <--->\r\n"
						+ "  /\\/\\.    .  .    ./\\/\\      [..]   [..]\r\n"
						+ " / / / .../|  |\\... \\ \\ \\    _[__]   [__]_\r\n");
				
				//append(String) method is write String into the file at the end
				writer.append("/ / /       \\/       \\ \\ \\  [____>   <____]");
				
				//don't forget close the file writer at the end
				writer.close();
			}catch(IOException e) {
				System.out.println("Sorry, this file doesn't exist!");
			}
			
			//file reader
			//to read a file, we need a FileReader object
			//we must surround it with a try-catch block as well
			try {
				FileReader reader = new FileReader("secret.txt");
				
				//read() method just reads the next character ascii value,
				//so you need a for loop to read the whole file
				for(int data = reader.read(); data != -1; data = reader.read())
					System.out.print((char)data);
				//and don't forget close it at the end
				reader.close();
			}catch(FileNotFoundException e) {
				System.out.println("Sorry, this file doesn't exist!");
			}catch(IOException e) {
				System.out.println("Sorry, this file doesn't exist!");
			}
			
		}
		else
			System.out.println("This file does not exit!");
		
	}
}