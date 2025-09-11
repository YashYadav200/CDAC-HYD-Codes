//formula: F = (C * 9/5) + 32.
class Temperature{
	public static void main(String[] args)
	 {
		if (args.length < 1) 
		{
		 System.out.println("Enter the Proper Parameter");
		 return;
		}

        Double Cels = Double.parseDouble(args[0]);

		Double Ferin = (Cels * 9/5) + 32 ; 

		System.out.println("Celsius to Fahrenheit is : "+Ferin);
	}
}