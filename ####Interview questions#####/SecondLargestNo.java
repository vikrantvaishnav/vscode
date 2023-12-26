import java.util.Arrays;
import java.util.Scanner;
public class SecondLargestNo {
    // public static int SecondLargest(int array[], int total){  
    //     int temp;  
    //     for (int i=0; i<total; i++)   
    //             {  
    //                 for (int j=i+1; j<total; j++)   
    //                 {  
    //                     if (array[i] > array[j])   
    //                     {  
    //                         temp = array[i];  
    //                         array[i] = array[j];  
    //                         array[j] = temp;  
    //                     }  
    //                 }  
    //             }  
                
    //            return array[total-2];  
    //     }  
    //     public static void main(String args[]){  
    //     Scanner sc =new Scanner(System.in);
    //     System.out.println("Enter array length");
    //     int n=sc.nextInt();
    //     int arr[]=new int[n];
    //     System.out.println("Enter array elements");
    //     for(int i=0;i<n;i++)
    //     {
    //         arr[i]=sc.nextInt();
    //     }   
    //     int x= arr.length;
    //     System.out.println("Second Largest: "+SecondLargest(arr,x));
    // }






                           //OR



    // public static void main(String[] args) {
    //     int a[]={6,7,4,3,2,8};
    //     int x= a.length;
    //     Arrays.sort(a);
    //     System.out.println(a[x-2]);
    // }




    // public static void print2largest(int arr[],int arr_size)
    // {
    //     int i, first, second;

    //     /* There should be atleast two elements */
    //     if (arr_size < 2) {
    //         System.out.print(" Invalid Input ");
    //         return;
    //     }

    //     first = second = Integer.MIN_VALUE;
    //     for (i = 0; i < arr_size; i++) {
    //     /* If current element is greater than
    //     first then update both first and second */
    //     if (arr[i] > first) {
    //         second = first;
    //         first = arr[i];
    //     }

    //     /* If arr[i] is in between first and
    //     second then update second  */
    //     else if (arr[i] > second && arr[i] != first)
    //         second = arr[i];
    //     }

    //     if (second == Integer.MIN_VALUE)
    //         System.out.print("There is no second largest"+ " element\n");
    //     else
    //         System.out.print("The second largest element"+ " is " + second);
    // }

    // /* Driver program to test above function */
    // public static void main(String[] args)
    // {
    // int arr[] = {4,7,67,4,7,65,43,32,54,45,67,45,67};
    // int n = arr.length;
    // print2largest(arr, n);
    // }






    
    public static void  slr(int[] arr)
    {
        int first , second;
        first = second =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>first)
            {
                second =first;
                first=arr[i];
            }
            else if(arr[i]>second && arr[i] != first)
            {
                second =arr[i];
            }
            
        }
        System.out.println(second);
    }


    public static void main(String[] args) {
        int arr[] ={4,7,67,4,7,65,43,65,32,54,45,45,67};
        slr(arr);
    }



}
