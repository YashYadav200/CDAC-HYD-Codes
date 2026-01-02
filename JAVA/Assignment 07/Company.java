public class Company extends Employee{

	int com_id;

    public Company(String name, String addr, int phn, int emp_id, String post, String company){
    	super(name,addr,phn,emp_id,post,company);
	
    }
	public void getdata(int com_id)
	{
	 	this.com_id = com_id;
	}

	public void setdata()
	{
		super.setdata();
	 	System.out.print("Company id :   "+com_id);
   }
  }