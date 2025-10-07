package commandline;

public class Sum {

//	public static void main(String[] args) {	
////		System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
//	 
//	 int a = Integer.parseInt(args[0]);
//	 
//	 int HRA= (a*15)/100;
//	 int Conv=(a*15)/100;
//	 int Enter=(a*10)/100;
//	 
//	 float TotalSalary= a+HRA+Conv+Enter;
//	 
//	 System.out.println("the total salray is " + TotalSalary);
//	  
// }
	
	

//		public static void main(String[] args) {
//			
//			
//			int a = Integer.parseInt(args[0]);
//			 int result =0;
//			int orginal;
//			
//		   orginal = a;
//		   
//		   for (; a>0;a=a/10) {
//			   
//			   int arm = a%10;
//			   int digit = arm*arm*arm;
//			   
//			   result+= digit;
//			    
//		   }
//		   if(result==orginal) {
//			   System.out.print("armstrong");
//		   }
//		   else {
//			   System.out.print("not armstrong");
//			   
//		   }
//			
//			
//
//		}

	
	
	
	
	
	    public static void main(String[] args) {

	        String result = "";

	        for (int i = 0; i < args.length; i++) {
	            result = result+args[i];
	            if (i < args.length - 1) {
	                result += "-";
	            }
	        }

	        System.out.println("Concatenated String: " + result);
	    }
	

}
