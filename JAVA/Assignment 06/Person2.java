/*Constructor Overloading: Extend the Person class from the previous problem and add
multiple constructors (default, parameterized, etc.) to initialize the attributes. Also, include a
method to display the details.
*/
public class Person2 extends Person {
     
     public Person2(){
     	System.out.println(" I am Default");
     }	

     public Person2(String name, int age, String country){
     	setdata( name,  age,  country);
     }
     public int Sum(int a ,int b){
     	
     	return  a +b;
     }
     public void view(){
     	getdata();
     }

}