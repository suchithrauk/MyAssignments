package Week1.Dayy4;

public class Palindrome {
	
public static void isPalindrome(int num) {
	int originalNum= num;
	int reversedNumber = 0;
	while(num>0)
	{
		int r= num%10;
		reversedNumber = reversedNumber*10+r;
		num/=10;
		//num is equal to num/10
	}
	if(originalNum==reversedNumber)
	{
		System.out.println("its Palindrome");
		
	}
	else
	{
		System.out.println("Not a palindrome");
	}
}

	public static void main(String[] args) {
		
		Palindrome.isPalindrome(121);
		Palindrome.isPalindrome(12345);
	}
		
	
   
	
	

}
