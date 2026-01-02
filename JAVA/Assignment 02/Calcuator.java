import java.util.*;
class Calcuator{
	public static void main(String[] args){
		int n;
		double res;
	do
	{
		System.out.println("Simple Calculator ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number");
		Double a = sc.nextDouble();
		System.out.println("Enter the First Number");
		Double b = sc.nextDouble();

		System.out.println("Choose operation: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
		n = sc.nextInt();
		
		switch(n)
		{
		case 1 :
			System.out.println("Adition");
			res = a + b;
			System.out.println("Result is "+ res);
			break;
		case 2 :
			System.out.println("Subtract");
			res = a - b;
			System.out.println("Result is "+ res);
			break;
		case 3 :
			System.out.println("Multiplication");
			res  = a * b;
			System.out.println("Result is "+ res);
			break;
		case 4 :
			System.out.println("Divison");
			if(b==0){
				System.out.println("Invalid input");
			}
			else{
			res = a / b;
			System.out.println("Result is " + res);
			break;}
		case 5 :System.out.println("Exit");
			break;
		default :
			System.out.println("Invalid Input");
		} 
	}
	while(n != 5);
	}
}