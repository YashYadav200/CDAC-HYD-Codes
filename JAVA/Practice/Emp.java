public class Emp{
	private String ename;
	private int e_id;
	protected double basic;
	private String city;

	public void setEmp(String ename,int e_id,double basic,String city){
		this.ename = ename;
		this.e_id = e_id;
		this.basic = basic;
		this.city = city;
	}
	public void disEmp(){
		System.out.println(" "+ename+" "+e_id+" "+basic+" "+city);
	}
	public void calSalary(){
		double salary = basic +(basic *(0.3+0.53+0.1));
		System.out.println(" Salary is : "+salary);

	}
}