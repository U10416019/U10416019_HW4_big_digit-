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
	
	//create a mutator to let the first string become integer and add them in arraylist
	void setFirstNumber(){
		for(int i = firstNumber.length()-1; i >= 0; i--){
			first.add(Integer.valueOf(String.valueOf(firstNumber.charAt(i))));
		}
	}
	
	//create a mutator to let the second string become integer and add them in arraylist
	void setSecondNumber(){
		for(int i = secondNumber.length()-1; i >= 0; i--){
			second.add(Integer.valueOf(String.valueOf(secondNumber.charAt(i))));
		}
	}

}