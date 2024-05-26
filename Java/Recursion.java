import java.util.Arrays;

public class Recursion{
    // public static void factorial(int fact, int n,int i){
    //     // int x =fact;
    //     if(i==n){
    //        fact*=i;
    //        System.out.println(fact);
    //         return;
    //     }
    //     factorial(fact*=i, n,i+1);
    // }
    // public static void main(String [] args){
    //     int n = 5;
    //     factorial(1, n,1);
    // }






    // public static int factorial(int fact, int n){
    //     // int x =fact;
    //     if(n==0){
    //         return fact;
    //     }
        
    //     return factorial(fact*=n, n-1);
    // }
    // public static void main(String [] args){
    //     int n = 5;
    //     System.out.println(factorial(1, n));
    // }







        // public static void main(String[] args) {
        //     int rows = 5; // Change 'rows' to the desired number of rows
    
        //     for (int i = 1; i <= rows; i++) {
        //         // Print spaces
        //         for (int j = 1; j <= rows - i; j++) {
        //             System.out.print("  ");
        //         }
    
        //         // Print 0s and 1s
        //         for (int k = 1; k <= i; k++) {
        //             if ((i + k) % 2 == 0) {
        //                 System.out.print("1 ");
        //             } else {
        //                 System.out.print("0 ");
        //             }
        //         }
    
        //         // Move to the next line
        //         System.out.println();
        //     }
        // }
    
    


        // public static boolean isSorted(int arr[],int n){
        //     if(n==0||n==1){
        //         return true;
        //     }

        //     if(arr[0] > arr[1]){
        //         return false;
        //     }
        //     else{
        //         return isSorted(Arrays.copyOfRange(arr, 1, n), n-1);
        //     }
        // }



  

        // public static void main(String[] args) {
        //     int arr[] ={3,4,5,6,9,8};
        //     int n = arr.length;
        //     System.out.println( isSorted(arr, n));
    

        // }













    // public static int add(int[] arr, int n){
    //     if(n==0)
    //     return 0;

    //     if(n==1)
    //     return arr[0];

    //     int remain =add(Arrays.copyOfRange(arr, 1, n),n-1);
    //     int sum = arr[0] + remain;
        
    //     return sum;
    // }
    // public static void main(String[] args) {
    //     int[] arr = {1,2,3,8,5};
    // int n = arr.length;
    // int sum = add(arr, n);
    // System.out.println(sum);
    // }


    












    // public static int LinearSearch(int[] arr, int ele){
    
    //     int n= arr.length;

    //     if(n==0){
    //         return 0;
    //     }

    //     if(arr[n-1] == ele){
    //         return n-1;
    //     }


    //     return LinearSearch(Arrays.copyOfRange(arr, 0,n-1), ele);
    // }

    // public static void main(String[] args) {
    //     int[] arr={5,2,3,8,6,6};
    //     int ans = LinearSearch(arr, 8);
    //     System.out.println(ans);
    // }


















 
    // public static int binarySearch(int[] arr, int elem, int start, int end) {
    //     if (start <= end) {
    //         int mid = start + (end - start) / 2;

    //         if (arr[mid] == elem) {
    //             return mid;
    //         } else if (arr[mid] > elem) {
    //             return binarySearch(arr, elem, start, mid - 1);
    //         } else {
    //             return binarySearch(arr, elem, mid + 1, end);
    //         }
    //     }
    //     return -1; // If element is not found
    // }

    // public static void main(String[] args) {
    //     int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    //     int elem = 7;

    //     int ans = binarySearch(arr, elem, 0, arr.length - 1);
    //     if (ans != -1) {
    //         System.out.println("Element " + elem + " found at index " + ans);
    //     } else {
    //         System.out.println("Element " + elem + " not found in the array.");
    //     }
    // }













}