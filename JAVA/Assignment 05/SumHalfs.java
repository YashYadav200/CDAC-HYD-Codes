class SumHalfs{
	public static void main(String[] args) {
		int arr [] = new int [10];
		int halfsum1 = 0;
		int halfsum2 = 0;

		for (int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()* 25);
			System.out.println(" "+arr[i]);
		}
     	int n = arr.length;
     	System.out.println(n);

     	for (int i=0;i<n/2 ;i++) {
     			halfsum1 += arr[i];
     			}		
     	for (int i=n/2;i<n;i++) {
     		halfsum2 += arr[i];
     	}
     	System.out.println("Sum of First Half of Array is : "+halfsum1+"\n Sum of Second Half of Array is : "+halfsum2);

	}
}