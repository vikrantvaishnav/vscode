public class Pallindrome_String {
   
    public static void palindrome(String str ,String reverse, int index)
    {
        if(index==0)
        {
           reverse+=str.charAt(index);
           if(reverse.equals(str))
           {
            System.out.println("yes");
           }
           else{
            System.out.println("no");
           }
           return;
        }
        reverse+=str.charAt(index);
        palindrome(str, reverse, index-1);
       
    }
    public static void main(String[] args) {
        String str="eabcdcbae";
        int n=str.length()-1;
        palindrome(str,"", n);
    }










// String palindrome or not

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
    
}
