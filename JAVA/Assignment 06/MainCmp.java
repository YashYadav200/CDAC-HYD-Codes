public class MainCmp{
	public static void main(String[] args) {
		
		Person p = new Person();
		PersonCmp p1 = new PersonCmp();
		p1.setdata("YASH",21,"INDIA");
		p.setdata("RAM",23,"INDIA");
		p1.getdata();
		p.getdata();
		if (p.getAge() > p1.getAge()) {
   		   p.setAge();
		}    
  		else {
  		  p1.setAge();
		}

		System.out.println("------------------------------------");
		
	

		
	}
}