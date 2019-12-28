package org.studyeasy;

interface Lambda {
	 public void demo();
}
public class LambdaMoreThings {
	public static void main(String[] args) {
		int x = 10;	// anonymous inner class (or lambda exp) can access this var
		
		Lambda lambda = new Lambda() {
			int test = 101;  
			@Override
			public void demo() {
				System.out.println("x = " + x);			
			}
		};
		
		lambda.demo();
	}

}
