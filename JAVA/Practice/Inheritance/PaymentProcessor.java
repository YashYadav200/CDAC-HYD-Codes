public class PaymentProcessor {
 public static void main(String[] args) {
 	
 
	Payment p = new PayPal();
	Payment c = new CreditCard();

	p.pay(50);
	c.pay(100);
  }
}