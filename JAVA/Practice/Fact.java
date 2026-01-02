import java.util.*;
class Fact{
	public static void main(String[] args) {
		int fact= 1;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i=num; i!= 0 ;i-- ) {
			fact = i * fact;
			
		}
		System.out.println(fact);
	}
}