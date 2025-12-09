 package com.string;

 public class PrintDuplicateCharactersandTheirCount{
void main(){
    String str = IO.readln();
    IO.println("Duplicate Characters:");

    int ch[] = new int[26];

    for(int i=0;i<str.length();i++){
        ch[str.charAt(i)-'a']++;
    }

    for(int j=0;j<str.length();j++){
        char c = str.charAt(j);
        int index = c - 'a';
        if(ch[index]>1){

        IO.println(c+" = "+ch[index]);
        ch[index]=0;
        }
    }
    

    /*char arr[] = str.toCharArray();

     for(int i=0;i<arr.length;i++)
     {
        int count = 1;
        boolean flag = true;

         for(int j=0; j<arr.length;j++)
         {
            if(arr[i] == arr[j] && i<j) count++;
            if(arr[i] == arr[j] && i>j) flag =false;
         }
         if(flag && count > 1)
         {
         IO.println(arr[i]+" = "+count);
         }

     }
*/



}
 }
