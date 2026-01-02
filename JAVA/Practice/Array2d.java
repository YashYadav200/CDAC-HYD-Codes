import java.util.*;
class Array2d{
	public static void main(String[] args) {
			int arr [][] = new int [4][4];
			for (int i=0;i<arr.length;i++) {
				for (int j=0;j<arr.length;j++) {
					arr[i][j] = (int)(Math.random()*10);
					System.out.print(" "+arr[i][j]);
				}
				System.out.println();
			   }
			   Scanner sc = new Scanner(System.in);
			   int x = sc.nextInt();
			   for (int i=0;i<arr.length;i++) {
				for (int j=0;j<arr.length;j++) {
					if (arr[i][j]==x) {
						System.out.print(" Element is at row : "+i+" Colume :"+j);
					}
					
				}
			}

	}
}