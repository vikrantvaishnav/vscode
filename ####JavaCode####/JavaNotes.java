import java.rmi.server.SocketSecurityException;
import java.util.Scanner;
import java.io.*;
import java.lang.Math.*;
import javax.lang.model.util.ElementScanner6;

//   Static

        // public class JavaNotes {

        //         static int B,H;
        //         static boolean flag = true;
        //         static {
        //             Scanner sc = new Scanner(System.in);
        //             B = sc.nextInt();
        //             H = sc.nextInt();
        //             if(B<=0 || H<=0){
        //                 System.out.println("java.lang.Exception: Breadth and height must be positive");
        //                 flag = false;
        //             }
        //         }
        
        //     public static void main(String[] args){
        //                     if(flag){
        //                             int area=B*H;
        //                             System.out.print(area);
        //                     }
                        
        //             }//end of main
        
        //     }


public class JavaNotes 
{

        // public static void main(String[] args) {
        //         int x=5,y=6,z=9;
        //         int A=(x>y)?((x>z)?x:z):( (y>z)?y:z);
        //         System.out.println(A);
        //     }




        // public static void main(String[] args) {
        //         Scanner scan = new Scanner(System.in);
        //         int i = scan.nextInt();
        //         double d = scan.nextDouble();
        //         scan.nextLine();   //next line use 
        //         String s = scan.nextLine();
        //         scan.close();
        //         // Write your code here.
        
        //         System.out.println("String: " + s);
        //         System.out.println("Double: " + d);
        //         System.out.println("Int: " + i);
        //     }

// math file        

        // public static void main(String []argh){
        //         Scanner in = new Scanner(System.in);
        //         int t=in.nextInt();
        //         for(int i=0;i<t;i++){
        //             System.out.println("enter values");    
        //             int a = in.nextInt();
        //             int b = in.nextInt();
        //             int n = in.nextInt();
        //             int calc = a;
        //             for(int j=0;j<n;j++)
        //             {
        //                 calc+=(Math.pow(2,j)*b);
        //                 System.out.print(calc+" ");
        //             }
        //             System.out.println();
        //         }
        //         in.close();
        // }

// MIN_VALUE OR MAX_VALUE    //it use for get min. value of int,long.short.etc

        // public static void main(String []argh)
        // {
        //         Scanner sc = new Scanner(System.in);
        //         System.out.println("loop run time: ");
        //         int t=sc.nextInt();
        //         for(int i=0;i<t;i++)
        //         {

        //                 try
        //                 {
        //                         System.out.println("enter a value: ");
        //                         long x=sc.nextLong();
        //                         System.out.println(x+" can be fitted in:");
        //                         if(x>=-128 && x<=127)System.out.println("* byte");
        //                         if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE) 
        //                         {
        //                                 System.out.println("* short");
        //                         }
        //                         if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)
        //                         {
        //                                 System.out.println("* int");
        //                         }
        //                         if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)
        //                         {
        //                                 System.out.println("* long");
        //                         }
        //                 }
        //                 catch(Exception e)
        //                 {
        //                         System.out.println(sc.next()+" can't be fitted anywhere.");
        //                 }

        //         }
        // }



// END OF FILE (sc.hasNext())  it use for end of file

        
        // public static void main(String[] args) 
        // {
        //         Scanner sc = new Scanner(System.in);
        //         int i=1;
        //         while (sc.hasNext()) {
        //         System.out.println("enter string");
        //         String s=sc.nextLine();
        //         System.out.println(i + " " + s);
        //         i++;
        //         }
        // }


        
//     public static void main(String[] args)
//     {
    /*
       * 
       * *
       * * *
       * * * *
       * * * * * 
    */
        // int i,j;
        // int n=5;
        // for(i=1;i<=n;i++)
        // {
        //     for(j=1;j<=i;j++)
        //     {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

//Number odd or even
        

        // System.out.print("Enter any number: ");
        // Scanner sc = new Scanner(System.in);   
        // int n = sc.nextInt();
        // if(n%2==0)
        // {
        //     System.out.println(n+" is Even number");
        // }
        // else
        // {
        //     System.out.println(n+" is odd number");
        // }


//Q.take input from user A & B and find which is greater


        // System.out.println("Enter any two numbers");
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // if(a>b)
        // {
        //     System.out.println("A is greater than B");
        // }
        // else if(a==b)
        // {
        //     System.out.println("A and B are Equal");
        // }
        // else{
        //     System.out.println("B is greater than A");
        // }

// Switch case

