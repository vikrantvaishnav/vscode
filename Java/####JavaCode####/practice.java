public class practice{

    // public static void patterns(int n){
    //     /*
    //         * 
    //         * *
    //         * * *
    //         * * * *
    //         * * * * * 
    //      */

    //      int i=1; 
    //     while (i<=n) {
    //         int j=1;
    //         while (j<=i) {
    //             System.out.print("*");
    //             j++;
    //         }
    //         i++;
    //         System.out.println();
    //     }

    // }

    // public static void main(String[] args) {
    //            int num = 5; // number of rows in pattern
    //           patterns(num);
    // }






    
    // public static void main(String [] args){
    //     int n=5;
    //     System.out.println(args.length);
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < n; j++) {
    //             System.out.print("* ");
                
    //         }
    //         System.out.println();
            
    //     }
    // }









/*
   * * * * *
   *       *
   *       *
   * * * * *
 */

    // public static void main(String[] args) {
        
    //     int n=5;
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=n;j++){
    //             if (i==1||i==n||j==1||j==n) {
    //                 System.out.print("* ");
    //             } else {
    //                 System.out.print("  ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }











/*
   * * * * * 
   * * * *
   * * *
   * *
   * 
 */


    // public static void main(String [] args){
    //     int n=5;
    //     int i=1;
    //     while(i<=n)
    //     {

    //         int j=n;
    //         while(j>=i){
    //             System.out.print("* ");
    //             j--;
    //         }
    //         i++;
    //         System.out.println();
    //     }
    // }











/*
        *
      * *
    * * *
  * * * *
* * * * *

 */


    // public static void main(String[] args){
    //     int n=5;
    //     int i=1;

    //     while(i<=n){
    //         int j=n;
    //         while(j>=i){
    //             System.out.print("  ");
    //             j--;
    //         }

    //          j=1;
    //          while(j<=i)
    //          {
    //             System.out.print("* ");
    //             j++;
    //          }
    //          i++;
    //          System.out.println();

    //     }
    // }

 
    












/*
    1
    1 2
    1 2 3
    1 2 3 4 
    1 2 3 4 5 
 */


    // public static void main(String[] args){
    //     int n=5;
    //     int i=1;
    //     while(i<=n){
    //         int j=1;
    //         while(j<=i){

    //             System.out.print(j);
    //             j++;
    //         }
    //         i++;
    //         System.out.println();
    //     }
    // }










/*
    1
    1 2 3
    1 2 3 4 5
    1 2 3 4 5 6 7 
*/   

    // public static void main(String[] args){
    //    int n=5;
    //    int i=1;
    //    while(i<=n){
    //     int j=1;
    //     while(j<=(2*i-1)){
    //         System.out.print(j);
    //         j++;
    //     }
    //     i++;
    //     System.out.println();
    //    } 
    // }













/*
     1
    2 2
   3 3 3
  4 4 4 4
 5 5 5 5 5

 */

 
    // public static void main(String[] args){
    //     int n=5;
    //     int i=1;
    //     while(i<=n){
    //         int j=n;
    //         while(j>=i){
    //             System.out.print(" ");
    //             j--;
    //         }
    //         j=n;
    //         while(j>(n-i)){
    //             System.out.print(i+" ");
    //             j--;
    //         }
    //         i++;
    //         System.out.println();
    //     }
    // }













/*
    Floyd's triangle
    1
    2  3
    4  5  6
    7  8  9  10
    11 12 13 14 15
 
 */


    // public static void main(String[] args){
    //     int n=5;
    //     int i=1;
    //     int x=1;
    //     while(i<=n){
    //         int j=1;
    //         while(j<=i){
    //             System.out.print(x+" ");
    //             x++;
    //             j++;
    //         }
    //         i++;
    //         System.out.println();
    //     }
    // }











/*
   1
   0 1
   1 0 1
   0 1 0 1
   1 0 1 0 1
 */


    //    public static void main(String[] args){
    //     int n=5;
    //     int i=1;
    //     while(i<=n){
    //         int j=1;
    //         while(j<=i){
    //             if((i+j)%2==0){
    //                 System.out.print("1 ");
    //             }else{
    //                 System.out.print("0 ");
    //             }
    //             j++;
    //         }
    //         i++;
    //         System.out.println();
    //     }
    //    } 











/* 1 2 3 4
   2 3 4 5
   3 4 5 6
   4 5 6 7 
*/ 


    // public static void main(String[] args){
    //     int n=5;
    //     int i=1;
    //     while(i<=n){
    //         int j=1;
    //         int x=i;
    //         while(j<=n){
    //             System.out.print(x+" ");
    //             x++;
    //             j++;
    //         }
    //         i++;
    //         System.out.println();
    //     }
    // }







        





/*
   E
   D E
   C D E 
   B C D E
   A B C D E
 */

    // public static void main(String[] args){
    //     int n=5;
    //     int i=1;
    //     while(i<=n){
    //         int z=i;
    //         int j=1;
    //         while(j<=i){
    //             System.out.print((char)('A'+n-z));
    //             z--;
    //             j++;
    //         }
    //         i++;
    //         System.out.println();
    //     }
    // }














/*
   1 2 3 4 4 3 2 1 
   1 2 3     3 2 1 
   1 2         2 1 
   1             1 
 */


    // public static void main(String [] args){
    //   int n=5;
    //   for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n-i+1;j++){
    //         System.out.print(j);
    //     } 
    //     for(int j=1;j<=2*i-2;j++){
    //       System.out.print(" ");
    //     }
    //     for(int j=n-i+1;j>=1;j--){
    //       System.out.print(j);
    //     }
    //     System.out.println();
    //   }
    // }














/*
   1 2 3 4 5 4 3 2 1 
   1     4   4     1
   1   3       3   1
   1 2            2 1 
   1                1
 */




    // public static void main(String [] args){
    //   int n=7;
    //   for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n-i+1;j++){
          
    //       if(i==1||j==1||j==n-i+1){
    //         System.out.print(j);
    //       }
    //       else{
    //         System.out.print(" ");
    //       }
    //     } 
    //     for(int j=1;j<=2*i-3;j++){
    //       System.out.print(" ");
    //     }
    //     for(int j=n-i+1;j>=1;j--){
    //       if(j==n){
    //         continue;
    //       }
    //       if(i==1||j==1||j==n-i+1){
    //         System.out.print(j);
    //       }
    //       else{
    //         System.out.print(" ");
    //       }
    //     }
    //     System.out.println();
    //   }
    // }


















//Factorial of a number

    // public static void factorial(int num,int fact){
    //     if(num==0){
    //       System.out.println(fact);
    //       return;
    //     }
    //     factorial(num-1, fact*num);
    // }

    // public static void main(String[] args) {
    //   int num=4;
    //   factorial(num, 1);
    // }
















//Fibonacci series

    // public static void fibonacci(int a,int b,int n){
    //   if(n==0){
    //     return;
    //   }
    //   int temp =a+b;
    //   System.out.print(temp+",");
    //   fibonacci(b, temp, n-1);
    // }

    // public static void main(String[] args) {
    //   int n=5;
    //   int a=0;int b=1;
    //   System.out.print(a+","+b+",");
    //   fibonacci(a,b,n-2);
    // }



















// Tower of hanoi

    

}