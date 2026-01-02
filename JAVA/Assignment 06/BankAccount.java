/*Static Variable: Create a class BankAccount with  accno, accType, Balance and static
variable interestRate. Initialize it using a static block. Implement methods to deposit and
withdraw funds. Create objects and display details.*/
public class BankAccount{
		protected int accno;
		protected String accType;
		protected double balance = 50000;
		public static double interestRate;
		 protected double amount;
		 static{
		 	 interestRate = 5.0;
				}
		//other static method 
		public static double intrest(double balance){
			return (balance * interestRate / 100);
		}


		public BankAccount (int accno, String accType){
			this.accno = accno;
			this.accType = accType;
		}
		public void Deposite(double amount){
			this.balance += amount; 
				}
		public void Withdraw(double amount){
			if (balance < amount) {
				System.out.println("Insufficent Balance!!!");
			}
			else{
				this.balance -= amount ;
			}
		}
		public void display(){  
		    System.out.println("Account No: " + accno);
    		System.out.println("Account Type: " + accType);
    		System.out.println("Balance: " + balance);
   			System.out.println("Interest Rate: " + interestRate);
			}
		public void setdata(double amount){
			System.out.println(" Amount is "+amount);
	            }
			}
		
	