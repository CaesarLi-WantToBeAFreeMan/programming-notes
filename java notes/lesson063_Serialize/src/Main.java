/*
 * Lesson sixty-three: Serialize
 * Date: July 14, 2024
 * Author: Caesar James Lee
 * Teacher: Bro Code
*/

public class Main {
	public static void main(String[] args) {
		//Serialization:	converting an object into a byte stream
		//					persists (saves the state) the object after program exits
		//					this byte stream can be saved as a file or sent over a network
		//					can be sent to a different machine
		//					byte stream can be saved as a file (.ser) which is platform independent
		//					(thick of this as if you're saving a file with the object's information)
		
		//Deserialization:	the reverse process of converting a byte stream into an object
		//					(thick of this as if you're loading a saved file)
		
		//steps to serialize
		//I.	your object class should implement Serializable interface
		//II.	add import java.io.Serializable
		//III.	FileOutputStream fileOutputSystem = new FileOutputStream(filePath);
		//IV.	ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		//V.	objectOutputStream.writeObject(objectName);
		//VI.	objectOutputStream.close();
		//VII.	fileOutputSystem.close();
		
		//steps to deserialize
		//I.	declare your object (don't instantiate, or in other words, ClassName objectName = null;)
		//II.	your class should implement serializable interface
		//III.	add import java.Serializable
		//IV.	FileInputStream fileInputStream = new FileInputStream(filePath);
		//V.	ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		//VI.	objectName = (ClassName) objectInputStreamObject.readObject();
		//VII.	objectInputStream.close();
		//VIII.	fileInputStream.close();
		
		//notes of Serialization
		//I.	children classes of a parent class that implement Serializable will do so as well
		//II.	static fields are not serialized (they belong to the class, not an individual object)
		//III.	the class's definition ("class file") itself is not recorded, cast it as the object type
		//IV.	fields declared as "transient (短暫)" aren't serialized, they're ignored
		
		//			e.g. if we declare transient dataType variableName;
		//			this variable isn't recorded to the byte file, because it's ignored
		
		//V.	serialVersionUID is a unique version ID like a version #
		//			verifies that the sender and receiver of a serialized object,
		//			have loaded classes for that object that match
		//			ensures object will be compatible between machines
		//			number must match.	otherwise this will cause a InvalidClassException
		//			a serialVersionUID will be calculated based on a class properties, members, etc.
		//			a serializable class can declare its own serialVersionUID explicitly
		
		//to get an object's serialVersionUID
		//long serialVersionUID = ObjectStreamClass.lookup(objectName.getClass()).getSerialVersionUID();
		
		//and we can specify a serialVersionUID
		//private static final long serialVersionUID = aLongNumber;
		
		new Window();
	}
}