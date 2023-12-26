public class Pallindrome_String {
    // public static String palindrome(String str)
    // {
    //     String rev="";
    //     for(int i=str.length()-1;i>=0;i--)
    //     {
    //         rev+=str.charAt(i);
    //     }
    //     System.out.println(rev);
    //     return rev.toString();
    // }
    // public static void main(String[] args) {
    //     String str ="abcdcba";
    //     if(str.equals(palindrome(str)))
    //     {
    //         System.out.println("palindrome");
    //     }
    //     else{
    //         System.out.println("not palindrome");
    //     }
    // }








    // public static void palindrome(String str ,String reverse, int index)
    // {
    //     if(index==0)
    //     {
    //        reverse+=str.charAt(index);
    //        if(reverse.equals(str))
    //        {
    //         System.out.println("yes");
    //        }
    //        else{
    //         System.out.println("no");
    //        }
    //        return;
    //     }
    //     reverse+=str.charAt(index);
    //     palindrome(str, reverse, index-1);
       
    // }
    // public static void main(String[] args) {
    //     String str="eabcdcbae";
    //     int n=str.length()-1;
    //     palindrome(str,"", n);
    // }








    // public static void palindrome(String str)
        // {
        //    int i=0;
        //    int j=str.length()-1;
        //    while(i<=j)
        //    {
        //         if(str.charAt(i)!=str.charAt(j))
        //         {
        //             System.out.println("no");
        //             return;
        //         }
        //         else{
        //             i++;
        //             j--;
        //         }
        //    }
        //    System.out.println("yes");
        //    return;
        // }
        // public static void main(String[] args) {
        //     String str="abcba";
        //     palindrome(str);
        // }
    










    








    // public static boolean checkPalindrome(String str) {
	
    //     str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    
            
    //     int i = 0;
    //     int j = str.length() - 1;
    
    //     // Check for palindrome
    //     while (i <= j) {
    //         if (str.charAt(i) != str.charAt(j)) {
    //             return false;
    //         } else {
    //             i++;
    //             j--;
    //         }
    //     }
    //     return true;
         
    // }

















    class Solution {
        public boolean isPalindrome(String s) {
            int len = s.length();
            char[] arr = new char[len];
            int end = 0;
            for (int i = 0; i < len; i++) {
                char ch = s.charAt(i);
                int n = (int) ch;
                //System.out.println("ch: " + ch + " num: " + n);
                if (n >= 97 && n <= 122) {//Ascii value of 'a-z'
                    arr[end] = ch;
                    end++; 
                } else if (n >= 65 && n <= 90) {//Ascii value of 'A-Z'
                    arr[end] = (char)(n + 32);
                    end++; 
                } else if (n >= 48 && n <= 57) {//Ascii value of '0-9'
                    arr[end] = ch;
                    end++;
                }
            }
            // if (end == 1) return true;
            int halfLen = end / 2;
            //System.out.println("vars len:" + len + " end:" + end + " hL:" + halfLen);
            for (int i = 0, j = end - 1; i < halfLen; i++, j--) {
                //System.out.println(arr[i] + " " + arr[j]);
                if (arr[i] != arr[j]) return false;
            }
            return true;
        }
    }


    
}
