// package classfiles;
public class Factorial {
    // public static int fact(int n){
    //     if(n == 1) return 1;   
    //     else return n * fact(n - 1);
    // }



    public static void fact(int  ans,int n){
        if(n == 1) {
            ans *= 1;
            System.out.println(ans);
            return;
        }
        fact(ans*n, n-1);
    }

    public static void main(String[] args) {

        int n=5;

        // System.out.println(fact(n));

        fact(1, n);
      

    }






}
