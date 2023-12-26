public class Maximum_AND_sum {
    public static int checkbit(int[] arr,int mask) {
        int count =0;
    
        for(int i=0; i<arr.length;i++){
            if((mask & arr[i]) == mask){
                System.out.println("i ="+i);
                count++;
            }
        }
        return count;
    }
    public static int maxandvalue(int[] arr) {
        int mask =0;
        int res =0;
    
       for(int i=31;i>=0;i--){
        System.out.println(1<<i);
        mask = (1<<i)| res;
        System.out.println("mask "+i+"="+mask);
       int count = checkbit(arr, mask);
       if(count >=2){
        res = res | mask;
        System.out.println("Res ="+res);
       }
       }
       return res;
     }
    
     public static void main(String[] args) {
        int arr[] = {16,12,8,4 };
        System.out.println("ans"+maxandvalue(arr));
     }
}
