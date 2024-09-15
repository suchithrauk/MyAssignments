package Week1.Dayy4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintDuplicates {

		public static void main(String[] args) {
			
			int[] num = {2,5,7,7,5,9,2,3};
			
			Arrays.sort(num);
			
			int lengthOfArrays = num.length;
			
			for(int i=0;i<lengthOfArrays-1;i++) {
				if(num[i]==num[i+1]) {
					
					System.out.println("The Duplicate value is " + num[i]);
				}
				
			}
			
			
			}
}
