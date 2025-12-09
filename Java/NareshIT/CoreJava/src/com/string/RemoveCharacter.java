package com.string;

public class RemoveCharacter {
	
void main(){
    String str = IO.readln();
    String ch = IO.readln();
    String str1 ="";

    for(int i=0;i<str.length();i++){
        if(String.valueOf(str.charAt(i)).equals(ch)){
            continue;
        }
        else{
            str1+=str.charAt(i);
        }
    }
    if(str1.isBlank()){
        IO.println("empty");
    }
    IO.println(str1);
}
}