
public class Occurance_of_letter {
    public static int first=-1;
    public static int last=-1;
    public static void firstANDlastchar(String str, int index,char element)
    {
       
        if(index==str.length())
        {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if(str.charAt(index)==element)
        {
            if(first==-1)
            {
                first=index;
            }
            else{
                last=index;
            }  
        }
        firstANDlastchar(str, index+1,element);   
    }
    public static void main(String[] args) {
            String str = "abaacdaaafaah";
            firstANDlastchar(str, 0,'a');
    }
}
