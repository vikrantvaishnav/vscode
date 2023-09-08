public class Decimal_to_Binary {
        
    //  public static void toBinary(int decimal){    
    //     int binary[] = new int[40];    
    //      int index = 0;    
    //      while(decimal > 0){    
    //      binary[index++] = decimal%2;    
    //     decimal = decimal/2;    
    //     }    
    //      for(int i = index-1;i >= 0;i--){    
    //        System.out.print(binary[i]);    
    //      }    
    // System.out.println();//new line  
    // }    
    // public static void main(String args[]){      
    // System.out.println("Decimal of 10 is: ");  
    // toBinary(5); 
    // }


    public static void main(String[] args) {
      int rem ;
      int deci =10;
      String bin="";

      while(deci >0){
        rem = deci %2;
        String s= Integer.toString(rem);
        bin = s+bin;
        deci = deci/2;
      }
      System.out.println(bin);
    }
}
