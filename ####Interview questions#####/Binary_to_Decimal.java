public class Binary_to_Decimal {
    public static int getDecimal(int binary){  
        int decimal = 0;  
        int n = 1;  
        while(true){  
          if(binary == 0){  
            break;  
          } else {  
              int temp = binary%10;  
    //           decimal += temp*Math.pow(2, n);  
                 decimal+=(temp*n);
                 n=n*2;
              binary = binary/10;  
        
           }  
        }  
        return decimal;  
    }  
    public static void main(String args[]){    
    System.out.println("Decimal of 1010 is: "+getDecimal(1111)); 

    }






    
    // public static void main(String[] args) {
    //     int bin=1010;
    //     int deci=0;
    //     int rem;
    //     int j=1;
    //     for(int i=bin;i>0;i--)
    //     {
    //         rem=bin%10;
    //         deci=deci+(rem*j);
    //         j=j*2;
    //         bin=bin/10;
    //     }
    //     System.out.println(deci);
    // }














// public static long convertDecimalToBinary(int n) {

//     long binaryNumber = 0;
//     int remainder, i = 1, step = 1;

//     while (n!=0) {
//       remainder = n % 2;
//         // System.out.println("Step " + step++ + ": " + n + "/2");

//         // System.out.println("Quotient = " + n/2 + ", Remainder = " + remainder);
//         n /= 2;

//         binaryNumber += remainder * i;
//         i *= 10;
//     }
    
//     return binaryNumber;
//     }
// public static void main(String[] args) {

//     // decimal number
//     int num = 10;
//     // System.out.println("Decimal to Binary");

//     // call method to convert to binary
//     long binary = convertDecimalToBinary(num);

//     System.out.println("\n" + num + " = " + binary);
//     }

  
}
 