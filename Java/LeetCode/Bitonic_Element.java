package LeetCode;

public class Bitonic_Element {
    
    static int bitonic(int[] arr)
    {
        int s = 0;
        int e =arr.length;
        // int ans ;
        int mid = s+(e-s)/2;

        while(s<=e){

            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid]< arr[mid+1]){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
            mid = s+(e-s)/2;
        }
        return -1;
    }

    public static void main(String[] args) {
        
        int[] arr = {5,6,7,8,9,10,14,18,19,23,26,27,13,12,11,4,3,2,1};
        
        int ans = bitonic(arr);
        System.out.println(arr[ans]);
    }
}