        // System.out.println("Enter a number in between 1-3");
        // Scanner sc = new Scanner(System.in);
        // int n =sc.nextInt();
        // switch(n)
        // {
        //     case 1:System.out.println("hi");
        //     break;
        //     case 2:System.out.println("hello");
        //     break;
        //     case 3:System.out.println("namaste");
        //     break;
        //     default:System.out.println("Error");
        // }


//print the sum of first n natural number

        // int sum=0, i;
        // System.out.print("Enter a number: ");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for(i=0;i<=n;i++)
        // {
        //         sum = sum+i;
        // }
        // System.out.println("addition of first n natural numbers is: "+sum);


//print a table 

        // int n;
        // System.out.print("Enter a number: ");
        // Scanner sc = new Scanner(System.in);
        // n = sc.nextInt();
        // for(int i=1;i<=10;i++)
        // {
        //         int sum =n*i;
        //         System.out.println(n+"*"+i+"="+sum );
        // }


/*
   * * * * *
   * * * * *
   * * * * * 
   * * * * *                
*/

        // int n=4;
        // int i,j;
        // for(i=1;i<=n;i++)
        // {
        //         for(j=1;j<=n+1;j++)
        //         {
        //                 System.out.print("* ");
        //         }
        //         System.out.println();
        // }


/*
   * * * * *
   *       *
   *       *
   * * * * *
 */

        // int n=4;
        // int m=5;
        // int i,j;
        // for(i=1;i<=n;i++)
        // {
        //         for(j=1;j<=m;j++)
        //         {
        //                 if(i==1||i==n||j==1||j==m)
        //                 {
        //                         System.out.print("* ");
        //                 }
        //                 else{
        //                         System.out.print("  ");
        //                 }
        //         }
        //         System.out.println();
        // }


/*
   * * * * * 
   * * * *
   * * *
   * *
   * 
 */

        // int n=5;
        // int i,j;
        // for(i=n;i>=1;i--)
        // {
        //         for(j=1;j<=i;j++)
        //         {
        //                 System.out.print("* ");
        //         }
        //         System.out.println();
        // }


/*
        *
      * *
    * * *
  * * * *
* * * * *

 */


        // int n=5;
        // int i,j,k;
        // for(i=1;i<=n;i++)
        // {
        //         for(j=1;j<=n-i;j++)
        //         {
        //                 System.out.print("  ");
        //         }

        //         for(k=1;k<=i;k++)
        //         {
        //                 System.out.print("* ");
        //         }
        //         System.out.println();
        // }


/*
    1
    1 2
    1 2 3
    1 2 3 4 
    1 2 3 4 5 
 */

        
        // int n=5;
        // int i,j;
        // for(i=1;i<=n;i++)
        // {
        //         for(j=1;j<=i;j++)
        //         {
        //                 System.out.print(j+" ");
        //         }
        //         System.out.println();
        // }



/*
    1
    1 2 3
    1 2 3 4 5
    1 2 3 4 5 6 7 
*/        

        // int n=4;
        // int i,j;
        // for(i=1;i<=n;i++)
        // {
        //         for(j=1;j<=2*i-1;j++)
        //         {
        //                 System.out.print(j+" ");
        //         }
        //         System.out.println();
        // }


/*
     1
    2 2
   3 3 3
  4 4 4 4
 5 5 5 5 5

 */

        // int n=5;
        // int i,j,k;
        // for(i=1;i<=n;i++)
        // {
        //         for(j=1;j<=n-i;j++)
        //         {
        //                 System.out.print(" ");
        //         }
        //         for(k=1;k<=i;k++)
        //         {
        //                 System.out.print(i+" ");
        //         }
        //         System.out.println();
        // }



/*
    Floyd's triangle
    1
    2  3
    4  5  6
    7  8  9  10
    11 12 13 14 15
 
 */


