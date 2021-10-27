import java.util.Scanner;
/**
 * FulltimeStudent class creation
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
public class FulltimeStudent extends Student{//FulltimeStudent class creation
	/**
	 * FullltimeStudent class variables
	 * 
	 * @param tuitionFees Variable to store Student Fees of  Full time students
	 */
	
	//Variable declaration
	double tuitionFees;
	
	//Method to call readInfo() from superclass and also reads tuition fees
	@Override
	public void readInfo() {
		Scanner input = new Scanner(System.in);
		super.readInfo();
		System.out.print("Enter tuition fees: ");
		tuitionFees = input.nextDouble();
		
	}
	
	//Method to call printInfo() from superclass and then print tuition fees
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.printf("%10.2f|\n",tuitionFees);
	}
}//End of FulltimeStudent class
