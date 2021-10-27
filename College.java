import java.util.Scanner;
/**
 * College class creation 
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
public class College {//College class creation

	/**
	 *College class Variable Declaration
	 *
	 * @param CollegeName Variable to store College Name of the students
	 * @param students Variable to store Students as an array
	 * @param choice Variable to store the input as a choice
	 */
	
	//Variable Declaration
	String CollegeName;
	Student[] students;
	int choice;
	
	//Parameterized constructor to get College name
	College(String CollegeName, int numStudents){
		this.CollegeName = CollegeName;
		students = new Student[numStudents];
	}
	
	//Print method to print title and the Header row of the output.
	public void printTitle(String CollegeName) {
		System.out.println();
		System.out.printf("%s - List of Students\n", CollegeName);
		System.out.println("************************************");
		System.out.printf("   Program|Student#|           Name|          Email|          Phone|   GPA|      Fees|  Credits|\n");
	}
	
	//Method created to read details of all students.(in a for loop)
	public void readStudentDetails() {
		
		for(int i = 0; i <students.length; i++) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter details of student "+ (i+1) + ": ");
			System.out.print("\n===========================");
			System.out.print("\n1) Full Time Student \n2) Part Time Student\n");
			System.out.print("Enter Student type: ");
			choice = input.nextInt();
			
			switch(choice) {
				
			case 1:
				students[i] = new FulltimeStudent();
				students[i].readInfo();
				break;
			case 2:
				students[i] = new ParttimeStudent();
				students[i].readInfo();
				break;
			default:
				System.out.println("Wrong student type!");
				i--;
				break;
			}
		}
	}
	
	//Method include a for loop to call printInfo() for all students in students[] array
	public void printStudentDetails() {
		for(Student student : students) {
			student.printInfo();
		}
	}	
}//End of College class
