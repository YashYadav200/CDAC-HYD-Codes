class MinMax{
	public static void main(String[] args) {
		int arr[] = new int [10];

		for (int i = 0;i<arr.length ;i++ ) {
			arr[i] = (int) (Math.random() * 25);
			System.out.print(" "+arr[i]);
		}
		int min = arr[0];
		int max = arr[0];	

		for (int i = 1;i<arr.length;i++) {
			if (arr[i]<min) {
				min = arr[i];
			}
			if (arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println(" min : "+min+" max :"+max);
	}
}