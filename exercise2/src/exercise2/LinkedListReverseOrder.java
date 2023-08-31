package exercise2;

import java.util.LinkedList;

public class LinkedListReverseOrder {
	public static void main(String[] args) {
		LinkedList<String> namesList=new LinkedList<>();
		namesList.add("Ganga");
		namesList.add("Yamuna");
		namesList.add("Narmada");
		System.out.println("Names in reverse order:");
		for(int i=namesList.size()-1;i>=0;i--) {
			System.out.println(namesList.get(i));
		}
		
	}

}
