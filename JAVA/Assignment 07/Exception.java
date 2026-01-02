public class Exception{
	public static void main(String[] args) {
	
	Account a = new Account("Saving", 323233, 100,1000);
	Customer c = new Customer("Yash", "Mumbai",213,534233,a);
	c.setdata();
	c.si();
	
 }
}
//String name, String addr, int id, int phn, Account a,
//String accty, int accno, int minbal,int bal