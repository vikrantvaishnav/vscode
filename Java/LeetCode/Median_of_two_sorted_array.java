package LeetCode;

public class Median_of_two_sorted_array {  // time complexity will be O(log(n+m))
    
    static float findMedian(int[] arr1, int[] arr2){

        if(arr2.length <arr1.length){
            return findMedian(arr2, arr1);
        }

        int l=0;
        int h = arr1.length;

        while(l<=h){
            int m1 = (l+h)/2;
            int m2 = ((arr1.length + arr2.length +1)/2) - m1;

            int l1 = (m1 == 0) ? Integer.MIN_VALUE : arr1[m1-1];
            int r1 = (m1 == arr1.length) ? Integer.MAX_VALUE : arr1[m1];

            int l2 = (m2 == 0) ? Integer.MIN_VALUE : arr2[m2-1];
            int r2 = (m2 == arr2.length) ? Integer.MAX_VALUE : arr2[m2];

            if(l1<=r2 && l2<=r1){

                if((arr1.length + arr2.length) % 2 == 0){
                    return (float) (Integer.max(l1,l2) + Integer.min(r1,r2))/2;
                }
                else{
                    return (float) Integer.max(l1,l2);
                }
            }
            else if(l2 > r1){
                l = m1 + 1;
            }
            else{
                h = m1 -1;
            }

        }
        return 0.0f;
    }


    public static void main(String[] args) {
        int[] arr1 = {1,3,8,17};
        int[] arr2 = {5,6,7,21};

        System.out.println(findMedian(arr1, arr2));
    }
}
