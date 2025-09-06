package LeetCode;

public class Rotate_Array {
    
    // public static void rotate(int[] arr, int k){
    //     int n = arr.length;
    //     if(n==k || k==0){
    //         return;
    //     }
    //     int[] arr2 = new int[n];
    //     int indx =0;
    //     for(int x : arr){
    //         arr2[indx++] = x;
    //     }
    //     for(int i =0; i<n; i++){
    //         arr[(i+k)%n] = arr2[i];
    //     }

    //     for(int i=0 ;i<n;i++){
    //         System.out.print(arr[i]);
    //     }
    // }














    // public static void rotate(int[] nums, int k) {

        // int n = nums.length;
        
        // if(n == k || k == 0) {
        //     return;
        // }
        // int last;
        // for(int i = 0;i<k;i++) {
        //     last = nums[n-1];
        //     for(int j = n-2; j>=0;j--) {
        //         nums[j+1] = nums[j];
        //     }
        //     nums[0] = last;
        // }

        // for(int i=0; i<n; i++){
        //     System.out.print(nums[i]);
        // }
    // }






    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        int n = nums.length;
        reverseNum(nums,0,n-1);
        reverseNum(nums,0,k-1);
        reverseNum(nums,k,n-1);
        for(int i=0;i<n;i++){
            System.out.print(nums[i]);
        }
    }
    public static void reverseNum(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }



    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8};
        int k =3;
        int n = arr.length;

        rotate(arr, k);
    }
}
