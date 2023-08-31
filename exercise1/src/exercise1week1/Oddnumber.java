package exercise1week1;

public class Oddnumber {
	public static void main(String[] args) {
		int n=9;
		trynumber(n);
		n=8;
		trynumber(n);
	}
	public static void trynumber(int n) {
		try
		{
			checkEvenNumber(n);
			System.out.println(n  + " is even");
		}
		catch(IllegalArgumentException e) {
			System.out.println("Error:"+e.getMessage());
		}
	}
	public static void checkEvenNumber(int number) {
		if(number%2!=0) {
			throw new IllegalArgumentException(number + " is odd.");
		}
	}

}
