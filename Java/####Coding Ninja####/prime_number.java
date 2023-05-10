public class prime_number {
    
    public static void main(String[] args) {
        int n=3;
        int m =n/2;
        int flag=0;
            if(n==0||n==1)
            {
                System.out.println(n+" is not prime");
            }
            else{
                for(int i=2;i<m;i++)
                {
                if(n%i==0)
                {
                    System.out.println(n+" is not prime");
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println(n+" is prime");
            }
        }
    }













// Print prime number in b/w 50

// public static void main(String[] args) {
//         int n=20;
//         for(int i=1;i<=n;i++)
//         {
//             int flag=0;
//             int x=i/2;
//             if(i==0||i==1)
//             {
//                 continue;
//             }
//             for(int j=2;j<=x;j++)
//             {
//                 if(i%j==0)
//                 {
//                     flag=1;
//                     break;
//                 }
//             }
//             if(flag==0)
//             {
//                 System.out.print(i+",");
//             }
//         }
//     }




}
