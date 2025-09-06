public class Substring_of_String {
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
        String str="abc";
        substring(str);
    }
}
