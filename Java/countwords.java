import java.util.Scanner;
public class countwords {

    public static void countWords(String str,int n)
    {
        for(int i=0;i<str.length();i++)
        {
            // if(str.charAt(i)=='a')
            // {
            //     continue;
            // }
            // else if(str.charAt(i)=='e')
            // {
            //     continue;
            // } 
            // else if(str.charAt(i)=='i')
            // {
            //     continue;
            // } 
            // else if(str.charAt(i)=='o')
            // {
            //     continue;
            // } 
            // else if(str.charAt(i)=='u')
            // {
            //     continue;
            // }
            // else{
            //     n++;
            // }

            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                continue;
            }
            else{
                n++;
            }
        }
        System.out.println("words"+n);
    }
    public static void main(String[] args)
    {
       String str = new String();
       Scanner sc =new Scanner(System.in);
       System.out.println("enter String");
       str=sc.nextLine();

        countWords(str, 0);
    }
    
}
