import java.util.*;
class LargestNum{
	public static void main(String[] args)
	 {
		System.out.println("Enter the Three Numbers to check which is greater");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st Number");
		int a = sc.nextInt();

		System.out.println("Enter 2nd Number");
		int b = sc.nextInt();

		System.out.println("Enter 3rd Number");
		int c = sc.nextInt();

		int grt = (a>b) ?((a>c)?a:c):((b>c)?b:c);


		System.out.println("The grestest number among three number is " + grt);
	}
}