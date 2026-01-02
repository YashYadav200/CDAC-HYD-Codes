import java.util.*;
class ArrSearch{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int flag = 0;
		int arr[] = new int [10];
		
		for (int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*25);
			System.out.print(" "+arr[i]);
		}
		System.out.println("\nEnter the Number you want to Search :");
		int num = sc.nextInt();
		for (int i= 0;i<arr.length;i++) {
			if (arr[i]==num) {
				System.out.println("Numbeer  "+num+" Found At Position "+i);
				flag++;
				return;
			}
			
		}
		if (flag==0) {
			System.out.println("Number "+num+" Not Found in the Array");
	
		}
	}
}