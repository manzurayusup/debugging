package org.studyeasy;

import java.util.ArrayList;
import java.util.List;

class D {
	private String name;

	public D(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + "]";
	}
	
}

public class LambdaForLoop {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(54);
		list.add(7);
		list.add(51);
		list.add(45);
		list.add(59);
		/*
		 * for (Integer i : list) { if (i >= 10) { System.out.println(i); } }
		 */

		/* 
		 * list.forEach(i -> System.out.println(i));
		 */
		
		list.forEach(i -> {
			if (i >= 10) {
				System.out.println(i);
			}
		});
		
		List<D> names = new ArrayList<>();
		names.add(new D("Roshan"));
		names.add(new D("Manzu"));
		names.add(new D("Osong'i"));
		names.add(new D("Ptq"));
		names.add(new D("Peruz"));
		
		names.forEach(temp->{
			System.out.println(temp.getName());
		});
		
	}

}
