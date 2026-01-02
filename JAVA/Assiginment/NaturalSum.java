class NaturalSum{
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Enter Valid Values :");
		}
	 double n = Double.parseDouble(args[0]);
	 double sum = sum = (n * (n + 1)) / 2;
	 System.out.println("Sum of First 10 Natural Numbers: "+ sum);
	}
}