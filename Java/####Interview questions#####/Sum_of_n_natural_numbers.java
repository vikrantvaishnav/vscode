import java.util.Scanner;
public class Sum_of_n_natural_numbers {
    public static void printsum(int i, int n, int sum)
    {
        if(i==n)
        {
            sum+=i;
            System.out.println("sum: "+sum);
            return;
        }

        sum+=i;
        printsum(i+1, n, sum);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n= sc.nextInt();
        printsum(1,n,0);
    }
}
