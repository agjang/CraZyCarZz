
public class Payment {
	public int payment_amount;
	
	/* very simple object that details an instance of needing to pay for something */
	public Payment(int payment) {
		this.payment_amount = payment;
	}
	
	public void display_payment_information() {
		System.out.println("Your total due for this rental is: $" + payment_amount);
	}
}
