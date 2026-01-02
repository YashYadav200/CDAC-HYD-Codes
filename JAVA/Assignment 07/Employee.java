public class Employee extends Person{
	 int emp_id;
	 String post;
	 String company;

	 public Employee(String name, String addr, int phn, int emp_id, String post, String company){
	 	super(name,addr,phn);
	 	this.emp_id =emp_id;
	 	this.post = post;
	 	this.company= company;
	 
	 }
	 public void getdata(int emp_id, String post, String company){
	 	
	 	this.emp_id =emp_id;
	 	this.post = post;
	 	this.company= company;
	 }
	 public void setdata(){
	 	super.setdata2();
	 	System.out.println("Employee ID :  "+emp_id+"\nPOST :    "+post+"\nCompany :    "+company);
	 }
}