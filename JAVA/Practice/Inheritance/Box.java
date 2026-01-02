public class Box{
	protected double length;
	protected double breath;

	public Box(double length, double breath){
		this.length = length;
		this.breath = breath;
	}
	public double getArea(){
		return length * breath;
	}
}