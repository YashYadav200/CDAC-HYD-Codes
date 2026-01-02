class CompIntrest{
	public static void main(String[] args) {
		if (args.length < 4) {
			System.out.println("Enter Valid Values :");
		}
		Double P = Double.parseDouble(args[0]);
		Double T = Double.parseDouble(args[1]);
		Double R = Double.parseDouble(args[2]);
		Double N = Double.parseDouble(args[3]);
		Double A = P * Math.pow((1 + (R / (100 * N))), N * T);
		Double CompIntrest = A - P;
		System.out.println("Compound Intrest is : "+ CompIntrest);
		System.out.println("The Total Amount is :"+A);
	}
}