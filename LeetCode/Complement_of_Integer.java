package LeetCode;

public class Complement_of_Integer {
    public static int bitwiseComplement(int n) {
        int m= n;
        int mask=0;
        if(n==0){
            return 1;
        }
        
        while(m!=0){
            mask=(mask << 1)|1;
            m = m >> 1;
        }
        int ans = (~n) & mask;
        return ans;
    }

   
   public static void main(String[] args) {
    int n=5;
    int result = bitwiseComplement(n);
    System.out.println(result);
    }    

}
