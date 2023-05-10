import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class RecursionJavaNotes {

    // public static void printnumb(int n)
    // {
        // if(n>0)
        // {
        //     System.out.println(n);
        //     printnumb(n-1);
        // }
        // else
        // {
        //     return;
        // }
                //OR

    //     if(n==0)
    //     {
    //         return;
    //     }

    //     System.out.println(n);
    //     printnumb(n-1);
        
    // }

    // public static void main(String[] args) {
    //     int n=5;
    //     printnumb(n);
    // } 



// Factorial of a number

    // public static void printfact(int i, int n, int sum)
    // {
    //     if(i==n)
    //     {
    //         sum*=i;
    //         System.out.println("sum: "+sum);
    //         return;
    //     }

    //     sum*=i;
    //     printfact(i+1, n, sum);
    // }
    // public static void main(String[] args) {
        
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter value of n");
    //     int n= sc.nextInt();
    //     printfact(1,n,1);
    // }


//fibonacci series 

    // public static void fibo(int a, int b, int n)
    // {   
    //     if(n==0)
    //     {
    //         return;
    //     }
    //     int c=a+b;
    //     System.out.print(c+" ");
    //     fibo(b, c, n-1);
    // }

    // public static void main(String[] args) {
    //     int a =0;
    //     int b =1;
    //     int n=7;
    //     System.out.print(a+" "+b+" ");
    //     fibo(a, b, n-2);
    // }
    

// print x^n(Stack height = n)

    // public static int calcpower(int x,int n){
    //     if(n==0)
    //     {
    //         return 1;
    //     }
    //     if(x==0)
    //     {
    //         return 0;
    //     }
    //     int xPnM1 =calcpower(x, n-1);
    //     //System.out.println(xPnM1);
    //     int xPn = x*xPnM1;
    //     //System.out.println("xPn:"+xPn);
    //     return xPn;//return x^n

    // }
    // public static void main(String[] args) {
    //     int x=2,n=5;
    //     int ans =calcpower(x, n);
    //     System.out.println(ans);
    // }

//  print x^n (Stack height = log n)

    // public static int printPower(int x, int n) {
    //     if(n == 0) {
    //     return 1;
    //     }
    //     if(n % 2 == 0) {
    //     return printPower(x, n/2) * printPower(x, n/2);
    //     }
    //     else {
    //     return x * printPower(x, n/2) * printPower(x, n/2);
    //     }
    //     }
    //     public static void main(String args[]) {
    //     int x = 2, n = 5;
    //     int output = printPower(x, n);
    //     System.out.println(output);
    //     }



//Tower of hanoi

    // public static void TowerOfHanoi(int n, String source, String helper, String destination)
    // {
    //     if(n==1){
    //         System.out.println("transfer disk "+n+" from "+source+" to "+destination);
    //         return;
    //     }
    //     TowerOfHanoi(n-1, source, destination, helper);
    //     System.out.println("transfer disk "+n+" from "+source+" to "+destination);
    //     TowerOfHanoi(n-1, helper, source, destination);
    // }
    // public static void main(String[] args) {
    //     int n=7;
    //     TowerOfHanoi(n, "S", "H", "D");
    // }


// reverse the string

    // public static void printrev(String str, int indx)
    // {
    //     if(indx==0)
    //     {
    //         System.out.print(str.charAt(indx));
    //         return;
    //     }
    //     System.out.print(str.charAt(indx));
    //     printrev(str, indx-1); 
    // }
    // public static void main(String[] args) {
    //     String str ="hello";
    //     printrev(str, str.length()-1); 
    // }

// print String first and last char

    // public static void firstANDlastchar(String str, int index)
    // {
    //     if(index==str.length())
    //     {
    //         return;
    //     }
    //     if(index==0||index==str.length()-1)
    //     {
    //     System.out.print(str.charAt(index));
    //     }
    //     firstANDlastchar(str, index+1);
        
        
    // }
    // public static void main(String[] args) {
    //         String str = "hello";
    //         firstANDlastchar(str, 0);
    //}


// occurance of letter
    
    // public static int first=-1;
    // public static int last=-1;
    // public static void firstANDlastchar(String str, int index,char element)
    // {
       
    //     if(index==str.length())
    //     {
    //         System.out.println(first);
    //         System.out.println(last);
    //         return;
    //     }
    //     if(str.charAt(index)==element)
    //     {
    //         if(first==-1)
    //         {
    //             first=index;
    //         }
    //         else{
    //             last=index;
    //         }  
    //     }
    //     firstANDlastchar(str, index+1,element);   
    // }
    // public static void main(String[] args) {
    //         String str = "abaacdaaafaah";
    //         firstANDlastchar(str, 0,'a');
    // }



//Move all x end of the String

    // public static void moveallX(String str, int idx,int count,String newString)
    // {
    //     if(idx==str.length())
    //     {   for(int i=1;i<=count;i++)
    //         {
    //             newString+='x';
    //         }
    //         System.out.println(newString);
    //         return;
    //     }
    //     if(str.charAt(idx)=='x')
    //     {
    //         count++;
    //         moveallX(str, idx+1, count, newString);
    //     }
    //     else{
    //         newString+=str.charAt(idx);
    //         moveallX(str, idx+1, count, newString);
    //     }
    // }
    // public static void main(String[] args) {
    //     String str ="axbxxcxd";
    //     moveallX(str, 0, 0,"");
    // }


// Remove duplicate 

    // public static boolean map[] = new boolean[26];
    // public static void removeDuplicate(String str, int idx, String newString )
    // {
    //     if(idx == str.length())
    //     {
    //         System.out.println(newString);
    //         return;
    //     }

    //     char currentchar= str.charAt(idx);
    //     if(map[currentchar-'a'] == true)
    //     {
    //         removeDuplicate(str, idx+1, newString);
    //     }
    //     else{
    //         newString += currentchar;
    //         map[currentchar-'a'] = true;
    //         removeDuplicate(str, idx+1, newString);
    //     }
    // }
    // public static void main(String[] args) {
    //     String str = "abaacbd";
    //     removeDuplicate(str, 0, "");
    // }
    


// important
//  Print all the subsequences of a String.

    // public static void subsequences(String str, int idx, String newString, HashSet<String> set)
    // {
    //     if(idx==str.length())
    //     {
    //         if(set.contains(newString))
    //         {
    //             return;
    //         }
    //         else{
    //             System.out.println(newString);
    //             set.add(newString);
    //             return;
    //         }
    //     }
    //     char currentchar = str.charAt(idx);

    //     //to be
    //     subsequences(str, idx+1, newString+currentchar,set);

    //     //or not to be
    //     subsequences(str, idx+1, newString,set);
    // }
    // public static void main(String[] args) {
    //     String str ="aaa";
    //     HashSet<String> set = new HashSet<>();//hash set of remove same occurance
    //     subsequences(str, 0, "",set);
    // }



//Print keypad combination

    // public static String keypad []={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yx"};
    
    // public static void printcombination(String str, int idx, String Combination)
    // {
    //     if(idx==str.length())
    //     {
    //         System.out.println(Combination);
    //         return;
    //     }
        
    //     char currChar = str.charAt(idx);
    //     String mapping = keypad[currChar -'0'];

    //     for(int i=0;i< mapping.length();i++)
    //     {
    //         printcombination(str, idx+1, Combination+mapping.charAt(i));
    //     }

    // }
    // public static void main(String[] args) {
    //     String str ="23";
    //     printcombination(str, 0, "");
    // }




//  Print all permutation of a String

    // public static void printperm(String str , String permutation)
    // {
    //     if (str.length()==0)
    //     {
    //         System.out.println(permutation);
    //         return;
    //     }
    
    //     for(int i=0; i<str.length();i++ )
    //     {
    //         char currentchar =str.charAt(i);
    //         String newstring = str.substring(0,i)+str.substring(i+1);
    //         printperm(newstring, permutation+currentchar);

    //     }
    // }
    // public static void main(String[] args) {
    //     String str = "abc";
    //     printperm(str, "");
    // }


//  Count total path in a maze n x m
    // public static int countpath(int i, int j, int n, int m)
    // {
    //     if(i==n||j==m){
    //         return 0;
    //     }
    //     if(i==n-1 && j==m-1 )
    //     {
    //         return 1;
    //     }

    //     //move downward
    //     int downpath= countpath(i+1, j, n, m);

    //     //move right
    //     int rightpath= countpath(i, j+1, n, m);

    //     return downpath+rightpath;
    // }

    // public static void main(String[] args) {
    //     int n=3;
    //     int m=3;
    //     int totalPath = countpath(0, 0, n, m);
    //     System.out.println(totalPath);
        
    // }



//  Place tiles of size 1 x M in a floor of size N x M


    // public static int PlaceTiles(int n,int m)
    // {
    //     if(n==m)
    //     {
    //         return 2;

    //     }

    //     if(n<m)
    //     {
    //         return 1;
    //     }

    //     //vertically
    //     int vertiPlacements = PlaceTiles(n-m, m);

    //     //horizontally
    //     int HoriPlacements = PlaceTiles(n-1, m);

    //     return vertiPlacements+HoriPlacements;
    // }
    // public static void main(String[] args) {
    //     int n=6;
    //     int m=2;
    //     System.out.println(PlaceTiles(n, m));
    // }


//  Print the number of ways in which you can invite n people to your party, single or in pair

    // public static int callGuest(int n)
    // {
    //     if(n<=1)
    //     {
    //         return 1;
    //     }

    //     //single
    //     int ways1= callGuest(n-1);

    //     //pair
    //     int ways2 = (n-1)*callGuest(n-2);

    //     return ways1+ways2;

    // }
    // public static void main(String[] args) {
    //     int n= 10;
    //     System.out.println(callGuest(n));
    // }


}
