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
	
	//create a mutator to add two arraylist
	public void setTotal(){
		//determine which string is longer
		//if the second string is smaller then add 0 util its length is the same with the first string
		if(firstNumber.length() > secondNumber.length()){
			for(int i = secondNumber.length(); i < firstNumber.length(); i++){
				second.add(0);
			}
		}
		//if the first string is smaller then add 0 util its length is the same with the second string
		else if(secondNumber.length() > firstNumber.length()){
			for(int i = firstNumber.length(); i < secondNumber.length(); i++){
				first.add(0);
			}
		}
		
		//add the first and second arraylist
		for(int i = 0; i < first.size(); i++){
			total.add(first.get(i) + second.get(i));
		}
	}
	
	//create a mutator to add 1 when the arraylist number is over than 10
	public void setPlusTotal(){
		//determine whether the number of the arraylist is over than 10
		for(int i = 0; i < total.size() -1; i++){
			if(total.get(i) >= 10){
				total.set(i + 1, total.get(i+1) + 1);
				total.set(i, total.get(i) % 10);
			}
		}
	}
	
	//create a mutator to print the total
	public void printTotal(){
		for(int i = total.size() - 1; i >= 0; i--){
			System.out.print(total.get(i));
		}
	}
}