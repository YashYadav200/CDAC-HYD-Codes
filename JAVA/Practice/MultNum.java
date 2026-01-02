import java.util.*;
class MultNum{
	public static void main(String[] args) {
		int table;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		for (int i = 1;i<=10 ;i++ ) {
			table = num * i ;
			System.out.println(num+" * "+i+" = "+ table);
		}
	}
}