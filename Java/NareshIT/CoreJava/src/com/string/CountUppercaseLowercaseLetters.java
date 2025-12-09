package com.string;

public class CountUppercaseLowercaseLetters {
	void main(){
	    String str = IO.readln();
	    int upercase=0;
	    int lowercase=0;
	    boolean hasAlphabate=false;

	    if(str.isBlank()){
	        IO.println("Invalid Input");
	        System.exit(0);
	    }
	    
	    for(int i=0;i<str.length();i++){
	        if(Character.isLetter(str.charAt(i))){
	            hasAlphabate =true;

	            if(Character.isLowerCase(str.charAt(i))){
	            lowercase++;
	        }
	        }
	        if(Character.isUpperCase(str.charAt(i))){
	            upercase++;
	        }
	    }

	    if(!hasAlphabate){
	        IO.println("No alphabets found");
	        System.exit(0);
	    }

	    IO.println("Uppercase : "+upercase+"\nLowercase : "+lowercase);
	}
}
