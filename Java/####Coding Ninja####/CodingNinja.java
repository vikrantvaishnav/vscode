import java.net.SocketTimeoutException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

import javax.sound.midi.MidiChannel;

public class CodingNinja {
   
    /*
     ABCD
     BCDE
     CDEF
     DEFG
     EFGH
     */

    // public static void main(String[] args) {
        
    //     int i,j;
    //     int n=5;
    //     for(i=1;i<=n;i++)
    //     {
    //         char ch = (char)('A'+i-1); 
    //         for(j=1;j<n;j++)
    //         {
    //             System.out.print((char)(ch+j-1));
    //         }
    //         System.out.println();
    //     }
    // }










//

/*
   1
   23
   345
   4567
 */
    // public static void main(String[] args) { 
    //     int n=4;
    //     for(int i=1;i<=n;i++)
    //     {
    //         for(int j=i;j<i+i;j++)
    //         {
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
    // }

                    //OR

    // public static void main(String[] args) {
    //     int n=5;
    //     int i=1;
    //     while(i<=n)
    //     {
    //         int j=1;
    //         int num =i;
    //         while(j<=i)
    //         {
    //             System.out.print(num);
    //             num++;
    //             j++;
    //         }
    //         System.out.println();
    //         i++;
    //     }
    // }






    


/* 
    ABCD
    BCDE
    CDEF
    DEFG
 */

    // public static void main(String[] args) {
    //     int i=1;
    //     int n=4;
    //     while(i<=n)
    //     {
    //         int j=1;
    //         char ch = (char)('A'+i-1);
    //         while(j<=n)
    //         {
    //             System.out.print(ch);
    //             ch++;
    //             j++;
    //         }
    //         System.out.println();
    //         i++;
    //     }
    // }











// Q.

 /*
    A
    BC
    CDE
    DEFG
*/


    // public static void main(String[] args) { 
    //     int n=4;
    //     char ch ='A';
    //     for(int i=1;i<=n;i++)
    //     {
    //         for(int j=i;j<i+i;j++)
    //         {
    //             System.out.print((char)(ch+j-1));
    //         }
    //         System.out.println();
    //     }
    // }

                    //OR

    // public static void main(String[] args) {
    //     int n=4;
    //     int i=1;
    //     while(i<=n)
    //     {
    //         int j=1;
    //         char ch = (char) ('A'+i-1);
    //         while(j<=i)
    //         {
    //             System.out.print(ch);
    //             ch++;
    //             j++;
    //         }
    //         System.out.println();
    //         i++;
    //     }
    // }







//
/*
  1=1
  1+2=3
  1+2+3=6
  1+2+3+4=10
 */
    // public static void main(String[] args) {
    //     int n=4;
    //     for(int i=1;i<=n;i++)
    //     {
    //         int sum=0;
    //         for(int j=1;j<=i;j++)
    //         {
    //             sum+=j;
    //             if(j==i){
    //                 System.out.print(j+"="+sum);             
    //             }
    //             else{
    //                 System.out.print(j+"+");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }







    
/* 
    1
    23
    456
    78910
 */

    // public static void main(String[] args) {
    //     int n=4;
    //     int i=1;
    //     int num=1;
    //     while(i<=n)
    //     {
    //         int j=1;
    //         while(j<=i)
    //         {
    //             System.out.print(num);
    //             j++;
    //             num++;
    //         }
    //         System.out.println();
    //         i++;
    //     }
    // }


    // public static void main(String[] args) {
    //     int n=4;
    //     int num =1;
    //     for(int i=1;i<=n;i++)
    //     {
    //         for(int j=1;j<=i;j++){
    //             System.out.print(num);
    //             num++;
    //         }
    //         System.out.println();
    //     }
    // }





 /*
    1
    21
    321
    4321
*/
 
 
    // public static void main(String[] args) {
    //     int n=4;
    //     int i=1;
    //     while(i<=n)
    //     {
    //         int j=1;
    //         int x =i;
    //         while(j<=i)
    //         {
    //             System.out.print(x);
    //             x--;
    //             j++;
    //         }
    //         System.out.println();
    //         i++;
    //     }
    // }










/*
      *
     **
    ***
   ****
  *****
   
 */
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

                //OR

    // public static void main(String[] args) {
    //     int n=5;
    //     int i=1;
    //     while(i<=n)
    //     {   
    //         int j=1;
    //         while(j<=n-i)
    //         {
    //             System.out.print(" ");
    //             j++;
    //         }
    //         j=1;
    //         while(j<=i)
    //         {
    //              System.out.print("*");
    //              j++;
    //         }
    //         System.out.println();
    //         i++;
    //     }
    // }










