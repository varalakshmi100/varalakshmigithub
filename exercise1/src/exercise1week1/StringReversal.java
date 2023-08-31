package exercise1week1;

public class StringReversal {
	public static void main(String[] args)
	{
		String str="Vara";
		String revString= "";
		
		
		
	for(int i=str.length()-1;i>=0;--i) {
		revString +=str.charAt(i);
		}
	System.out.println(revString);
		
	}
	
	

}
