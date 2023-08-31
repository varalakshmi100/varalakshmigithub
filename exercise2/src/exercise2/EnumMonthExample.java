package exercise2;

import java.util.Scanner;

public class EnumMonthExample {
	enum Month{
		JANUARY(31),
		FEBRUARY(28),
		MARCH(31),
		APRIL(30),
		MAY(31),
		JUNE(30),
		JULY(31),
		AUGUST(31),
		SEPTEMBER(30),
		OCTOBER(31),
		NOVEMBER(30),
		DECEMBER(31);
		
		private final int days;
		Month(int days){
			this.days=days;
		}
		public int getDays() {
			return days;
		}
	}
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a month");
		String userInput=scanner.next();
		
		try {
			Month selectedMonth=Month.valueOf(userInput.toUpperCase());
			int daysInMonth=selectedMonth.getDays();
			System.out.println("Number of days in "+selectedMonth + ": " + daysInMonth);
		}
		catch(IllegalArgumentException e) {
			System.out.println("Invalid Month input.");
		}
		
	}

}
