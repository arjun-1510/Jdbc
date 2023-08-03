package practice;

import java.util.Arrays;

public class bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {1,15,3,4,5,10,9,7,100};
		
		int temp = 0;
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length-1;j++) {
				if(a[i] >  a[j]) {
					
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
					
					
					
				}
				
			}
		}
			System.out.println(Arrays.toString(a));
			
		}
		
		

	

}
