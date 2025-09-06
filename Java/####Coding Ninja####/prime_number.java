public class prime_number {
    
<<<<<<< HEAD
    // public static void main(String[] args) {
    //     int n=10;
    //     int m =n/2;
    //     int flag=0;
    //         if(n==0||n==1)
    //         {
    //             System.out.println(n+" is not prime");
    //         }
    //         else{
    //             for(int i=2;i<m;i++)
    //             {
    //             if(n%i==0)
    //             {
    //                 System.out.println(n+" is not prime");
    //                 flag=1;
    //                 break;
    //             }
    //         }
    //         if(flag==0)
    //         {
    //             System.out.println(n+" is prime");
    //         }
    //     }
    // }
=======
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
>>>>>>> 14277af224bc42bca1a69127bd87ea043017ea37













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




<<<<<<< HEAD
    public static void main(String[] args) {
        int n = 10;
        printPrimeStatus(n);

        printPrimeNumbers(20);
    }

    public static void printPrimeStatus(int n) {
        if (n <= 1) {
            System.out.println(n + " is not prime");
        } else {
            boolean isPrime = true;
            for (int i = 2, m = n / 2; i <= m; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.println(n + " is " + (isPrime ? "prime" : "not prime"));
        }
    }

    public static void printPrimeNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + ",");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2, m = n / 2; i <= m; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }




=======
>>>>>>> 14277af224bc42bca1a69127bd87ea043017ea37
}
