package Week1.Dayy4;

import java.util.Arrays;

public class FindMissingElement2 {

	public static void main(String[] args) {
		
		int a[] = {1, 4,3,2,8, 5, 7}; 
		//int b=1;
		Arrays.sort(a);
		//1 2 3 4 6 7 8
		//0 1 2 3 4 5 6 iteration
		for(int i=0;i<a.length-1;i++)
		{
			
			if(a[i+1]-a[i]==1)
			{
				continue;
			}
			else
			{
				System.out.println(a[i]+1);
			}
		}

	}

}
