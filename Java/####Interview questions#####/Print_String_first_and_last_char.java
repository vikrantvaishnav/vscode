
public class Print_String_first_and_last_char {
    public static void firstANDlastchar(String str, int index)
    {
        if(index==str.length())
        {
            return;
        }
        if(index==0||index==str.length()-1)
        {
        System.out.print(str.charAt(index));
        }
        firstANDlastchar(str, index+1);
        
        
    }
    public static void main(String[] args) {
            String str = "hello";
            firstANDlastchar(str, 0);
    }
}
