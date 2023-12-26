import java.util.Arrays;
public class permutation_or_not {
    // public static boolean permutation(String str1, String str2) {
        
    //     if(str1.length()!=str2.length())
    //     {
    //         return false;
    //     }
    //     char ch1[]=str1.toCharArray();
    //     char ch2[]=str2.toCharArray();

        
    //     Arrays.sort(ch1);
    //     Arrays.sort(ch2);
    //     for(int i=0;i<ch1.length;i++)
    //     {
    //        if(ch1[i]!=ch2[i])
    //        {
    //             return false;
    //        }
    //     }
    //     return true;
    // }

    // public static void main(String[] args) {
    //     String str1="abcde";
    //     String str2="cbeda";
        
    //     if(permutation(str1, str2))
    //     {
    //         System.out.println("yes");
    //     }
    //     else{
    //         System.out.println("no");
    //     }  
    // }











    public static void main(String[] args) {
        
        String str1="abcddth";
        String str2="cdabdht";
        int flag=0;

       
        int arr[]=new int[26];

        for(int i=0;i<str1.length();i++)
        {
            arr[str1.charAt(i)-'a']++;
        }

        for(int j=0;j<str2.length();j++)
        {
            arr[str2.charAt(j)-'a']--;

        }
        
        for(int i=0;i<str2.length();i++)
        {
            if(arr[i]!=0)
            {
                flag=1;
            }
        }

        if(flag==0)
        {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        

    }


}