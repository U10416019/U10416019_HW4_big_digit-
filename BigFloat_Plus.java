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

}