        // int n=5;
        // int i,j;
        // int number =1;
        // for(i=1;i<=n;i++)
        // {
        //         for(j=1;j<=i;j++)
        //         {
        //                 System.out.print(number+" ");
        //                 number++;
        //         }
        //         System.out.println();  
        // }



/*
   1
   0 1
   1 0 1
   0 1 0 1
   1 0 1 0 1
 */

        
        // int n=5;
        // int i,j;
        // for(i=1;i<=n;i++)
        // {
        //         for(j=1;j<=i;j++)
        //         {
        //                 if((i+j)%2==0)
        //                 {
        //                         System.out.print("1 ");
        //                 }
        //                 else{
        //                         System.out.print("0 ");
        //                 }
        //         }
        //         System.out.println();
        // }

//Q. Sum of given digits

        
        // int n;
        // System.out.print("Enter any number: ");
        // Scanner sc = new Scanner(System.in);
        // n = sc.nextInt();
        // int p =n;
        // int sum=0;
        // while(n>0)
        // {
        //         sum= sum+n%10;
        //         n=n/10;
        // }
        // System.out.println("Sum of given digit "+p+" is: "+sum);


// fibonacci series 


//         int a=0;
//         int b=1;
//         int sum=1;
//         int n;
//         System.out.print("Enter a number: ");
//         Scanner sc =new Scanner(System.in);
//         n= sc.nextInt();
//         while(sum<=n)
//         {
//                 System.out.print((" "+sum));
//                 sum=a+b;
//                 a=b;
//                 b=sum;
//         }

//     }


//Functions


        //public static void PrintName(String name)
        // {
        //         System.out.println(name);
        // }
        // public static void main(String [] args)
        // {
        //         System.out.println("Enter your name");
        //         Scanner sc = new Scanner(System.in);
        //         String name =sc.nextLine();
        //         PrintName(name);
        // }



//String

        // public static void main(String args[]) {
        // String name1 = "ToNy";
        // String name2 = "ToNy";
  
        // if(name1.equals(name2)) {
        //     System.out.println("They are the same string");
        // } else {
        //     System.out.println("They are different strings");
        // }
        // System.out.println(name1.compareTo(name2));
        // if(name1.compareTo(name2)==0||name1.compareTo(name2)==-32)
        // {
        //         System.out.println("They are the same string");
        // }
        // else
        // {
        //         System.out.println("They are different string");
        // }
        

  
        //DO NOT USE == to check for string equality
        //Gives correct answer here
        // if(name1 == name2) {
        //     System.out.println("They are the same string");
        // } else {
        //     System.out.println("They are different strings");
        // }
  
        // //Gives incorrect answer here
        // if(new String("Tony") == new String("Tony")) {
        //     System.out.println("They are the same string");
        // } else {
        //     System.out.println("They are different strings");
        // }
        //   }


        
        // public static void main(String args[]) 
        // {
        //         String str = "123";
        //         int number = Integer.parseInt(str);
        //         System.out.println(number);                   
           
        // }
             



/* 1 2 3 4
   2 3 4 5
   3 4 5 6
   4 5 6 7 
*/        
        //public static void main(String [] args)
        //{
                
                // char i,j;
                // for(i=1;i<=4;i++)
                // {
                //         for(j=1;j<=4;j++)
                //         {
                //                 //System.out.print(i+j-1);
                //                 System.out.print((char)('A'+j-1+i-1));// if we initialize i and j=0 than the condition will be (A+i+j)
                                

                //         }
                //         System.out.println();
                // }
        //}


        /*
           A
           B B
           C C C
           D D D D
        */        

        // public static void main(String [] args)
        // {
                
                // char i,j;
                // for(i='A';i<='D';i++)
                // {
                //         for(j='A';j<=i;j++)
                //         {
                //                 System.out.print(i);
                                

                //         }
                //         System.out.println();
                // }

                                //OR
                // int i,j;
                // for(i=1;i<=4;i++)
                // {
                //         for(j=1;j<=i;j++)
                //         {
                //                 System.out.print((char)('A'+i-1));
                                
                
        //                 }
        //                 System.out.println();
        //         }
        // }


/*
   E
   D E
   C D E 
   B C D E
   A B C D E
 */


        // public static void main(String [] args)
        // {
        //         int n=5;
        //         int i,j;
        //         for(i=1;i<=n;i++)
        //         {       int a=i;
        //                 for(j=1;j<=i;j++)
        //                 {

        //                         System.out.print((char)('A'+n-a));
        //                         a--;
        //                 }
        //                 System.out.println();

        //         }
        // } 


/*
   1 2 3 4 4 3 2 1 
   1 2 3     3 2 1
   1 2         2 1 
   1             1 
 */

        // public static void main(String args [])
        // {
        //         int n=4;
        //         int i,j;
        //         for(i=n;i>=1;i--)
        //         {
        //                 for(j=1;j<=i;j++)
        //                 {
        //                         System.out.print(j+" ");
                        
