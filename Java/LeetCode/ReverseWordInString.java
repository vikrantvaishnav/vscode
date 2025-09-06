package LeetCode;

public class ReverseWordInString {
    
    public static void reverse(char[] ch){
        
        String str = "";
        int i=0;
        int len = ch.length;
        while(i<len-1){
            String temp ="";
            while(i<len && ch[i] != ' '){
                temp = temp+(ch[i]);
                i++;
            }
            str = temp+" "+str;
            i++;
        }
        System.out.println(str);

    }


    public static void main(String[] args) {
        char[] ch ={'t','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e'};
        reverse(ch);
    }
}
