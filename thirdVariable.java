
public class thirdVariable {
	
	public static void main(String[] args) {
		
		int x=3, y=4;
		
		System.out.println("value of x:"+ x );
	
		System.out.println("value of y:"+y);
		x=x+y;
		y=x-y;
		x=x-y;
		
		
		System.out.println("value of x after swap:" + x ) ;
		
		System.out.println( "value of y after swap:"+y);
	
	}

}
