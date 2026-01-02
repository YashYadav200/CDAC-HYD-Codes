public class PersonAddrees{
	
	protected String name;
	protected Address address; 

     public PersonAddrees(String name, Address address){
     	this.name = name;
     	this.address = address; 
     }
    public void disp(){
		System.out.print("Adress of "+name+ " is ");
		address.disp();
	}
	}