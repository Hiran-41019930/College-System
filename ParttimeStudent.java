import java.util.Scanner;
/**
 *  ParttimeStudent class creation.
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
public class ParttimeStudent extends Student{//ParttimeStudent class creation
	/**
	 *Variable declaration
	 *
	 * @param courseTotal Variable to store Course total of Part time students
	 * @param credits Variable to store Credits of Part time students
	 */
	//Variable Declaration
	double courseTotal;
	double credits;
	
	//Method to call readInfo() from superclass and also reads course fees and credit hours
	@Override
	public void readInfo() {
		Scanner input = new Scanner(System.in);
		super.readInfo();
		System.out.print("Enter total course fees: ");
		courseTotal = input.nextDouble();
		System.out.print("Enter credit hours: ");
		credits = input.nextDouble();
		
	}
	
	//Method to call readInfo() from superclass and also print course fees and credit hours
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.printf("%,10.2f| %8.2f|\n",courseTotal,credits);
	}
	
}//End of ParttimeStudent class
