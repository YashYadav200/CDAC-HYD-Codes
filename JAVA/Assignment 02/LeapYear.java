import java.util.*;
class LeapYear{
	public static void main(String[] args) {
		System.out.println("Enter the year");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if (year%400==0||year%4==0 || year%100 == 0) {
			System.out.println(year + " It is a leap Year");
		}
		else {
			System.out.println( " Not a Leap Year");
		}
	}
}