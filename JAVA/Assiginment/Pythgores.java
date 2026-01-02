class Pythgores{
	public static void main(String[] args) {
		if (args.length<2) {
			System.out.println("Enter Valide Parameter");
		}
		Double s1 =  Double.parseDouble(args[0]);
		Double s2 = Double.parseDouble(args[1]);
		Double Hypo = Math.sqrt((s1*s1) + (s2*s2));
		System.out.println("Hypotanoues is : "+ Hypo);
	}
}