import java.util.*;
class DayOfWeek{
	public static void main(String[] args) {
		System.out.println("Enter the Day");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch(n)
		{

		case 1:
		 System.out.println(n+" -> Sunday"); 
		 break;
		case 2:
		 System.out.println(n+" -> Monday"); 
		 break;
		case 3:
		 System.out.println(n+" -> Tuesday"); 
		 break;
		case 4:
		 System.out.println(n+" -> Wednesday"); 
		 break;
		case 5:
		 System.out.println(n+" -> Thursday"); 
		 break;
		case 6:
		 System.out.println(n+" -> Friday"); 
		 break;
		case 7:
		 System.out.println(n+" -> Saturday"); 
		 break;
		default:
		 System.out.println("Invalid Input");
		 break;

		} 
	}
}