package com.string;

public class CheckWhetherStringContainsAnyVowel{
void main(){
    String str = IO.readln();
    str = str.toLowerCase();
    if(str.charAt(0)>='0' && str.charAt(0)<='9'){
        IO.println("No letters");
        System.exit(0);
    }
    
    for(int i=0;i<str.length();i++){
        String ch = String.valueOf(str.charAt(i));
        
        if(ch.equals("a")||ch.equals("e")||ch.equals("i")||ch.equals("o")||ch.equals("u")){
            IO.println("Contains vowels");
            System.exit(0);
        }
    }
        IO.println("No vowels found");
}

}