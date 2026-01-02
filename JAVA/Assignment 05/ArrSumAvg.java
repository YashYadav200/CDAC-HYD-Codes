class ArrSumAvg{
	public static void main(String[] args) {
		int arr[] = new int [10];
		int sum = 0;
		int avg = 0;
        System.out.println("Array is: ");
		for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100);
            System.out.print(" "+arr[i]);
            sum += arr[i];
        }
        System.out.println();
        avg = sum / arr.length;
        System.out.println("Sum of Array is :"+sum+" Average of Array is :"+avg);
    }
}