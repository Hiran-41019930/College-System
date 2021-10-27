/**
 * Interface Class creation to accepts a double array of marks.
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
public interface PoliciesInterface {//PoliciesInterface class creation
	/**
	 * Interface class variables
	 * 
	 * @param MAX_MARKs Variable for the max limit for a course mark
	 * @param MAX_GPA Variable for the max limit for gpa
	 */
	
	//Variable Declaration
	public static final double MAX_MARKS = 100;
	public static final double MAX_GPA = 4.0;
	
	//Method accepts a double array of marks.
	public void calculateGpa(double[] array);
}//End of the PoliciesInterface class
