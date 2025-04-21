/*
 * Lesson seventy-seven: JDBC
 * Date: October 1, 2024
 * Author: Caesar James Lee
 * Teacher: Simplilearn
*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) throws SQLException{
		//JDBC
		//	a tool or an API(Application Programming Interface)
		//	establish a connection between a standard database and java application
		//	intends to use that database
		
		//datatypes
		//	SQL						JDBC
		//	VARCHAR					java.lang.String
		//	BIT						boolean
		//	NUMERIC					Java.math.BigDecimal
		//	REAL					float
		//	FLOAT					float
		//	DOUBLE					double
		//	BINARY					byte[]
		//	DATE					java.sql.Date
		//	TIMESTAMP				java.sql.Timestamp
		//	ARRAY					java.sql.Array
		//	REF						java.sql.Ref
		//	STRUCT					java.sql..Struct
		//	CHAR					java.lang.String
		//	BIGINT					long
		//	VARBINARY				byte[]
		//	CLOB					java.sql.Clob
		//	BLOB					java.sql.Blob
		
		//architecture
		//						application
		//							|
		//							\/
		//						JDBC API
		//							|
		//							\/
		//						JDBC Manager
		//							|
		//							\/
		//						JDBC Drivers
		//						|				|			|
		//						\/				\/			\/
		//						SQL Server		Oracle DB	Source
		
		//steps
		//I.	import packages
		//			ensure available
		//				steps:
		//					i.		right click the project
		//					ii.		properties	(Alt + Enter)
		//					iii.	click Java Build Path at the left navigator
		//					iv.		click libraries at the top navigator
		//					v.		click Add External JARs button
		//					vi.		select the MySQL connector j jar file
		//					vii.	click Apply and Close button
		//II.	load and register driver
		//			load and register for establishing a connection between application and database
		//III.	connect database
		//			by getConnection() method
		//IV.	write a query
		//			write in the SQL command or query that we need to execute
		//V.	execute query
		//			by executeQuery() method
		//VI.	process result
		//			system basically done two things:
		//				i.	process output
		//				ii.	retrieve values
		//VII.	close statement
		//			resultSet and statement needs to be closed explicitly
		//VIII.	close connection
		//			disconnect ourselves or the API from the database

		try {
			//load the mysql connector java jar
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
		try {
			//create a connection between the application and the database
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vocabulary", "Caesar", "Caesar@8964");
			//define a Statement object
			Statement stm = con.createStatement();
			//execute a statement and create a ResultSet object to hold the result
			//ResultSet result = stm.executeQuery("SELECT word, phoneticSymbol, englishMeaning, chineseMeaning, sentenceA, sentenceB, sentenceC, noun, verb, adjective, adverb FROM vocabulary");
			
			//next method returns a boolean whether to the last row
			/*
			while(result.next()) {
				//an iteration of column word, phoneticSymbol, englishMeaning, chineseMeaning, sentenceA, sentenceB, sentenceC, noun, verb, adjective and adverb
				for(int i = 1; i < 11; i++)
					System.out.print(result.getString(i) + "\t");
				System.out.println("\n****************");
			}
			*/
			
			//print id = 101
			ResultSet result = stm.executeQuery("SELECT word FROM vocabulary WHERE id = " + Integer.toString(1 * 100 + 1));
			if(result.next())
				System.out.println(result.getString(1));
				
			
			//close the ResultSet object
			result.close();
			//close the Statement object
			stm.close();
			//close the Connection object
			con.close();
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}