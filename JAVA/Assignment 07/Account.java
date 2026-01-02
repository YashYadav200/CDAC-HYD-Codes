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
public class Account{

    String accty;
    int accno;
    int minbal;
    int bal;
    int t = 5;
    int r = 2;

    public Account(String accty, int accno, int minbal,int bal){

        this.accty  = accty;
        this.accno  = accno;
        this.minbal = minbal;
        this.bal    = bal;
    }
    public int calInt() throws NegativeBalanceException {
        if (minbal > bal) {
            throw new NegativeBalanceException("Insufficent Balance");
            }
        return (bal*t*r)/100;
    } 
    public void setdata(){
    System.out.println("Account Type : "+accty+"\nAcvcount Number : "+accno+"\nMinimum Balance : "+minbal+"\nBalance : "+bal);

    }
}