/*Using this in Constructors: Create a class Rectangle with attributes length and width.
Implement a parameterized constructor that initializes these attributes.
 Use this to differentiate between class variables and constructor parameters. 
 Include methods to calculate the area and
perimeter.*/
import java.util.*;
public class Rectangle{
	
		 protected double length;
		 protected double width;
		 
		 public Rectangle(double length, double width){
		 	this.length = length;
		 	this.width = width;
		 }
		 public double areaRec(){
		 	return length * width;
		 }
		 public double perimeter(){
		 	return 2 * (length + width);
		 }
		 public void disp(){
		 	System.out.println("Length is : "+length);
		 	System.out.println("Width is  : "+width);
		 }
	}
