package practice;

public class fibo_witout_temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a =0;
		int b=1;
		
		
		for(int i=2;i<10;i++) {
			
			b=a+b;
			System.out.println(b);
			
			
			a=b-a;
		}

	}

}
