package practice;

import java.util.Arrays;

public class merge_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] a = {1,2,3,4,5};
		int [] b = {6,7,8,9};
		
		
		int [] c = new int[a.length+b.length];
		
		int m=0;
		
		for(int i=0;i<a.length;i++) {
			c[m++] = a[i];
		}
		
		for(int j=0;j<b.length;j++) {
			c[m++] = b[j];
		}
		
		System.out.println(Arrays.toString(c));

	}

}