    /*
     ****
      ***
       **
        *
     */


    // public static void main(String[] args) {
    //     int n=4;
    //     for(int i=1;i<=n;i++)
    //     {
    //         for(int j=1;j<=i-1;j++)
    //         {
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=n-i+1;j++)
    //         {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }










/*
    4444
    333
    22
    1 
*/


    // public static void main(String[] args) {
    //     int n=4;
    //     int x=n;
    //     for(int i=1;i<=n;i++)
    //     {   
    //         for(int j=1;j<=n-i+1;j++)
    //         {       
    //             System.out.print(x);
    //         }
    //         x--;
    //         System.out.println();
    //     }
    // }

                    // OR

    // public static void main(String[] args) {
    //     int i,j;
    //     int n=4;
    //     for(i=n;i>=1;i--)
    //     {
    //         for(j=1;j<=i;j++)
    //         {
    //             System.out.print(i);
    //         }
    //         System.out.println();
    //     }
    // }








    

/*
     1
    121
   12321
  1234321
 */



    // public static void main(String[] args) {
    //     int n=4;
    //     int i,j;
    //     for(i=1;i<=n;i++)
    //     {
    //         for(j=1;j<=n-i;j++)
    //         {
    //             System.out.print(" ");
    //         }
    //         for(j=1;j<=i;j++)
    //         {
    //             System.out.print(j);
    //         }
    //         for(j=i;j>1;j--)
    //         {
    //             System.out.print(j-1);
    //         }
    //         System.out.println();
    //     }
    // }












/*
      
     *
    ***
   *****
  *******
 */



    // public static void main(String[] args) {
    //     int n=4;
    //     int i,j;
    //     for(i=1;i<=n;i++)
    //     {
    //         for(j=1;j<=n-i;j++)
    //         {
    //             System.out.print(" ");
    //         }
    //         for(j=1;j<=2*i-1;j++)
    //         {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }





/*
    1
   232
  34543
 4567654
567898765

 */



    // public static void main(String[] args) {
    //     int n=5;
    //     int i,j;
    //     for(i=1;i<=n;i++)
    //     {
    //         for(j=1;j<=n-i;j++)
    //         {
    //             System.out.print(" ");
    //         }
    //         for(j=i;j<=(2*i)-1;j++)
    //         {
    //             System.out.print(j);
    //         }
    //         for(j=(2*i)-2;j>=i;j--)
    //         {
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
    // }



    // public static void main(String[] args) {
    //     int n = 5;
    //     int i = 1;
    //     int a = 0;
    //     while (i<=n) {
    //         int j=1;
    //         while (j<=n-i) {
    //             System.out.print(" ");
    //             j++;
    //         }
    //         j=1;
    //         while (j<=i) {
    //             System.out.print(i+j-1);
    //             j++;
    //         }
    //         j=1;
    //         while (j<=i-1) {
    //             System.out.print(i-j+a);
    //             j++;
    //         }
    //         i++;
    //         a++;
    //         System.out.println();
    //     }
    // }








    

/*
   *
  ***
 *****
*******
 *****
  ***
   *

 */


    // public static void main(String[] args) {
    //     int n=7;
    //     int i,j;
    //     for(i=1;i<=(n/2)+1;i++)
    //     {
    //         for(j=1;j<=((n/2)+1)-i;j++)
    //         {
    //             System.out.print(" ");
    //         }
    //         for(j=1;j<=(2*i)-1;j++)
    //         {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    //     for(i=1;i<=n/2;i++)
    //     {
    //         for(j=1;j<=i;j++)
    //         {
    //             System.out.print(" ");
    //         }
    //         for(j=n-2;j>=(2*i)-1;j--)
    //         {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }






    // public static void main(String[] args) {
    //     int n=1234;
    //     while(n>0)
    //     {
    //     int x=n%10;
    //     n=n/10;
    //     int sum=0;
    //     System.out.print(sum+x);
    //     }
    // }



   
    










    

//push zero to end of array



    // public static void pushzero(int arr[])
    // {
    //     int count=0;
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         if(arr[i]!=0)
    //         {
    //             arr[count++]=arr[i];
    //         }
    //     }
    //     while(count<arr.length)
    //     {
    //         arr[count++]=0;
    //     }
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         System.out.print(arr[i]);
    //     }
    // }
    // public static void main(String[] args) {
    //     int arr[]={5,0,1,4,9,5,0,2,0};
    //     pushzero(arr);
    // }





    








