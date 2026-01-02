public class Emp extends Person{
	protected int e_id;
	protected String cmp;
	protected String post;

	public Emp(String name, String phn ,int age, String addrs,int e_id, String cmp,String post){
		
		super(name,phn,age, addrs);
		this.e_id = e_id;
		this.cmp = cmp;
		this.post = post;
	}

	public void getdetail(){
		System.out.println("Name : "+name+"\nPhone : "+phn+"\nAge : "+age+"\nAdrees : "+addrs);
		System.out.println("Employee ID : "+e_id+"\nCompany : "+cmp+"\nPost: "+post);
	}

}