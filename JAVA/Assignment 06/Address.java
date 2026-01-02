/*Composition and Aggregation: Create a class Address with attributes street, city, and
state. Then create a class Person with attributes name and an Address object. 
*/
public class Address{
	protected String street;
	protected String city;
	protected String state;

	public Address(String street, String city, String state){
		this.street = street;
		this.city = city;
		this.state = state;
	}
	public void disp(){
		System.out.print(": Street "+street+","+city+","+state);
	}
}