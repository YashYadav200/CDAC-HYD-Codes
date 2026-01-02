class ArrRev{
	public static void main(String[] args) {
		int arr[] = new int [10];
		for (int i=0;i<arr.length;i++) {
		 	arr[i] = (int)(Math.random()*25);
		 	System.out.print(" "+arr[i]);		
		}  		
		System.out.println("\nReverse Array is: ");
		for (int i = 9;i>=0 ;i--) {
				System.out.print(" "+arr[i]);
		}		
	}
}