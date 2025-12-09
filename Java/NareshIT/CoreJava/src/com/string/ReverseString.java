 package com.string;

 public class ReverseString{

void main(){
    String str = IO.readln();
    IO.print("Reversed String: ");
    for(int i=str.length()-1;i>=0;i--){
        IO.print(str.charAt(i));
    }
}
}