
public class Car_Park {
	private int ID;
	private String address;
	private String phone;
	public int Capacity;
	
	public Car_Park(int ID, String address, String phone_number, int bottleneck) {
		this.ID = ID;
		this.address = address;
		this.phone = phone_number;
		this.Capacity = bottleneck;
	}
}
