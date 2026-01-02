import java.util.*;
class Months{
	public static void main(String[] args) {
		System.out.println("Enter the Month");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch(n)
		{

		case 1:
		 System.out.println(n+" -> January"); 
		 break;
		case 2:
		 System.out.println(n+" -> February"); 
		 break;
		case 3:
		 System.out.println(n+" -> March"); 
		 break;
		case 4:
		 System.out.println(n+" -> April"); 
		 break;
		case 5:
		 System.out.println(n+" -> May"); 
		 break;
		case 6:
		 System.out.println(n+" -> June"); 
		 break;
		case 7:
		 System.out.println(n+" -> July"); 
		 break;
		case 8:
		 System.out.println(n+" -> August"); 
		 break;
		case 9:
		 System.out.println(n+" -> September"); 
		 break;
        case 10:
		 System.out.println(n+" -> Octumber"); 
		 break;
		 case 11:
		 System.out.println(n+" -> November"); 
		 break;
		case 12:
		 System.out.println(n+" -> December"); 
		 break;
		default:
		 System.out.println("Invalid Input");
		 break;

		} 
	}
}