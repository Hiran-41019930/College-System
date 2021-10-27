import java.util.Scanner;

/**
 * Student class extends Person class and implements PoliciesInterface class
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
public class Student extends Person implements PoliciesInterface{//Student class creation
	/**
	 * Student class variables
	 * 
	 * @param studentNumber Variable to store Student Number of students
	 * @param programName Variable to store Program Name of students
	 * @param gpa Variable to store gpa of students
	 */
	
	//Variable Declaration
	int studentNumber;
	String programName;
	double gpa;
	
	//Method read all student information and save them in instance variables.
	@Override
	public void readInfo() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter program name: ");
		programName = input.next();
		System.out.print("Enter student number: ");
		studentNumber = input.nextInt();
		System.out.print("Enter first name: ");
		firstName = input.next();
		System.out.print("Enter last name: ");
		lastName = input.next();
		System.out.print("Enter email Id: ");
		emailId = input.next();
		System.out.print("Enter phone number: ");
		phoneNumber = input.nextLong();
		input.nextLine();
		readMarks();
	}

	//read numbers of courses and then reads marks of all courses and stored them in a local double array.
	public void readMarks() {
		Scanner input = new Scanner(System.in);
		int courses;
		System.out.print("Enter number of courses: ");
		courses = input.nextInt();
		double[] marks = new double[courses];
		for(int i = 0; i <marks.length; i++) {
		System.out.print("Enter marks " + (i+1) + ": ");
		marks[i] = input.nextDouble();
		}
		
		calculateGpa(marks);
		
	}
	
	//Method is implementing from PoliciesInterface class, calculates the gpa and store it in the instance variable gpa.
	@Override
	public void calculateGpa(double[] array) {
		double sum =0;
		double average = 0;
		for(int i=0; i <array.length; i++){
			sum += array[i];
			average = sum/array.length;
		}
		gpa = (average * MAX_GPA)/MAX_MARKS;
	}
	
	//Method prints details of a student using formatted output
	@Override
	public void printInfo() {
		
		System.out.printf("%10s|%8d|%15s|%15s|%15d|%6.2f|",programName,studentNumber,firstName+" "+lastName,emailId,phoneNumber,gpa);
		
	}
	
}//End of Student class
