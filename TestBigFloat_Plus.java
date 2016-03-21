//U10416019鄭文琪

import java.util.Scanner;

public class TestBigFloat_Plus{
	public static void main(String[] args){
		//create a scanner
		Scanner input = new Scanner(System.in);
		
		//let the user enter two numbers
		System.out.println("Please enter two float numbers to plus.");
		System.out.println("First number : ");
		String firstNumber = input.next();
		System.out.println("Second number : ");
		String secondNumber = input.next();
		
		//create a variable plus to call BigFloat_Plus class
		BigFloat_Plus plus = new BigFloat_Plus(firstNumber, secondNumber);
		
		//print the total
		System.out.print("The total is : ");
		plus.printTotal();
		System.out.println("");
	}
}