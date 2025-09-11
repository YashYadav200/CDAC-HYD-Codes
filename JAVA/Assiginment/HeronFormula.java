//s = (a + b + c) / 2
//A = sqrt(s * (s - a) * (s - b) * (s - c))
class HeronFormula{
	public static void main(String[] args) {
		if (args.length < 3) {
			System.out.println("Enter Valid Values :");
		}
	    double a = Double.parseDouble(args[0]);
	    double b = Double.parseDouble(args[1]);
	    double c = Double.parseDouble(args[2]);

	    double s = (a + b + c)/2;
	    System.out.println("Semiperimeter is : "+ s);

	    double A = Math.sqrt(s * (s - a) * (s - b) * (s - c));
	    System.out.println("Area of Triangle by Heron Formula is :"+ A);
	    	
	    }

	}

