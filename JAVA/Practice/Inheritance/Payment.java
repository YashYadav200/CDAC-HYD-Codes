/*Interface with Multiple Implementations - Create an interface Payment with a method pay().
 Implement this interface in two classes CreditCardPayment and PaypalPayment.
 Write a PaymentProcessor class that uses the Payment interface to process payments.
*/
public interface Payment{
	public void pay(double a);

}