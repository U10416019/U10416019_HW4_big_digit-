//U10416019鄭文琪

import java.util.ArrayList;

public class BigFloat_Plus{
	//data fields
	private ArrayList<Integer> totalInt = new ArrayList<>();
	private ArrayList<Integer> totalFloat = new ArrayList<>();
	private ArrayList<Integer> firstInt = new ArrayList<>();
	private ArrayList<Integer> secondInt = new ArrayList<>();
	private ArrayList<Integer> firstFloat = new ArrayList<>();
	private ArrayList<Integer> secondFloat = new ArrayList<>();
	private String firstNumber;
	private String secondNumber;
	
	//create a constructor
	BigFloat_Plus(String firstNumber, String secondNumber){
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		setFirstInt();
		setSecondInt();
		setFirstFloat();
		setSecondFloat();
		setTotalInt();
		setTotalFloat();
		setPlusTotalFloat();
		setPlusTotalInt();
	}
	
	//create a mutator to let the first string become integer and add them in arraylist before the dot
	void setFirstInt(){
		for(int i = firstNumber.indexOf(".") - 1; i >= 0; i--){
			firstInt.add(Integer.valueOf(String.valueOf(firstNumber.charAt(i))));
		}
	}
	
	//create a mutator to let the second string become integer and add them in arraylist before the dot
	void setSecondInt(){
		for(int i = secondNumber.indexOf(".") - 1; i >= 0; i--){
			secondInt.add(Integer.valueOf(String.valueOf(secondNumber.charAt(i))));
		}
	}
	
	//create a mutator to add the numbers before dot
	public void setTotalInt(){
		//determine which arraylist is longer
		//if the second arraylist is smaller then add 0 util its length is the same with the first arraylist
		if(firstInt.size() > secondInt.size()){
			for(int i = secondInt.size(); i < firstInt.size(); i++){
				secondInt.add(0);
			}
		}
		//if the first arraylist is smaller then add 0 util its length is the same with the second arraylist
		else if(secondInt.size() > firstInt.size()){
			for(int i = firstInt.size(); i < secondInt.size(); i++){
				firstInt.add(0);
			}
		}
		
		//add the numbers of two arraylist
		for(int i = 0; i < firstInt.size(); i++){
			totalInt.add(firstInt.get(i) + secondInt.get(i));
		}
	}
	
	//create a mutator to let the first string become integer and add them in arraylist after the dot
	void setFirstFloat(){
		for(int i = firstInt.size() + 1; i < firstNumber.length(); i++){
			firstFloat.add(Integer.valueOf(String.valueOf(firstNumber.charAt(i))));
		}
	}
	
	//create a mutator to let the second string become integer and add them in arraylist after the dot
	void setSecondFloat(){
		for(int i = secondInt.size()+1; i < secondNumber.length(); i++){
			secondFloat.add(Integer.valueOf(String.valueOf(secondNumber.charAt(i))));
		}
	}
	
	//create a mutator to add the numbers after dot
	public void setTotalFloat(){
		//determine which arraylist is longer
		//if the second arraylist is smaller then add 0 util its length is the same with the first arraylist
		if(firstFloat.size() > secondFloat.size()){
			for(int i = secondFloat.size(); i < firstFloat.size(); i++){
				secondFloat.add(0);
			}
		}
		//if the first arraylist is smaller then add 0 util its length is the same with the second arraylist
		else if(secondFloat.size() > firstFloat.size()){
			for(int i = firstFloat.size(); i < secondFloat.size(); i++){
				firstFloat.add(0);
			}
		}
		
		//add the numbers of two arraylist
		for(int i = 0; i < firstFloat.size(); i++){
			totalFloat.add(firstFloat.get(i) + secondFloat.get(i));
		}
	}
	
	//create a mutator to add 1 when the arraylist number is over than 10 before the dot
	public void setPlusTotalInt(){
		for(int i = 0; i < totalInt.size() - 1; i++){
			if(totalInt.get(i) >= 10){
				totalInt.set(i + 1, totalInt.get(i + 1) + 1);
				totalInt.set(i, totalInt.get(i) % 10);
			}
		}
	}
	
	//create a mutator to add 1 when the arraylist number is over than 10 after the dot
	public void setPlusTotalFloat(){
		for(int i = totalFloat.size() - 1; i > 0; i--){
			if(totalFloat.get(i) >= 10){
				totalFloat.set(i - 1, totalFloat.get(i - 1) + 1);
				totalFloat.set(i, totalFloat.get(i) % 10);
			}
		}
		
		if(totalFloat.get(0) >= 10){
			totalFloat.set(0, totalFloat.get(0) % 10);
			totalInt.set(0, totalInt.get(0) + 1);
		}
	}
	
	//create a mutator print the total
	public void printTotal(){
		for(int i = totalInt.size() - 1; i >= 0; i--){
			System.out.print(totalInt.get(i));
		}
		System.out.print(".");
		for(int i = 0; i < totalFloat.size(); i++){
			System.out.print(totalFloat.get(i));
		}
	}
}