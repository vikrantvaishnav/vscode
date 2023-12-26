import java.util.Scanner;

public class Array_2D {

//2D Array

    /* in 2D array arr.length give the length of rows
        and arr[0].length gives the colunm length
     */





    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("enter row size");
    //     int row= sc.nextInt();
    //     System.out.println("enter coloum size");
    //     int coloum=sc.nextInt();
    //     int arr[][]=new int[row][coloum];
    //     for(int i=0;i<row;i++)
    //     {
    //         for(int j=0;j<coloum;j++)
    //         {
    //             System.out.print("element of "+i+","+j+" ");
    //             arr[i][j]=sc.nextInt();
    //         }
    //     }
    //     for(int i=0;i<row;i++)
    //     {
    //         int ans =0;
    //         for(int j=0;j<coloum;j++)
    //         {
    //             ans+=arr[i][j];
    //             // System.out.print(arr[i][j]+" ");

    //         }
    //         // System.out.println();
    //         System.out.println(ans);
    //     }
    // }



























// Largest sum of row or coloum 


    // public static void TakeInput(int arr[][])
    // {
    //     Scanner sc = new Scanner(System.in);
    //     int row = arr.length;
    //     int coloum =arr[0].length;
    //     for(int i=0;i<row;i++)
    //     {
    //         for(int j=0;j<coloum;j++)
    //         {
    //             System.out.println("Enter the element at "+i+" row and "+j+" coloum");
    //             arr[i][j]=sc.nextInt();
    //         }
    //     }
    // }

    // public static void PintOutput(int arr[][])
    // {
    //     int row = arr.length;
    //     int coloum =arr[0].length;
    //     for(int i=0;i<row;i++)
    //     {
    //         for(int j=0;j<coloum;j++)
    //         {
    //             System.out.print(arr[i][j]+" ");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static int RowLargest(int arr[][])
    // {   int x=0;
    //     int row = arr.length;
    //     int coloum =arr[0].length;
    //     int largest=Integer.MIN_VALUE;
    //     for(int i=0;i<row;i++)
    //     {
    //         int sum=0;
    //         for(int j=0;j<coloum;j++)
    //         {
    //             sum = sum+arr[i][j];
    //             if(sum>largest)
    //             {
    //                 x=i;
    //                 largest=sum;
    //             }
    //         }
    //     }
    //     System.out.println(x+" row "+largest);
    //     return largest;
    // }

    // public static int coloumLargest(int arr[][])
    // {   int x=0;
    //     int row = arr.length;
    //     int coloum =arr[0].length;
    //     int largest=Integer.MIN_VALUE;
    //     for(int i=0;i<coloum;i++)
    //     {
    //         int sum=0;
    //         for(int j=0;j<row;j++)
    //         {
    //             sum = sum+arr[j][i];
    //             if(sum>largest)
    //             {
    //                 x=i;
    //                 largest=sum;
    //             }
    //         }
    //     }
    //     System.out.println(x+" coloum "+largest);
    //     return largest;
    // }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter numbers of row:");
    //     int row = sc.nextInt();
    //     System.out.print("Enter numbers of coloum:");
    //     int coloum = sc.nextInt();
    //     int arr[][]= new int[row][coloum];
    //     TakeInput(arr);
    //     PintOutput(arr);
    //     if(RowLargest(arr)>coloumLargest(arr))
    //     {
    //         System.out.println(RowLargest(arr));
    //     }
    //     else{
    //         System.out.println(coloumLargest(arr));
    //     }
    //     // System.out.println(arr.length);// length of row
    //     // int n=arr[0].length;//length of column
    //     // System.out.println(n);
    // }



    
    


















    
    
//wave print

    public static void main(String[] args) {
        int n,m;
        int x;
        Scanner sc =new Scanner(System.in);
        System.out.println("loop");
        x=sc.nextInt();
        int p=0;
        while(p<x)
        {
        
        System.out.println("n,m");
        n=sc.nextInt();
        m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            
            for(int j=0;j<m;j++)
            {
                System.out.println(i+","+j);
                arr[i][j]=sc.nextInt();
            }
        }

        
        System.out.println("output");
            
        for(int j=0;j<arr[0].length;j++)
        {
            if(j%2==0)
            {
                for(int i=0;i<arr.length;i++)
                {
                    System.out.print(arr[i][j]);
                }
            }
            else{
                for(int i=arr.length-1;i>=0;i--)
                {
                    System.out.print(arr[i][j]);
                }
            }
        }
        p++;

        }
    }
















    



 
    

//Spiral Print


        // public static void print(int arr[][])
        // {
        //     int minr=0;
        //     int maxr=arr.length-1;
        //     int minc=0;
        //     int maxc=arr[0].length-1;
        //     int noele=arr.length*arr[0].length;
        //     int count=0;

        //     while(count<noele)
        //     {
        //         //left
        //     for(int i=minr,j=minc;i<=maxr && count<noele ;i++)
        //     {
        //         System.out.print(arr[i][j]);
        //         count++;

        //     }
        //     minc++;

        //         //bottom
        //     for(int i=maxr,j=minc;j<=maxc && count<noele;j++)
        //     {
        //         System.out.print(arr[i][j]);
        //         count++;

        //     }
        //     maxr--;

        //         //right
        //     for(int i=maxr,j=maxc;i>=minr&& count<noele;i--)
        //     {
        //         System.out.print(arr[i][j]);
        //         count++;

        //     }
        //     maxc--;

        //         //top
        //     for(int i=minr,j=maxc;j>=minc&& count<noele;j--)
        //     {
        //         System.out.print(arr[i][j]);
        //         count++;

        //     }
        //     minr++;
        //     }
        // } 
        


        // public static void main(String[] args) {
            
        //     Scanner sc = new Scanner(System.in);
        //     int n,m;
        //     System.out.println("n,m");
        //     n=sc.nextInt();
        //     m=sc.nextInt();

        //     int arr[][]=new int[n][m];


        //     for(int i=0;i<n;i++)
        //     {
        //         for(int j=0;j<m;j++)
        //         {
        //             System.out.println(i+","+j);
        //             arr[i][j]=sc.nextInt();
        //         }
        //     }

        //     print(arr);
            
        // }









}