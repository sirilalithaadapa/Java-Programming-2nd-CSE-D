/* 
	Multi line Comments
	This a demo for simple if
*/
import java.io.*;
// Single Line Comment

public class SimpleIfDemo{
	public static void main(String args[]){
		System.out.println("Program started");
		System.out.println("Enter marks of C Course");
		int x = Integer.parseInt(args[0]);
		if( x >= 40){
			System.out.println("Student Passed the examination");
		}
		System.out.println("Hello");
		System.out.println("Program ended");
	}
}
