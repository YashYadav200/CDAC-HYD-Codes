import java.util.*;
class Prime{
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i=2;i<9;i++ ) {
			if (num % i == 0) {
				System.out.println(+num +"Not prime number");
				return;
			}
			else{
				System.out.println(+num +"It is prime number");
				return;
			}
		}
	}
}