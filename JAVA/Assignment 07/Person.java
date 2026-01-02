/*2. Define a base class Person and a derived class employee with single inheritance. Define
SetData() member functions in each of the class with different signatures to set the data
members and demonstrate overloading of member functions. Define GetData() member
functions in each of the class with same signatures to display data and demonstrate overriding
of member functions.*/
public class Person{
	String name;
	String addr;
	int phn;

	public Person(String name, String addr, int phn){
		this.name = name;
		this.addr = addr;
		this.phn = phn;
	}
	public void getdata(String name, String addr, int phn){
		this.name = name;
		this.addr = addr;
		this.phn = phn;	
	}
	public void setdata2(){

		System.out.println("Name :    "+name+"\nAddress :    "+addr+"\nPhone No :    "+phn);
	}
} 