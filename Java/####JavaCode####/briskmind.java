import java.io.*;
import java.util.*;
public class briskmind {
    
/*
         1
        121
       12321
      1234321
     123454321
 */


  public static void main(String []args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n=in.nextInt();
 
    for(int i=1;i<=n;i++) {
      for(int j=i;j<=n-1;j++) {
        System.out.print("*");
      }
      for(int j=1;j<=i;j++) {
        System.out.print(j);
      }
      for(int j=i-1;j>=1;j--) {
        System.out.print(j);
      }
      System.out.println();
    }
  }






}
