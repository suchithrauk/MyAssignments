package Week1.Dayy3;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int n=8;
		int c=0;
//		System.out.println(a);
//		System.out.println(b);
		
		for(int i=0;i<n;i++)
		{
			
		    c=a+b;
		    System.out.println(c);
		    a=b;
			b=c;

		}
		 
		
	}

}
