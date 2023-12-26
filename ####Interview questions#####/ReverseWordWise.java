public class ReverseWordWise {
    
    
    public static void print(String ans)
    {
            System.out.print(ans);
            return;
    }
    public static void space(String ans, String str, int i)
    {
        int n= str.length();
        while(i<n && str.charAt(i)==' ')
        {
            i++;
        }


        if(i==n)
        {
            print(ans);
            return;
        }

            untillSpace(ans,str, i);
    
    }

    public static void untillSpace(String ans,String str ,int i)
    {
        int n=str.length();
        String s1="";
        while( i<n && str.charAt(i)!=' ')
        {
            s1=s1+str.charAt(i);
            i++;
        }

        if(i==n)
        {
            print(s1+" "+ans);
            return;
        }

            space(s1+" "+ans,str, i);

    }


    public static void main(String[] args) {
        String str ="  always   intend  alway      ";
        int i=0;

        if(str.charAt(i)!=' ')
        {
            untillSpace("",str, i);
        }
        else if(str.charAt(i)==' ')
        {
            space("",str, i);
        }
    
    }





















    // public static String wordwise(String str)
    // {
    //     String result="";
    //     int i=0;
    //     int n=str.length();

    //     while(i<n)
    //     {
    //         while(i<n && str.charAt(i)==' ' )
    //         {
    //             i++;
    //         }

    //         int j=i+1;
    //         while(j<n && str.charAt(j)!=' ')
    //         {
    //             j++;
    //         }

    //         String sub = str.substring(i, j);

    //         if(result.length() == 0)
    //         {
    //             result=sub;
    //         }
    //         else{
    //             result = sub+" "+result;
    //         }
    //         i=j+1;
    //     }
    //     return result;
    // }


    // public static void main(String[] args) {
    //     String str=" brave warrior";
    //     System.out.println(wordwise(str));

    // }
}
