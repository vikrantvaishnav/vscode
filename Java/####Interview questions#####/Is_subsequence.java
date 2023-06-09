
import java.io.*;
public class Is_subsequence {
    // Recursive Java program to check if a string
// is subsequence of another string
    // Returns true if str1[] is a subsequence of str2[]
    // m is length of str1 and n is length of str2
    // static boolean isSubSequence(String str1, String str2,
    //                              int m, int n)
    // {
    //     // Base Cases
    //     if (m == 0)
    //         return true;
    //     if (n == 0)
    //         return false;
 
    //     // If last characters of two strings are matching
    //     if (str1.charAt(m) == str2.charAt(n))
    //         return isSubSequence(str1, str2, m - 1, n - 1);
 
    //     // If last characters are not matching
    //     return isSubSequence(str1, str2, m, n - 1);
    // }
 
    // // Driver program
    // public static void main(String[] args)
    // {
    //     String str1 = "gkslek";
    //     String str2 = "geeksforgeek";
    //     int m = str1.length()-1;
    //     int n = str2.length()-1;
    //     boolean res = isSubSequence(str1, str2, m, n);
    //     if (res)
    //         System.out.println("Yes");
    //     else
    //         System.out.println("No");
    // }





    public static void subsequence(String str1,String str2,int m,int n)
    {
        if(m==0)
        {
            System.out.println("No");
            return;     
        }
        if(n==0)
        {
            System.out.println("yes");
            return;
        }

        if(str1.charAt(m)==str2.charAt(n))
        {
            subsequence(str1, str2, m-1, n-1);
        }
        else
         subsequence(str1, str2, m-1, n);

        
    }

    public static void main(String[] args) {
        String str1="hello how are you ";
        String str2="hloweu";
        int m=str1.length()-1;
        int n=str2.length()-1;
        subsequence(str1, str2, m, n);
    }
 }
