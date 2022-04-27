
public class Hire {
	private int start_date;
	private int hire_length;
	private int return_date;
	private boolean isFee = false;
	private int damage_fee = 0;
	private int extension_fee = 0;
	private Car carHired;
	
	public Hire(Car car, int start_date, int return_date) {
		this.start_date = start_date;
		this.return_date = return_date;
		if(start_date > return_date) {
			this.hire_length = (365 + return_date) - start_date;
		}
		else {
			this.hire_length = return_date - start_date;
		}
		this.carHired = car;
	}
	
	public void extend_hire(int num_days) {
		this.return_date += num_days;
		if(return_date > 365) {
			this.return_date -= 365;
		}
		this.extension_fee = (num_days) * 100;
	}
}
