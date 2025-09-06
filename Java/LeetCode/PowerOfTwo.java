package LeetCode;


public class PowerOfTwo {
    // public static boolean isPowerOfTwo(int n) {
        
    //     for(int i=0;i<=30;i++){
    //         int ans = (int) Math.pow(2,i);
    //         if(ans==n){
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    // public static void main(String[] args) {
    //     int n=16;
    //     boolean x = isPowerOfTwo(n);
    //     System.out.println(x);
    // }












    public static boolean isPowerOfTwo(int n) {
        return n < 1 ? false : (n & (n - 1)) == 0 ? true : false;
   }

   public static void main(String[] args) {
    int n=16;
    System.out.println(isPowerOfTwo(n));
   }


}
