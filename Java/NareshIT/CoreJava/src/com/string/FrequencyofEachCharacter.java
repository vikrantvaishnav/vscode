package com.string;

public class FrequencyofEachCharacter {
	void main(){
	    String str = IO.readln();
	    if(str.isBlank()){
	        IO.println("Invalid Input");
	        System.exit(0);
	    }

	    for(int i=0;i<str.length();i++){
	        boolean flag = true;
	        int count=1;
	        char ch = str.charAt(i);
	        for(int j=0;j<str.length();j++){
	            if(ch == str.charAt(j) && i<j){
	                count++;
	            }
	            if(ch == str.charAt(j) && i>j){
	                flag = false;
	                break;
	            }
	        }

	        if(flag){
	            if(str.charAt(i)==' '){
	                IO.println("  : "+count);
	            }
	            else{
	                IO.println(ch+" : "+count);
	            }
	        }
	    }
	}
}
