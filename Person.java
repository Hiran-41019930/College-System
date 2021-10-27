	/**
	 * Abstract class created to inherit with Student class
	 * 
	 * @author Dadallage Samarasinghe
	 * @version 1.0
	 */

/* 
 * This project is to create a College system. 
 * Student: Dadallage Samarasinghe
 * Course : CST8132
 * Section: 300
 * Date   : June 19, 2021
 */
public abstract class Person {//Person class creation

	/**
	 * Abstract class Variables
	 * 
	 * @param firstName
	 * @param lastName
	 * @param emailId
	 * @param phoneNumber
	 */
	
	//Instance variables
	 String firstName;
	 String lastName;
	 String emailId;
	 long phoneNumber;
	

	 //Abstract Methods creation
	public abstract void readInfo();
	public abstract void printInfo();
	

}//End of Person class.
