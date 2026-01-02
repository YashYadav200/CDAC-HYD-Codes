import java.util.*;
class CalMain{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your inputs");
		System.out.println("First number :");
		double x = sc.nextDouble();
		System.out.println("Second Number");
		double y = sc.nextDouble();
		Calculator c = new Calculator(x,y);

		System.out.println("Addition of two Number is       "+c.add());
		System.out.println("Subtraction of two Number is    "+c.sub());
		System.out.println("Multiplication of two Number is "+c.mul());
		c.div(x,y);
		c.mod(x,y);

	}
}