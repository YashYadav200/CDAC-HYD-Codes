//Class and methods: Create a class Calculator with relevant data members and a constructor. Implement methods for basic arithmetic operations (addition, subtraction, multiplication, division, modulus) and demonstrate their usage.
public class Calculator{
	protected double a;
	protected double b;
	protected double sum;
	protected double sub;
	protected double mul;
	protected double div;
  public void getCal(double a, double b){
  	this.a = a;
  	this.b = b;
  }
  public void add(double sum, double a, double b){
  	this.sum = this.a + this.b;
  }
  public void sub(double sub, double a, double b){
  	this.sub = this.a - this.b;
  }
  public void mul(double mul, double a, double b){
  	this.mul = this.a * this.b;
  } 
  public void div(double div, double a, double b){
  	this.div = this.a / this.b;
  }
  public void disp(){
  	System.out.println(this.sum);
  	System.out.println(sub);
  	System.out.println(mul);
  	System.out.println(div);
  }

}