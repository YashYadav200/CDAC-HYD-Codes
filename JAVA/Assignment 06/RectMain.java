import java.util.*;
 public class RectMain{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		double l = sc.nextDouble();
		System.out.println("Enter Width");
		double w = sc.nextDouble();
		Rectangle r = new Rectangle(l,w);
		r.disp();
		System.out.println("Area of Rectangle is      : "+r.areaRec());
		System.out.println("Perimeter of Rectsngle is : "+r.perimeter());
	}
}