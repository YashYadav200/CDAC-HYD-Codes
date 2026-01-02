public class NegativeBalanceException extends RuntimeException{

	public NegativeBalanceException(String e){
		super("Insufficent Balance");
	}


}