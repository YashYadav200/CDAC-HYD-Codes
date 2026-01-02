import java.util.*;
class Incometax{
	public static void main(String[] args) {
		System.out.println("Income Tax");
	System.out.println("Income <= 2,00,000 -> No tax");	
    System.out.println("2,00,001 to 5,00,000 -> 5% tax");
    System.out.println("5,00,001 to 10,00,000 -> 20% tax");
    System.out.println("Above 10,00,000 -> 30% tax");
    System.out.println("Enter Your Salary");

		Scanner sc = new Scanner(System.in);
		double tax = 0;
		int income = sc.nextInt();
		int n = income/100000;
		switch(n){
		case 2: System.out.println("Your Income Tax is : "+tax);break; 
		case 3: 

		case 4: 

        case 5: tax = (income - 250000) * 0.05;
        	 	System.out.println("Your Income Tax is "+tax);break;

        case 6: 

        case 7:

        case 8:

        case 9:

        case 10:tax =(income - 250000) * 0.05 + ((income - 500000) * 0.20);
        		System.out.println("Your Income Tax is "+tax);break;

        default:
        	 tax = (250000 * 0.05) + (500000 * 0.20) + ((income - 1000000) * 0.30);
        	System.out.println("Your Income Tax is "+tax);
        	break;
		}
	}
}