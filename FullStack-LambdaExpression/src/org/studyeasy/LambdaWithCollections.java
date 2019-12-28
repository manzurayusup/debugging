package org.studyeasy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Data {
	private String name;

	public Data(String name) {
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

public class LambdaWithCollections {

	public static void main(String[] args) {
		List<Data> list = new ArrayList<>();
		list.add(new Data("Manzura"));
		list.add(new Data("Hotamtoy"));
		list.add(new Data("Ravshanbek"));
		list.add(new Data("Feruzahon"));
		list.add(new Data("Osiyo"));
		/*
		 * The long way:
		 * 
		 * Collections.sort(list, new Comparator<Data>() {
		 * 
		 * @Override public int compare(Data o1, Data o2) { return
		 * o1.getName().compareTo(o2.getName()); } });
		 */

		// Short-cut using lambda expression:
		Collections.sort(list, (Data o1, Data o2) -> {
			// multiple 
			//	statements 
			// 	  can be executed 
			//	     using braces
			return o1.getName().compareTo(o2.getName());
			
		});

		for (Data d : list) {
			System.out.println(d.getName());
		}
	}

}
