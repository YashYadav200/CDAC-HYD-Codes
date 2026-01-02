/*Class and methods: Create a class Calculator with relevant data members and a
constructor. Implement methods for basic arithmetic operations (addition, subtraction,
multiplication, division, modulus) and demonstrate their usage.
*/  
public class Calculator{
 protected	double a;
 protected	double b;
  
  	public Calculator(double a, double b){
  		this.a = a;
  		this.b = b;
  	}
 	public double add(){
 		return a +b;
 	}
 	public double sub(){
 		return a - b;
 	}
 	public double mul(){
 		return a * b;
 	}
 	public void div(double a, double b){
 		if (b<=0) {
 			System.out.println("Invalid input");

 		}
 		else{
 			double res =  a / b;
 			System.out.println("Divison of two Number is :      "+res);
 		}
 	}
 	public void mod(double a, double b){
 		if (b<=0) {
 			System.out.println("Invalid input");

 		}
 		else{
 			double res =  a % b;
 			System.out.println("Modules of two Number is :      "+res);
 		}
 	}
 	public void disp(){
 		System.out.println(" Your inputs are : "+a+" And "+b);
 	}
}