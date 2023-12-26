import java.net.SocketTimeoutException;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.sound.midi.MidiChannel;

public class Sorting {

//Linear Search

        /* The time complexity of Linear search in best case is O(1)
           and worst time complexity is O(n)
         */


// public static void LinearSearch(int arr[],int element)
// {
//         for(int i=0;i<arr.length;i++)
//         {
//                 if(arr[i]==element)
//                 {
//                         System.out.println(i);
//                 }
//         }
// }

// public static void main(String[] args) {
//         int arr[]={5,6,2,8,4,0,1,9};

//         LinearSearch(arr, 9);
// }



























// Binary Search

        /* The time complexity of Binary Search in best case is O(1)
           and worst time complexity is O(logn).
        */        



// public static void main(String[] args) {-
        //         int arr[]={10,30,40,50,60,80};
        //         int search=40;
        //         int n= arr.length;
        //         int start=0;
        //         int end=n-1;
        //         while(start<=end)
        //         {
        //                 int mid=(start+end)/2;            /*we can calculate mid by this "start+(end-start)/2" */
        //                 if(arr[mid]>search)
        //                 {
        //                         end =mid-1;
        //                 }
        //                 else if(arr[mid]<search)
        //                 {
        //                         start=mid+1;
        //                 }
        //                 else{
        //                         System.out.println(mid);
        //                 }
        //         }
// }




// public static int Binary(int arr[], int element){
//         int start=0;
//         int end = arr.length-1;

//         while(start<end)
//         {
//             int mid = (start+end)/2;

//             if(arr[mid]==element)
//             {
//                return mid; 
//             }
//             else if(element<arr[mid])
//             {
//                 end=mid-1;
//             }
//             else{
//                 start=mid+1;
//             }
            
//         }
//         return -1;
        
// }
// public static void main(String[] args) {
//         int arr[] = {2,5,6,8,9,13,16};
//         int element =13;
//         int search = Binary(arr, element);
//         System.out.println(search);
// }





















 







//  Bubble Sort      time complexity = O(n^2)
        
// public static void BubbleSort(int arr[])
        // {

        //         for(int i=0;i<arr.length;i++)
        //         {
        //                 for(int j=0;j<(arr.length-1)-i;j++)
        //                 {
        //                         if(arr[j]>arr[j+1])
        //                         {
        //                                 int temp = arr[j];
        //                                 arr[j] = arr[j+1];
        //                                 arr[j+1] = temp;
        //                         }
                                
        //                 }
        //         }
                
        // }

        // public static void main(String args [])
        // {
        //         int arr[]={3,10,5,7,1,8,2,4};
               
        //         BubbleSort(arr);

        //         for(int i=0;i<arr.length;i++)
        //         {
        //                 System.out.print(arr[i]+" ");
        //         }             
// }















//Selection sort     (all three Time Complexity is O(n^2)  )

     /* In Selection sort our motive to identify the minimum element in the array and swap that element to first position element in the array */   



// public static void Selection_sort(int arr[])
// {
//         for(int i=0;i<arr.length-1;i++)
//         {
//                 int min=arr[i];
//                 int minIndex=i;
//                 for(int j=i+1;j<arr.length;j++)
//                 {
//                         if(arr[j]<min)
//                         {
//                                 min=arr[j];
//                                 minIndex=j;
//                         }
//                 }
//                 arr[minIndex]=arr[i];
//                 arr[i]=min;
//         }
// }

// public static void main(String[] args) {
//         int arr[]={5,7,2,1,9,8,4};
//         System.out.println(arr.length-1);
//         Selection_sort(arr);

//         for(int i=0;i<arr.length;i++)
//         {
//                 System.out.print(arr[i]+" ");
//         }
// }




















        




//Insertion sort      worst case time complexity is O(n^2)
//                      Best case time complexity is O(n).



/* in insertion sort we divide the array into two parts 
   one is sorted part and one for unsorted part
   first we assume the first element in the array is sorted
   and after this we compare the one element of unsorted array to sorted element and then arrange them accordingly.
*/


        public static void InsertionSort(int arr[]) {
                
                int n=arr.length;
               for(int i=1;i<n;i++)  /* in this "i" indicates unsorted array */
               {       int j=i-1;
                        int temp=arr[i];
                        while(j>=0 && arr[j]>temp)  /* in this "j" indicates sorted part of array */
                        {
                                arr[j+1]=arr[j];
                                j--;
                        }
                        arr[j+1]=temp;
                }
               
        }

        public static void main(String[] args) {
                int arr[]={5,1,9,3,8,6,2,0};
                InsertionSort(arr);

                for(int i=0;i<arr.length;i++)
                {
                        System.out.print(arr[i]+" ");
                }
        }



     





//         public static void main(String[] args) {
//         int arr[]={7,9,1,5,6,3,8,2,};
//         int n= arr.length;
//         for(int i=1;i<n;i++)
//         {
//                 for(int j=0;j<i;j++)
//                 {
//                         if(arr[i]<arr[j])
//                         {
//                                 int temp=arr[i];
//                                 arr[i]=arr[j];
//                                 arr[j]=temp;
//                         }
//                 }
//         }
//         for(int k=0;k<n;k++)
//         {
//                 System.out.print(arr[k]);
//         }
//      }
        












// Merge Sort


        // public static int[] MergeSort(int arr1[], int arr2[])
        // {
        //         int i,j,k;
        //         i=j=k=0;

        //         int arr3[]= new int[arr1.length+arr2.length];

        //         while(i<arr1.length && j<arr2.length)
        //         {
        //                 if(arr1[i]<arr2[j])
        //                 {
        //                         arr3[k] = arr1[i];
        //                         k++;
        //                         i++;
        //                 }
        //                 else{
        //                         arr3[k] = arr2[j];
        //                         k++;
        //                         j++;
        //                 }
        //         }

        //         while(i<arr1.length)
        //         {
        //                 arr3[k]=arr1[i];
        //                 k++;
        //                 i++;
        //         }

        //         while(j<arr2.length)
        //         {
        //                 arr3[k]=arr2[j];
        //                 k++;
        //                 j++;
        //         }

        //         return arr3;
        // }

        // public static void main(String[] args) {
        //         int arr1[]={1,4,6,8,10};
        //         int arr2[]={2,3,5,7,9};

        //         int ans[] = MergeSort(arr1, arr2);

        //         for(int i=0;i<ans.length;i++)
        //         {
        //                 System.out.print(ans[i]+" ");
        //         }

        // }
       
}
