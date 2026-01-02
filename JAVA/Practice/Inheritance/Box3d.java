public class Box3d extends Box{
	protected double hieght;

	public Box3d(double length, double breath, double hieght){
		super(length, breath);
		this.hieght = hieght;
	}
	public double getVol(){
		return (length * breath * hieght);
	}
}