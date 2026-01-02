class ArrSqOdd{
	public static void main(String[] args) {
		int arr [] = new int [10];
		for (int i = 0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*25);
			System.out.print(" "+ arr[i]);
		}
		System.out.println("\nNew Array is");
		for (int i = 0 ;i<arr.length ;i++ ) {
			if (i%2!=0) {
				arr[i] = arr[i] * arr[i];
			}
		System.out.print(" "+arr[i]);
		}
	}
}