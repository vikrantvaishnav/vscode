class demo
{



//   public static int numJewelsInStones(String jewels, String stones) {
//         int answer = 0;
//         for(int i=0; i<jewels.length();i++){
//             for(int j=0;j<stones.length();j++){
//                 if(stones.charAt(j) == jewels.charAt(i))
//                     answer++;
//             }
//         }
//         return answer;
//     }
    


// public static int numJewelsInStones(String jewels, String stones) {
//     int count = 0;
//     char[] stonesChar = stones.toCharArray();
//     char[] jewelsChar = jewels.toCharArray();

//     for(int i=0;i<jewelsChar.length;i++){
//         for(int j=0;j<stonesChar.length;j++){
//             if(stonesChar[j]==jewelsChar[i]){
//                 count++;
//             }
//         }
//     }
//     return count;
// }



//   public static void main (String[] args){
//     String jewels = "aA";
//     String stones = "aAAbbbb";
//     System.out.println(numJewelsInStones(jewels, stones));
//     }





// public static void func1(int a,int b)
// {
//     int ans=1;
//     for(int i=0;i<b;i++)
//     {
//         ans*=a;
//     }
//     System.out.print(ans);
// }
// public static void main (String[] args) {
//     func1(2,5);
// }

// public static int checkbit(int[] arr,int mask) {
//     int count =0;

//     for(int i=0; i<arr.length;i++){
//         if((mask & arr[i]) == mask){
//             System.out.println("i ="+i);
//             count++;
//         }
//     }
//     return count;
// }
// public static int maxandvalue(int[] arr) {
//     int mask =0;
//     int res =0;

//    for(int i=31;i>=0;i--){
//     mask = (1<<i)| res;
//     System.out.println("mask ="+mask);
//    int count = checkbit(arr, mask);
//    if(count >=2){
//     res = res | mask;
//     System.out.println("Res ="+res);
//    }
//    }
// return res;
//  }

//  public static void main(String[] args) {
//     int arr[] = {16,12,8,4};
//     System.out.println("ans"+maxandvalue(arr));
//  }






















public static void main(String[] args) {

    int n=5;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            if(j==i){
                System.out.print("1");

            }else{
           
            System.out.print(j+" ");}
        }
        

    // int n= 5;
    // int px=n;
    // int py = n;
    // for(int i=1;i<=n;i++){

    //     for(int j=1;j<2*n;j++){
    //         if(j==px||j==py||i==n){
    //             System.out.print("* ");
    //         }
    //         else{
    //             System.out.print("  ");
    //         }
    //     }
    //     px--;
    //     py++;

    //     System.out.println();
    // }
}
}