class RectArea{
	public static void main(String[] args) {
		if (args.length < 2) 
		{
		 System.out.println("Enter the Proper Parameter");
		 return;
		}
		Double a = Double.parseDouble(args[0]);
		Double b = Double.parseDouble(args[1]);
		Double Area = a * b;
		System.out.println("Area Of Rectangle is : "+Area);
	}
}