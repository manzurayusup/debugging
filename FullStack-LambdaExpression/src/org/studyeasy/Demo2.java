package org.studyeasy;
/**
 * Runnable interface is a functional interface.
 * This code shows how to use lambda expression when passing a Runnable to 
 * Thread constructor.
 * @author manzura
 *
 */
public class Demo2 {

	public static void main(String[] args) {
		Thread thread1 = new Thread(()->{
			System.out.println("Inside thread 1 using lambda expression");
			System.out.println("This is line 2");
			System.out.println("hahaha");
			});
		
		thread1.start();
	}

}
