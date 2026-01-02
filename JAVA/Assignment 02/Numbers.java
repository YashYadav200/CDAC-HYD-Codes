import java.util.*;
class Numbers{
	public static void main(String[] args){
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		n = sc.nextInt();
		
		switch(n)
		{
		case 1 :
			System.out.println(n+"-> ONE");
			break;
		case 2 :
			System.out.println(n+"-> TWO");
		
			break;
		case 3 :
			System.out.println(n+"-> THREE");
			break;
		case 4 :
			System.out.println(n+"-> FOUR");
			break;
		case 5 :System.out.println(n+"-> FIVE");
			break;
		case 6 :
			System.out.println(n+"-> SIX");
			break;
		case 7 :
			System.out.println(n+"-> SEVEN");
		
			break;
		case 8 :
			System.out.println(n+"-> EIGHT");
			break;
		case 9 :
			System.out.println(n+"-> NINE");
			break;
		case 10 :
			System.out.println(n+"-> TEN");
			break;
		default :
			System.out.println("Invalid Input");
		} 
	}
}
