// A = P * T * R / 100;
class SimIntrest{
	public static void main(String[] args) {
		if (args.length < 3) {
			System.out.println("Enter Valid Values");
		}
		Double P = Double.parseDouble(args[0]);
		Double T = Double.parseDouble(args[1]);
		Double R = Double.parseDouble(args[2]);
		Double A = P * T * R / 100;
		System.out.println("Amount is : "+A);
	}
}