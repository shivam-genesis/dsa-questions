package arrayList;

import java.util.ArrayList;

public class ExampleOne {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("apple");
		list.add("banana");
		list.add("orange");
		list.add("grapes");

		
		list.set(1, "mango");
		list.remove(3);
		System.out.println(list.contains("orange"));
		
		System.out.println(list.get(0));
		
		for (String item : list) {
			System.out.println(item);
		}
		
		
		
		
		String arr[] = new String[list.size()];
		list.toArray(arr);
		
		for(String item:arr) {
			System.out.println(item);
		}
		
	}
}
