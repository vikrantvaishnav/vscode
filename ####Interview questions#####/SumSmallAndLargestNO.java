public class SumSmallAndLargestNO {
    public static void Sum(int arr[])
    {
        int n=arr.length-1;
        for(int i=0;i<=n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=0;
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(arr[0]+arr[n]);
    }

    public static void main(String[] args) {
        int arr[]={4,7,6,2,9,6,5,87};
        Sum(arr);
    }
}
