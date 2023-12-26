public class demo1{
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







        public static void main(String[] args) {
            int rows = 5; // Change 'rows' to the desired number of rows
    
            for (int i = 1; i <= rows; i++) {
                // Print spaces
                for (int j = 1; j <= rows - i; j++) {
                    System.out.print("  ");
                }
    
                // Print 0s and 1s
                for (int k = 1; k <= i; k++) {
                    if ((i + k) % 2 == 0) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                }
    
                // Move to the next line
                System.out.println();
            }
        }
    
    
}
