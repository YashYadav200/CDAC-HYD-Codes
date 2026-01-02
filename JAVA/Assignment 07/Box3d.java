public class Box3d extends Box{
	double height;

	public Box3d(double length, double breadth, double height) {
		super(length , breadth);
		this.height = height;
	}
	public double Area(){
		return length*breadth*height;
	}
}