
//import Scanner Class 
import java.util.Scanner;

public class Program {

	/**
	 * @author liuma
	 * @param args
	 */
	public static void main(String[] args) {
		// 2 double variables innerRadius & outerRadius, a string named report
		double innerRadius;
		double outerRadius;
		String report;
		// create a new object named keyboard from Scanner
		Scanner keyboard = new Scanner(System.in);
		// create a new object named volume from class Motorcycle
		DonutVolume volume = new DonutVolume();

		// declare an int i, use it as a counter for  do...while..
		int i = 0;
		/*
		 * do while loop follows from examples in an online tutorial by javatpoint.com
		 * reference: Java do-while Loop
		 * https://www.javatpoint.com/java-do-while-loop.
		 */
		do {
			System.out.print("Please enter the inner radius: ");//output input instruction
			innerRadius = keyboard.nextDouble();// scan input for innerRadius
			/*
			 * if else statement follows from examples in an online tutorial by javatpoint.com
			 * reference: Java If-else Statement in Javatpoint
			 * https://www.javatpoint.com/java-if-else.
			 */
			if (innerRadius <= 0) {//if user entered a 0 or a negative number 
				//output a warning message
				System.out.println("The number you entered is not valid, please re-enter.");
				/*
				 * if user entered a valid number, 
				 * assign it to innerRadius by calling set method
				 */
			} else {
				volume.setInnerRadius(innerRadius);
				i++;// i self added by 1
			}
		} while (i < 1);// i is not less than 1, exit the loop

		// declare an int j to be used as a counter for do...while...
		int j = 0;

		// do...while loop starts
		do {
			//output "Please enter the outer radius:" 
			System.out.print("Please enter the outer radius: ");
			outerRadius = keyboard.nextDouble();// scan input for outerRadius
			/*
			 * if user entered a 0 or negative number, 
			 * output a warning message
			 */
			if (outerRadius <= 0) {
				System.out.println("The number you entered is not valid, please re-enter.");
				/*
				 * if user enter an outerRadius number less than innerRadius,
				 * output a warning message
				 */
			} else if (outerRadius < innerRadius) {
				System.out.println("The outer radius must be greater than the inner radius, please restart the program.");
				//terminate the whole program so that user can re-start 
				return;
				/*
				 * if user entered a valid number, 
				 * assign it to outerRadius by calling set method
				 */
			} else {
				volume.setOuterRadius(outerRadius);
				j++;//  j self added by 1
			}
		} while (j < 1);// j is not less than 1, exit the loop

		/*
		 * call toCalculate method in object volume to return a formatted string
		 * and assign the formatted string to String report 
		 */
		report = volume.toCalculate();
		System.out.println(report);//output report
		System.out.println("Program by Mengying Liu");//output signature
		keyboard.close();
	}

}