        //                 }
        //                 for(int k=n;k>=2*i-3;k--)
        //                 {
        //                         System.out.print("  ");
        //                 }
        //                 for(int k=i;k>=1;k--)
        //                 {
        //                         System.out.print(k+" ");
                
        //                 }
        //                 System.out.println();

        //         }
                

// String Builder

        // public static void main(String [] args)
        // {
        //         StringBuilder sb = new StringBuilder("Tony");
        //         System.out.println(sb);

        // charAt Function
                // System.out.println(sb.charAt(0));

        // setCharAt Function
                // sb.setCharAt(0,'p');  // replace the charater
                // System.out.println(sb);

        //  insert Function
                // sb.insert(1,'o');   // Insert the charater and shift the whole string
                // System.out.println(sb);

        //  delete Function
                // sb.delete(2, 3);
                // System.out.println(sb);

        //  append Function
                // sb.append(" Stark");
                // System.out.println(sb);
        
        //  length Function
                // System.out.println(sb.length());
        // }


// Reverse the charater

        // public static void main(String args [])
        // {
        //         String str ="abcdcba";
        //         StringBuilder sb = new StringBuilder(str);
        //         for(int i=0;i<=sb.length()/2;i++)
        //         {
        //                 int front = i;
        //                 int back = sb.length()-1-i;

        //                 char frontchar = sb.charAt(front);
        //                 char backchar = sb.charAt(back);

        //                 sb.setCharAt(front,backchar);
        //                 sb.setCharAt(back,frontchar);

        //         }
        //         System.out.println(sb);
        //         if(sb.equals(str))
        //         {
        //                 System.out.println("palimdrome");
        //         }
        // }



//  Bubble Sort      time complexity = O(n^2)
        
        // public static void printarr(int arr[])
        // {
        //         for(int i=0;i<arr.length;i++)
        //         {
        //                 System.out.print(arr[i]+" ");
        //         }
        //         System.out.println();
        // }

        // public static void main(String args [])
        // {
        //         int arr[]={3,10,5,7,1,8,2,4};

        //         for(int i=0;i<arr.length-1;i++)
        //         {
        //                 for(int j=0;j<arr.length-i-1;j++)
        //                 {
        //                         if(arr[j]>arr[j+1])
        //                         {
        //                                 int temp = arr[j];
        //                                 arr[j] = arr[j+1];
        //                                 arr[j+1] = temp;
        //                         }
                                
        //                 }
        //         }
        //         printarr(arr);
                
        // }


//  Selection Sort      time complexity = O(n^2)
        
// public static void printarr(int arr[])
// {
//         for(int i=0;i<arr.length;i++)
//         {
//                 System.out.print(arr[i]+" ");
//         }
//         System.out.println();
// }

// public static void main(String args [])
// {
//         int arr[]={3,10,5,7,1,8,2,4};

//         for(int i=0;i<arr.length-1;i++)
//         {       
//                 int smallest = i;
//                 for(int j=i+1;j<arr.length;j++)
//                 {
//                         if(arr[smallest]>arr[j])
//                         {
//                                 smallest=j;
//                         }
                        
//                 }
//                 int temp = arr[smallest];
//                 arr[smallest] =arr[i];
//                 arr[i] = temp;
//         }
//         printarr(arr);
        
// }


//  Insertion sort

// public static void printarr(int arr[])
// {
//         for(int i=0;i<arr.length;i++)
//         {
//                 System.out.print(arr[i]+" ");
//         }
//         System.out.println();
// }

// public static void main(String args [])
// {
//         int arr[]={3,10,5,7,1,8,2,4};

//         for(int i=1;i<arr.length;i++)
//         {       
//                 int current = arr[i];
//                 int j =i-1;
//                 while(j>=0 && current < arr[j])
//                 {
//                         arr[j+1] = arr[j];
//                         j--;
//                 }
                
//                 //placement
//                 arr[j+1] = current;
//         }
//         printarr(arr);
        
// }




// public static void main(String[] args) {
//         int n =153;
//         int q =n;
//         int m=0;
//         while (q>0){
//                 int y = q%10;
//                 m+=y*y*y;
//                 q=q/10;
//         }
//         if(n==m){
//                 System.out.println("yes");
//         }
//         else{
//                 System.out.println("no");
//         }
// }











}


