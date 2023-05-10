public class Print_all_Substring_of_a_String {
   
 //length of any substring of a String is    n(n+1)/2


    public static void substring(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            String sub ="";
            for(int j=i;j<str.length();j++)
            {
                sub+=str.charAt(j);
                System.out.println(sub);
            }
        }
    }
    public static void main(String[] args) {
        String str="xyz";
        substring(str);
    }
    
}
