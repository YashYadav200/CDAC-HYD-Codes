import java.util.*;
public class Transfer{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		double amt;

		System.out.println("");
		System.out.println("Hello BANK OF INDIA");
		System.out.println("*****************************");

		BankAccount b = new BankAccount(324565,"Fixed");
		System.out.println("Intrest is :"+ BankAccount.intrest(40));
		System.out.println("Rate Intrest is:"+BankAccount.interestRate);
		System.out.println("Enter \n1.Deposite Money \n2.Withdraw Money");
		n = sc.nextInt();
		switch (n) {
			case 1:
			System.out.println("Enter Amount to Deposite : ");
            amt = sc.nextDouble(); 
            if(amt>0){
			b.setdata(amt);
			b.Deposite(amt);
		}
		else System.out.println("Invalid Amount");
			break;

		case 2: 
			System.out.println("Enter Amount to Withdraw : ");
            amt = sc.nextDouble();
            if(amt>0){
			b.setdata(amt);
			b.Withdraw(amt);
		}
		else System.out.println("Invalid Amount");
		break;
         default:
         	System.out.println("Invalid Input!!!!");
         	break;
		}
		System.out.println("********Account Details**********");
		b.display();
      	
	}
}