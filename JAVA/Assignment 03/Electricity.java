import java.util.*;
class Electricity{
	public static void main(String[] args) {
		System.out.println("Electricity Bills");
		double bill = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Units");
		int units = sc.nextInt();
     	int n = units/100;
		switch(n){
		case 1: bill = (5*units);
			System.out.println("Electricity bill is "+ bill);break;

		case 2:bill = (100 * 5)+((units-100) * 6);
			System.out.println("Your units Bill  is : "+bill );break; 
		case 3: 
			bill = (100 * 5)+(100* 6)+((units-200)*7);
			System.out.println("Your units Bill  is : "+bill );break; 
        default:
        	bill = (100 * 5)+(100* 6)+(100 * 7)+((units - 300)*8);
        	System.out.println("Your units Bill  is "+bill );

        }
    }
  }
