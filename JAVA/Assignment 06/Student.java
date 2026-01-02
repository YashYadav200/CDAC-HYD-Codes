/*//Define a class of type Student that has rollno, name and age as private data members.
Define SetData() and GetData() as public member functions with appropriate functionality. Write
a program that declares 2 student objects, initializes the first at run-time and second by reading
from console, and then displays both student’s data.*/
public class Student{

	private String name;
	private int rollno;
	private int age;

	public Student(){
		
	}
	public Student(String name, int rollno, int age){
		 this.name = name;
      this.rollno = rollno;
      this.age = age;
	}
    public void getdata(String name, int rollno, int age){
      
      this.name = name;
      this.rollno = rollno;
      this.age = age;
      System.out.println("Name   : "+name);
	   	System.out.print("Roll No: "+rollno+"\n");
	  	System.out.println("Age    : "+age);
  
  }
    
}