/*Create a class Person with attributes name, age and country. Implement methods to set
and get these attributes. Create an object of this class, set its attributes, and print out the
details.*/
public class Person {

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

