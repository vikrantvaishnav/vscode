package com.string;

public class CountOccurrenceofaGivenCharacter{
void main(){
    String str = IO.readln();
    String ch = IO.readln();
    str = str.toLowerCase();
    int count=0;

    for(int i=0;i<str.length();i++){
        if(String.valueOf(str.charAt(i)).equals(ch) ){
            count++;
        }
    }
    IO.println("Occurrence of '"+ch+"' = "+count);
    
}
}