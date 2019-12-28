package org.studyeasy;

/**
 * Functional interface MyInterface:
 * functional interfaces cannot have more than one abstract method.
 * @author manzura
 *
 */
interface MyInterface {
	abstract public void demo();
}

public class Demo1 {

	public static void main(String[] args) {
		/*
		 * Without lambda expression:
		 * 
		MyInterface mi = new MyInterface() {
			
			@Override
			public void demo() {
				System.out.println("The demo method");			
			}		
		};
		mi.demo();
		*/
		
		/*
		 * With lambda expression:
		 */
		MyInterface mi = ()->System.out.println("First statement");
		mi.demo();
		
		/*
		 * With lambda expression and multiple statements:
		 */
		MyInterface mi2 = ()->{
			System.out.println("First statement");
			System.out.println("Second statement");
			System.out.println("Third statement");
			System.out.println(":)");
		};
		mi2.demo();
		
		
	}

}
