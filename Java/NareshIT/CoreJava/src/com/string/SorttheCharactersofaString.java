package com.string;

public class SorttheCharactersofaString {

void main(){
    String str = IO.readln();
    str = str.toLowerCase();

    int ch[] = new int[26];

    for(int i=0;i<str.length();i++){
        ch[str.charAt(i)-'a']++;
    }

    for(int i=0;i<ch.length;i++){
        while(ch[i]>0){
            IO.print((char)('a'+i));
            ch[i]--;
        }
    }
}
}