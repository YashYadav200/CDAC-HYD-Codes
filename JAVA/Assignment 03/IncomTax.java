import java.util.*;
class IncomTax{
	public static void main(String[] args) {
		System.out.println("Enter Your Salary");
		Scanner sc = new Scanner(System.in);
		double tax = 0;
		double income = sc.nextDouble();
		System.out.println("Your income is : "+income);
		if (income<=250000) {
			System.out.println("Tax is : ");
		}
		else if (income<=500000) {
			tax = (income - 250000) * 0.05;
		}
		else if (income<=1000000) {
			tax =(((income - 250000) * 0.05) + (income - 500000) )* 0.20;
		}
		else if (income>1000000) {
			tax = ((((income - 250000) * 0.05) + (income - 500000) * 0.20)) + (income - 1000000) * 0.20;
		}
		
		System.out.println("Your Tax "+tax);

	}
}