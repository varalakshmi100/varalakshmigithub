package exercise1week1;

public class StringReverser {
	public static void main(String[] args) {
		String input="Hello, World!";
		String reversed=reverseString(input);
		System.out.println("Reversed String:"+reversed);
		
	}
	public static String reverseString(String input)
	{
		StringBuilder stringBuilder=new StringBuilder(input);
		return stringBuilder.reverse().toString();
	}

}
