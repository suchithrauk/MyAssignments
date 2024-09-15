package Week1.Dayy4;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		
		int a[] = {1, 4,3,2,8, 6, 7}; 
		int b=1;
		Arrays.sort(a);
		//1 2 3 4 6 7 8
		//0 1 2 3 4 5 6 
		for(int i=0;i<a.length;i++)
		{
			
			if(b==a[i])
			{
				b=b+1;
		
			}
			else
			{
				System.out.println(b);
				break;
			}
		}

	}

}
