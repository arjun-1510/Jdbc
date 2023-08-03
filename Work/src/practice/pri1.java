package practice;

public class pri1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int end = 10;
		
		boolean b = true;
		
		
		for(int i=0;i<end;i++) {
			
			if(i !=0 && i!=1) {
				b=true;
				
				
				for(int j=2;j<i;j++) {
					
					
					
					if(i%j==0) {
						b=false;
					}
					
				}
				
				if(b) {
					System.out.println(i);
				}
			}
			
			
		}

	}

}
