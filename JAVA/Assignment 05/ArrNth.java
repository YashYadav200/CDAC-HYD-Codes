class ArrNth{
	public static void main(String[] args) {
		int arr[] = new int [10];
		System.out.println("Array is :");
		for (int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100);
			System.out.print(" "+arr[i]);
		}
		System.out.println();
		System.out.println("Acending Order: ");
		
		for (int i = 0;i<arr.length;i++) { // {1,2,3,4,3,2,5}
			 int m = i;
		for (int j = i;j<arr.length;j++ ) {
			if (arr[j]<arr[m]) {
				m = j;
			}
		}
		int temp = arr[m];
		arr[m] = arr[i];
		arr[i] = temp;
		}
		for (int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println();
		System.out.println("Decending Order: ");
		
        for (int i = 0;i<arr.length;i++) { // {1,2,3,4,3,2,5}
			 int m = i;
		for (int j = i;j<arr.length;j++ ) {
			if (arr[j]>arr[m]) {
				m = j;
			}
		}
		int temp = arr[m];
		arr[m] = arr[i];
		arr[i] = temp;
		}
		for (int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
	}
}