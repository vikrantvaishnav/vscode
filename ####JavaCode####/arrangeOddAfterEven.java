import java.util.Scanner;
public class arrangeOddAfterEven {
    public static void main(String[] args) {
        System.out.println("enter the size of a list");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter arr");
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("arr list");
        for(int i=0;i<arr.length;i++)
        {
            
            if(arr[i]%2==0)
            {
                System.out.print(arr[i]+",");
            }
            
        }
        for(int i=0;i<arr.length;i++)
        {
            
            if(arr[i]%2!=0)
            {
                System.out.print(arr[i]+",");
            }
            
        }

    }
}