// Commpress the String

    // public static void compress(String str)
    // {
    //     int arr[]=new int[26];

    //     int i=0;
    //     while(i<str.length())
    //     {
    //         arr[str.charAt(i)-'a']++;
    //         i++;
    //     }   
        

    //     i=0;
    //     while(i<str.length())
    //     {
    //         if(arr[i]==0)
    //         {
    //             continue;
    //         }
    //         System.out.print((char)('a'+i)+""+arr[i]+" ");
    //         i++;
    //     }
    // }

    // public static void main(String[] args) {
    //     String str="aaabbbccdddddeeeef";
    //     compress(str);
    // }
    



    







 



    
    



// push zeros to end


    // public static void zeros(int arr[])
    // {
    //     int i=0;
    //     int count=0;
    //     while(i<arr.length){
    //     if(arr[i]==0)
    //     {
    //         count++;
    //         i++;
    //         continue;

    //     }
    //     if(arr[i]!=0)
    //     {
    //         System.out.print(arr[i]);
    //         i++;
    //     }
    //     }
    //     for(int j=0;j<count;j++)
    //     {
    //     System.out.print("0");
    //     }
    // }

    // public static void main(String[] args) {
    //     int arr[]={4,5,0,0,2,3,0,5};
    //     zeros(arr); 
    // }



    











// sort 0 1 2


    // public static void sort(int arr[])
    // {
    //     int ar[]=new int[10];
    //     int i=0; 

    //     while(i<arr.length)
    //     {
    //         ar[arr[i]-0]++;
    //         i++;
    //     }

    //     for(int j=0;j<ar.length;j++)
    //     {
    //         for(int k=0;k<ar[j];k++)
    //         {
    //             System.out.print(j);
    //         }
    //     }
    // }

    // public static void main(String[] args) {
    //     int arr[]={4,1,2,3,1,5,2,3,2,0,0,};
    //     sort(arr);
    // }
    



















// eqlibirium index in array




    // public static void equilibrium(int arr[])
    // {
    //     if(arr.length==0)
    //     {
    //         return;
    //     }

    //     int ls=arr[0];
    //     int rs=0;

    //     for(int i=2;i<arr.length;i++)
    //     {
    //         rs+=arr[i];
    //     }

    //     int x=1;
    //     while(ls!=rs)
    //     {
    //        ls=ls+arr[x];

    //        System.out.print(ls+" ");

    //        rs=rs-arr[x+1];
    //        System.out.println(rs);
    //        x++;

    //        if(x==arr.length-1){
    //         return;
    //        }

    //     }
    //     System.out.println(x);
    // }

    // public static void main(String[] args) {
    //     int arr[]={1,3,1,1,6,5,0,4,1,5,7 };
    //     // System.out.println(arrayEquilibriumIndex(arr));
    //     equilibrium(arr);
    // }




    // public static int arrayEquilibriumIndex(int[] arr){  
	// 	//Your code goes here
        
    //     if(arr.length==0){
    //         return -1;
    //     }
        
    //     int rs = 0;
    //     int ls = arr[0];
        
    //     for(int i = 2; i<arr.length; i++){
    //         rs += arr[i];
    //     }
        
    //     int x = 1;
        
    //     while(rs != ls){
    //         ls += arr[x];
    //         System.out.print(ls + " ");
    //         rs -= arr[x+1];
    //         System.out.println(rs);
    //         x++;
    //         if(x==arr.length-1){
    //             return -1;
    //         }
    //     }
    //     return x;
	// }

    















//Rotate array

    // public static void rotate(int[] arr, int d) {
    //     //Your code goes here
    //     int[] temp = new int[d];
        
    //     for(int i=0; i<d; i++){
    //         temp[i] = arr[i];
    //     }
        
    //     int j = 0;
        
    //     for(int i = d; i<arr.length; i++){
    //         arr[j] = arr[i];
    //         j++;
    //     }
        
    //     j = 0;
        
    //     for(int i = arr.length - d; i<arr.length; i++){
    //         arr[i] = temp[j];
    //         j++;
    //     }
    // }









// ArrayList


// public static void main(String[] args) {
    
//     ArrayList<Integer> arr = new ArrayList<>();
//     arr.add(10);
//     arr.add(20);
//     arr.add(30);
//     arr.add(40);
//     arr.add(50);

//     System.out.println(arr);

//     arr.add(1,15);//add the element at given index and shift whole arr
//     System.out.println(arr);
//     arr.remove(1);
//     System.out.println(arr);

//     arr.set(1,15);//replace the element at the given index
//     System.out.println(arr);

//     System.out.println(arr.get(2));

//     Integer i=40;
//     arr.remove(i);
//     System.out.println(arr);


//     //for each loop

//     for(int j : arr){
//         System.out.print(j+" ");
//     }


// }
















     




    



}
