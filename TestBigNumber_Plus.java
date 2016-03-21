//U10416019鄭文琪

import java.util.Scanner;

public class TestBigNumber_Plus{
	public static void main(String[] args){
		//create a scanner
		Scanner input = new Scanner(System.in);
		
		//let the user enter two numbers
		System.out.println("Please enter two integer numbers to plus.");
		System.out.println("First number : ");
		String firstNumber = input.next();
		System.out.println("Second number : ");
		String secondNumber = input.next();
		
		//create a variable plus to call BigNumber_Plus class
		BigNumber_Plus plus = new BigNumber_Plus(firstNumber, secondNumber);
		
		//print the total
		System.out.print("The total is : ");
		plus.printTotal();
		System.out.println("");
		
	}
}