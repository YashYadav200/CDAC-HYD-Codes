public class BoxMain{
	public static void main(String[] args) {
		System.out.println("*******BOX********");
		
		Box b1 = new Box(5.0,7.0);
		System.out.println("Area of Box is :"+ b1.getArea());

		Box3d b2 = new Box3d(5.0,7.0,7.0);
		System.out.println(" Volume of 3D Box is : "+b2.getVol());
		
	}
}