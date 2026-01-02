import java.util.*;
class Checknum{
		public static void main(String[] args) {
			System.out.println("Enter the Number : ");
			Scanner sc = new Scanner(System.in);
			double num = sc.nextInt();

			if (num>0) {
				System.out.println(num + " Is positive");
			}
			 if (num<0) {
					System.out.println(num + " Is Negative");
			 }
			
			else if(num==0){
				System.out.println(num + " Is zero ");

			}
			
			}
		
}