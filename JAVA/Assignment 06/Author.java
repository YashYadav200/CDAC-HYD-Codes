/*Implement a Java program that models a Library. Create classes for Library, Book, and
Author. Ensure that the Library class aggregates a collection of Book objects, and each Book
object has an aggregation relationship with an Author object.
*/
public class Author{
	protected String authName;
	protected String nat;

	public void setdata (String authName, String nat){
		this.authName = authName;
		this.nat = nat;
	}
	public void getdata(){
		System.out.println(" "+authName+","+nat);
	}

}