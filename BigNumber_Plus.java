//U10416019鄭文琪

import java.util.ArrayList;

public class BigNumber_Plus{
	//data fields
	private ArrayList<Integer> total = new ArrayList<>();
	private ArrayList<Integer> first = new ArrayList<>();
	private ArrayList<Integer> second = new ArrayList<>();
	private String firstNumber;
	private String secondNumber;
	
	//create a constructor
	BigNumber_Plus(String firstNumber, String secondNumber){
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		setFirstNumber();
		setSecondNumber();
		setTotal();
		setPlusTotal();
	}

}