package com.string;

public class CheckWhetherStringContainsDigit {
	void main(){
	    String str = IO.readln();

	    if(str.isBlank()){
	        IO.println("Invalid Input");
	        System.exit(0);
	    }

	    for(int i=0;i<str.length();i++){
	        if(Character.isDigit(str.charAt(i))){
	            IO.println("Contains Digit");
	            System.exit(0);
	        }
	    }
	    IO.println("No Digit");

	}
}