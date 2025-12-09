package com.string;

public class ReverseWords {
	void main(){
	    String str =IO.readln();

	    String arr[] = str.split(" ");

	    for(int i=0;i<arr.length;i++){

	       for(int j=arr[i].length()-1;j>=0;j--){
	        IO.print(arr[i].charAt(j));
	       }
	       IO.print(" ");
	    }
	}
}
