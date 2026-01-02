/*Problem 1: Create Customer class with the relevant information like name, address,
 id, phone no etc. Write a parameterized constructor and relevant methods (disp(),)
  appropriately.         
Create Account class with account type, account number, minimum balance etc., 
Write calculateInterest method
 (use simple interest – assume time and rate appropriately).
Create a user defined exception class “NegativeBalanceException” and 
throw that exception when there is negative balance while calculating the interest.
Use Account class in Customer class display the details of customer with account
 information. (No Inheritance – use association only)
 */
public class Customer{

	String name;
	String addr;
	int id;
	int phn;
	int intrest;
	Account a;

	public Customer(String name, String addr, int id, int phn, Account a){
		this.a    = a;
		this.name = name;
		this.addr = addr;
		this.id   = id;
		this.phn  = phn;
		this.intrest = intrest;
	}
    
    public void si() throws NegativeBalanceException  {
        try{
    		intrest = a.calInt();
    	   }
    	catch(NegativeBalanceException e){

    		System.out.println(e.getMessage());
    		intrest = 0;
    	}
    	System.out.println("Intrest is "+intrest);
    }


	public void setdata(){
	System.out.println("Name: "+name+"\nAddress : "+addr+"\nID : "+id+"\nPhone No : "+phn);
	a.setdata();
	}
}