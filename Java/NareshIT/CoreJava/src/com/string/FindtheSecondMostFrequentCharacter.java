package com.string;

public class FindtheSecondMostFrequentCharacter {
	void main(){
	    String str = IO.readln();

	    if(str.length()<=1){
	        IO.println("-1");
	        System.exit(0);
	    }

	    int arr[] = new int[26];

	    for(int i=0;i<str.length();i++){
	        arr[str.charAt(i)-'a']++;
	    }
	    int max=0;
	    int secmax = 0;
	    int index=0;
	    int secindex=0;
	    for(int i=0;i<arr.length;i++){
	        int temp = arr[i];
	        if(temp > max){
	            secmax = max;
	            secindex =index;
	            max = temp;
	            index=i;
	        }
	        else if(temp>secmax && temp<max){
	            secmax = temp;
	            secindex =i;
	        }
	    }

	    IO.println((char)('a'+secindex));

	}
}
