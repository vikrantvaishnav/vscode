
public class Reverse_the_String {

    //              Recursion


    // public static void printrev(String str, int indx)
    // {
    //     if(indx==0)
    //     {
    //         System.out.print(str.charAt(indx));
    //         return;
    //     }
    //     System.out.print(str.charAt(indx));
    //     printrev(str, indx-1); 
    // }
    // public static void main(String[] args) {
    //     String str ="hello";
    //     printrev(str, str.length()-1); 
    // }






    // public static void reverse(String str,String rev, int index)
    // {
    //     if(index==0)
    //     {
    //         rev+=str.charAt(index);
    //         System.out.println(rev);
    //         return;
    //     }
    //     rev+=str.charAt(index);
    //     reverse(str,rev, index-1);
    // }
    // public static void main(String[] args) {
    //     String str="hello";
    //     int n=str.length()-1;
    //     reverse(str,"",n);
    // }







//                  String builder


    // public static String reverse(String str)
    // {
    //         StringBuilder sb = new StringBuilder(str);
    //         sb.reverse();
    //         return sb.toString();
    // }
    // public static void main(String[] args) {
    //         String str ="hello";
    //         System.out.println(reverse(str));
    // }





    // public static void reverse(String str)
    // {
    //         StringBuilder sb = new StringBuilder(str);
    //         sb.reverse();
    //         System.out.println(sb);
        
    // }
    // public static void main(String[] args) {
    //         String str ="hello";
    //         reverse(str);
    // }





    // public static void main(String args [])
    //     {
    //             String str ="abcdcba";
    //             StringBuilder sb = new StringBuilder(str);
    //             for(int i=0;i<=sb.length()/2;i++)
    //             {
    //                     int front = i;
    //                     int back = sb.length()-1-i;

    //                     char frontchar = sb.charAt(front);
    //                     char backchar = sb.charAt(back);

    //                     sb.setCharAt(front,backchar);
    //                     sb.setCharAt(back,frontchar);

    //             }
    //             System.out.println(sb);
    //     }




//                 To convert String into Char Array
    
//                String
    // public static void reverse(String str)
    // {
    //     char ch[]=str.toCharArray();
    //     //String rev="";
    //     for(int i=ch.length-1;i>=0;i--)
    //     {
    //         System.out.print(ch[i]);
    //         //rev+=ch[i];
    //     }
    //     // return rev;
    // }
    // public static void main(String[] args) {
    //     String str ="hello";
    //     // System.out.println(reverse(str));
    //     reverse(str);
    // }





//                  charAt function


    // public static String reverse(String str)
    // {
    //     String rev ="";
    //     for(int i=0;i<=str.length()-1;i++)
    //     {
    //         rev=str.charAt(i)+rev;
    //     }
    //     return rev.toString();
    // }
    // public static void main(String[] args) {
    //     String str="hello";
    //     System.out.println(reverse(str));
    // }










    
    








}
