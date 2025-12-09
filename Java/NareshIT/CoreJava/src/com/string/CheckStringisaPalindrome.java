package com.string;

public class CheckStringisaPalindrome {
	void main(){
	    String str = IO.readln();
	    if(str.isBlank()){
	        IO.println("Invalid Input");
	        System.exit(0);
	    }
	    char arr[] =str.toCharArray();

	        int i=0;
	        int j= arr.length-1;
	    
	        while(i!=j){
	            if(arr[i] != arr[j]){
	                IO.println("Not Palindrome");
	                System.exit(0);
	            }
	            else{
	               i++;
	               j--; 
	            }
	        }
	        IO.println("Palindrome");
	    
	}
}
