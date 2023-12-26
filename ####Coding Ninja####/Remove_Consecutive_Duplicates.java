public class Remove_Consecutive_Duplicates {
    public static void RemoveDuplcates(String str)
    {
        String NewString ="";
        NewString+=str.charAt(0);
        int n=NewString.length();
        int m=n-1;
        for(int  i=1;i<str.length();i++)
        {
            if(NewString.charAt(m)!=str.charAt(i))
            {
                NewString+=str.charAt(i);
                m++;
            }
        }
        System.out.println(NewString);
    }

    public static void main(String[] args) {
        String str ="aabassd";
        RemoveDuplcates(str);
    }











    // public static String dublicate(String s){
//     if(s.length()<=1)
//     {
//     return s;
//     }
//     String str=dublicate(s.substring(1));

//     if(s.charAt(0)==s.charAt(1))
//     {
//         return  str;
//     }
//     else{
//     return s.charAt(0)+str;
//     }
// }
//     public static void main(String[] args) {
//         String s="aabccdb";
//         System.out.println(dublicate(s));
        
//     }







// public static void main(String[] args) {
//     String str = "aabbccdedeeff";
//     String result = removeContiguousDuplicates(str);
//     System.out.println(result);
// }

// public static String removeContiguousDuplicates(String str) {
//     if (str == null || str.length() == 0) {
//         return str;
//     }
    
//     StringBuilder sb = new StringBuilder();
//     char prevChar = str.charAt(0);
//     sb.append(prevChar);
    
//     for (int i = 1; i < str.length(); i++) {
//         char currChar = str.charAt(i);
//         if (currChar != prevChar) {
//             sb.append(currChar);
//             prevChar = currChar;
//         }
//     }
    
//     return sb.toString();
// }


    
}
