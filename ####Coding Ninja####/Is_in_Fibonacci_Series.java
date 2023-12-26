public class Is_in_Fibonacci_Series {
// given number is in fibonacci series

    
    public static void isfibonaci(int n)
    {
        int a=0,b=1;
        int fibo[]=new int[n/2];
        for(int i=0;i<n;i++)
        {
            int temp=a+b;
                fibo[i]=temp;
                a=b;
                b=fibo[i];
            if(fibo[i]>=n)
            {
                break;
            }
            else{
                continue;
            }
        }
        for(int j=0;j<n;j++)
        {
            if(fibo[j]==n)
            {
                System.out.println("yes");
                break;
            }
            else if(fibo[j]!=n && fibo[j]>n ){
                System.out.println("no");
               break;
            }       
        }       
    }
    public static void main(String[] args) {
        int n= 21;
        isfibonaci(n);
    }
}
