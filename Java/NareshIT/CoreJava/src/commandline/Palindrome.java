package commandline;

public class Palindrome {
	
//	public static int palind(int num, int reverse) {
//		if(num == 0) {
//			return reverse;
//		}
//		
//		reverse = (reverse*10)+num%10;
//		return palind(num / 10, reverse);
//		
//		
//	}
//
//	public static void main(String[] args) {
//		
//		int num =121;
//		
//		int rev = palind(num,0);
//		System.out.println(rev);
//		
//		
//		if(num==rev) {
//			System.out.println("palindrome");
//			
//		}
//		else {
//			System.out.println("Not palindrome");
//		}
//		
//	}
	
	
	
	
	
	public static void main(String [] args) {
		
		
		int num= Integer.parseInt(args[0]);
		int temp = num;
		int rev=0;
		
		for(int i=1;temp>0;i++) {
			
			rev = (rev*10)+temp%10;
			temp = temp/10;
			
		}
//		System.out.println(rev);
		if(num==rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}
	
	

}
