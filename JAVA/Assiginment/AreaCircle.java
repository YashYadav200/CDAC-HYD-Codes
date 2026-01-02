class AreaCircle{
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Enter Radius only");
		}
		Double r = Double.parseDouble(args[0]);
		Double Area = 2 * 3.14 * r * r;
		System.out.println("Area Of Circle is :"+Area);
	}
}