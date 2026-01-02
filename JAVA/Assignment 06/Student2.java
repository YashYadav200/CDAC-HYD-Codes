import java.util.*;
public class Student2 extends Student{
	Scanner sc = new Scanner(System.in);
	
	public void setdata(){
		System.out.print("Name   : ");
		String name = sc.nextLine();
		System.out.print("Roll no: ");
		int rollno = sc.nextInt();
		System.out.print("Age    : ");
		int age = sc.nextInt();
	}

	
}