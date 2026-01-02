/*Using this: Modify the Person class to include a method that displays the name and age
of the object. Use this keyword to differentiate between class variables and method parameters.
Implement a method to compare two Person objects based on their age.*/

public class PersonCmp extends Person {

	private String name;
	private String country;
	private int age; 
    
    public void setdata(String name, int age, String country){
   	this.name = name;
   	this.age = age;
   	this.country = country;
   }
   public void getdata(){
   System.out.println("Name : "+name+" Age :"+age+" country"+country);
   }
    public int getAge(){
    return this.age;
  }
    public void setAge(){
    System.out.println(name+" is Elder");
  }
  }

