package exercise2;

import java.util.ArrayList;

public class ArrayListSum {
	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(5);
		numbers.add(6);
		int sum=0;
		for(int i=0;i<numbers.size();i++) {
			int num=numbers.get(i);
			sum+=num;
		}
		System.out.println("Sum of integers: "+sum);
		
		
	}

}
