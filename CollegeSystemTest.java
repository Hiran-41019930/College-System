import java.util.Scanner;

/**
 * Driver Class to test the Program
 * 
 * @author Dadallage Samarasinghe
 * @version 1.0
 * @see Person
 * @see PoliciesInterface
 * @see Student
 * @see FulltimeStudent
 * @see ParttimeStudent
 * @see College 
 */

/* 
 * This project is to create a College system. 
 * Student: Dadallage Samarasinghe
 * Course : CST8132
 * Section: 300
 * Date   : June 19, 2021
 */

public class CollegeSystemTest {//CollegeSystemTest creation
	
	/**
	 * Main method to run the College System Program
	 * 
	 * @param args Variable to store command line arguments
	 */
	 

	public static void main(String[] args) {//Main method creation
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter name of College: ");
		String name = input.nextLine();
		
		System.out.print("Enter number of students: ");
		int n = input.nextInt();
		College c1 = new College(name,n);
		
		c1.readStudentDetails();
		c1.printTitle(name);
		c1.printStudentDetails();
		input.close();
	}//End of Main method
	
}// End of CollegeSystemTest
